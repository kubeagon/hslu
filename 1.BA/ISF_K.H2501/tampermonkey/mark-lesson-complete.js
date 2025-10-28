// ==UserScript==
// @name         Mark Lesson as Complete
// @namespace    http://tampermonkey.net/
// @version      1.3
// @description  Mark lesson as complete (client-side only, no server call)
// @match        https://shepherd.hs25.isf.hslu-edu.ch/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

/* global $ */
(function() {
  'use strict';

  // Visual cue so you know it loaded
  document.body.style.border = "4px solid red";

  // CRITICAL: Override document.cookie setter to prevent server from setting wrong value
  let originalCookieDescriptor = Object.getOwnPropertyDescriptor(Document.prototype, 'cookie') || 
                                 Object.getOwnPropertyDescriptor(HTMLDocument.prototype, 'cookie');
  
  if (originalCookieDescriptor && originalCookieDescriptor.set) {
    Object.defineProperty(document, 'cookie', {
      get: originalCookieDescriptor.get,
      set: function(value) {
        // If server tries to set lessonComplete=lessonNotComplete, intercept it
        if (value.includes('lessonComplete=lessonNotComplete')) {
          console.log("🚫 Intercepted server cookie attempt:", value);
          console.log("✅ Setting correct cookie instead");
          originalCookieDescriptor.set.call(this, 'lessonComplete=lessonComplete; path=/');
          return;
        }
        // Otherwise, allow normal cookie setting
        originalCookieDescriptor.set.call(this, value);
      }
    });
    console.log("🔧 Cookie setter override installed");
  }

  // Intercept form submissions and button clicks that might reset the cookie
  function interceptFormSubmissions() {
    // Prevent form submission entirely
    withJQ(function($) {
      $("#leForm").off('submit').on('submit', function(e) {
        e.preventDefault();
        e.stopImmediatePropagation();
        console.log("🚫 Intercepted form submission");
        
        // Immediately ensure cookie is correct
        document.cookie = "lessonComplete=lessonComplete; path=/";
        
        // Update UI to show completion without server call
        markLessonComplete();
        return false;
      });
      
      // Also intercept any "Complete This Lesson" buttons
      $('button, input[type="submit"], a').filter(function() {
        return $(this).text().toLowerCase().includes('complete') || 
               $(this).val() && $(this).val().toLowerCase().includes('complete');
      }).off('click').on('click', function(e) {
        e.preventDefault();
        e.stopImmediatePropagation();
        console.log("🚫 Intercepted completion button click");
        
        // Force correct cookie and UI state
        document.cookie = "lessonComplete=lessonComplete; path=/";
        markLessonComplete();
        return false;
      });
    });
  }

  // Utility: safe access to jQuery if present
  function withJQ(fn) {
    if (typeof $ !== 'undefined' && $) {
      try { fn($); return; } catch(e){ console.error(e); }
    }
    // If jQuery not ready, try again shortly (but don't loop forever)
    var tries = 0;
    var ti = setInterval(function(){
      if (typeof $ !== 'undefined' && $) {
        clearInterval(ti);
        try { fn($); } catch(e){ console.error(e); }
      }
      tries++;
      if (tries > 20) clearInterval(ti);
    }, 200);
  }

  // Core action: mark completed (client-side)
  function markLessonComplete() {
    try {
      // 1) set cookie similar to the page's JS
      // note: path=/ so it is visible to whole site
      document.cookie = "lessonComplete=lessonComplete; path=/";
      console.log("✅ Cookie set: lessonComplete=lessonComplete");

      // 2) set the global counter variable to 3 (script shows hint at counter == 3)
      try { window.counter = 3; } catch(e){ console.warn("Could not set window.counter", e); }

      // 3) update UI (resultsDiv, loadingSign, submitButton, hintButton)
      withJQ(function($) {
        // prefer jQuery animations if available
        $("#resultsDiv").html("<p><strong>Lesson completed (client-side test)</strong></p>").show();
        $("#loadingSign").hide();
        $("#submitButton").show();
        $("#hintButton").show();
        console.info("Lesson marked complete (jQuery path).");
      });

      // 4) fallback to plain DOM in case jQuery missing
      var r = document.getElementById("resultsDiv");
      if (r) { r.innerHTML = "<p><strong>Lesson completed (client-side test)</strong></p>"; r.style.display = "block"; }
      var ls = document.getElementById("loadingSign");
      if (ls) ls.style.display = "none";
      var sb = document.getElementById("submitButton");
      if (sb) sb.style.display = "inline-block";
      var hb = document.getElementById("hintButton");
      if (hb) hb.style.display = "inline-block";

      console.log("Lesson completion steps executed (client-side).");
    } catch (err) {
      console.error("Error while marking lesson complete:", err);
    }
  }

  // Run once on load
  markLessonComplete();
  
  // Set up form/button interception
  interceptFormSubmissions();
  
  // Also retry interception after a delay in case elements load later
  setTimeout(interceptFormSubmissions, 2000);

  // Continuous monitoring to ensure cookie stays correct
  setInterval(function() {
    if (!document.cookie.includes('lessonComplete=lessonComplete')) {
      console.log("🔄 Cookie check failed, fixing...");
      document.cookie = "lessonComplete=lessonComplete; path=/";
      markLessonComplete(); // Also refresh UI
    }
  }, 1000); // Check every second

  // Expose helper on window so you can trigger manually from console:
  window.markLessonComplete = markLessonComplete;

  // Optional: if the page is SPA-ish and re-renders, observe the body and reapply automatically
  // (keeps things consistent during navigation in single-page apps)
  try {
    var observer = new MutationObserver(function(mutations){
      // simple heuristic: if resultsDiv or hintButton is removed/hidden, reapply
      var r = document.getElementById("resultsDiv");
      var hb = document.getElementById("hintButton");
      var needs = false;
      if (r && (r.style.display === "none" || r.innerHTML.trim() === "")) needs = true;
      if (hb && (hb.style.display === "none" || hb.style.visibility === "hidden")) needs = true;
      if (needs) {
        // small debounce
        setTimeout(markLessonComplete, 150);
      }
    });
    observer.observe(document.body, { childList: true, subtree: true });
  } catch (e) {
    // ignore if not allowed
  }

})();
