// ==UserScript==
// @name         Allow negative numbers (disable validation)
// @namespace    http://tampermonkey.net/
// @version      1.3
// @description  Remove client-side validation that blocks negative numbers
// @match        https://shepherd.hs25.isf.hslu-edu.ch/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

(function () {
  'use strict';

  // Visual cue so you know it loaded
  document.body.style.border = "4px solid red";
  console.log("✅ TM: negative-number bypass script injected at", new Date().toISOString());

  function patchValidation($) {
    const $form = $("#leForm");
    if ($form.length === 0) return false;

    console.log("🔧 Found #leForm, patching submit handler...");

    // Remove existing handlers
    $form.off("submit");

    // Replace with our own handler (same as page’s, but without number < 0 check)
    $form.on("submit", function (e) {
      e.preventDefault();
      var number = $("#numberBox").val();
      var theError = "";

      if (number.length === 0) {
        console.log("No Number Submitted");
        theError = "A number must be submitted";
      } else {
        // ✅ skip the negative-number block
        $("#badData").hide("fast");
        $("#submitButton").hide("fast");
        $("#loadingSign").show("slow");
        $("#resultsDiv").hide("slow", function () {
          $.ajax({
            type: "POST",
            url: "4d8d50a458ca5f1f7e2506dd5557ae1f7da21282795d0ed86c55fefe41eb874f",
            data: { userdata: number },
            async: false
          }).done(function (resp) {
            $("#resultsDiv").html(resp);
          }).fail(function (xhr) {
            $("#resultsDiv").html("<p> An Error Occurred: " + xhr.status + " " + xhr.statusText + "</p>");
          }).always(function () {
            $("#resultsDiv").show("slow", function () {
              $("#loadingSign").hide("fast", function () {
                $("#submitButton").show("slow");
              });
            });
          });
        });
      }

      if (theError.length > 0) {
        $("#badData").html("<p> An Error Occurred:" + theError + "</p>");
        $("#badData").show("slow");
      }
    });

    console.log("✅ Negative number validation removed!");
    return true;
  }

  function waitForJQ() {
    if (window.jQuery) {
      const $ = window.jQuery;
      const t = setInterval(() => {
        if (patchValidation($)) clearInterval(t);
      }, 500);
    } else {
      console.warn("⏳ Waiting for jQuery...");
      setTimeout(waitForJQ, 500);
    }
  }

  waitForJQ();
})();
