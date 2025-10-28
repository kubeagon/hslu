// ==UserScript==
// @name         Use Admin URL for server status
// @namespace    http://tampermonkey.net/
// @version      1.1
// @description  Use admin url to fetch server status when #leForm is submitted
// @match        https://shepherd.hs25.isf.hslu-edu.ch/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

(function() {
  'use strict';

  // Visual cue so you know it loaded
  try { document.body.style.border = "4px solid red"; } catch (e) {}
  console.log("✅ TM: Use Admin URL script injected at", new Date().toISOString());

  // Admin endpoint and payload (adjust if needed)
  const ADMIN_URL = "4a1bc73dd68f64107db3bbc7ee74e3f1336d350c4e1e51d4eda5b52dddf86c992";
  const ADMIN_PAYLOAD = { userData: "4816283" };

  // Wait for jQuery and DOM-ready
  function waitForjQueryAndForm() {
    if (!window.jQuery) {
      // keep trying until jQuery is available
      setTimeout(waitForjQueryAndForm, 250);
      return;
    }
    const $ = window.jQuery;

    $(function() { // DOM ready
      const $form = $("#leForm");
      if ($form.length === 0) {
        console.warn("TM: #leForm not found - will not attach handler.");
        return;
      }

      // Avoid double-binding
      $form.off("submit.useAdminUrl");

      $form.on("submit.useAdminUrl", function(e) {
        e.preventDefault();
        console.log("TM: #leForm submit intercepted — calling admin URL...");

        // UX: hide error, hide submit, show loading like the original page does
        try { $("#badData").hide("fast"); } catch(e) {}
        try { $("#submitButton").hide("fast"); } catch(e) {}
        try { $("#loadingSign").show("slow"); } catch(e) {}

        // Hide results, then perform admin AJAX
        try {
          $("#resultsDiv").hide("slow", function() {
            // Perform async POST to the admin URL
            $.ajax({
              type: "POST",
              url: ADMIN_URL,
              data: ADMIN_PAYLOAD
            })
            .done(function(responseText, textStatus, jqXHR) {
              console.log("TM: admin request done, status:", jqXHR.status);
              $("#resultsDiv").html(responseText);
            })
            .fail(function(jqXHR, textStatus, errorThrown) {
              console.warn("TM: admin request failed:", jqXHR.status, textStatus, errorThrown);
              $("#resultsDiv").html("<p> An Error Occurred: " + jqXHR.status + " " + jqXHR.statusText + "</p>");
            })
            .always(function() {
              // Show results and restore UI
              $("#resultsDiv").show("slow", function() {
                $("#loadingSign").hide("fast", function() {
                  $("#submitButton").show("slow");
                });
              });
            });
          });
        } catch (err) {
          console.error("TM: Unexpected error during admin call:", err);
          // restore UI on error
          try { $("#loadingSign").hide("fast"); } catch(e) {}
          try { $("#submitButton").show("slow"); } catch(e) {}
        }
      });

      console.log("✅ TM: submit handler attached to #leForm (admin URL will be used).");
    });
  }

  waitForjQueryAndForm();
})();
