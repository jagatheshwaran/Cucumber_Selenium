$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/gcrApplication/SingInPage.feature");
formatter.feature({
  "line": 4,
  "name": "Sign in to the GCR application",
  "description": "",
  "id": "sign-in-to-the-gcr-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@jagatheshwaran"
    },
    {
      "line": 2,
      "name": "@12/03/2018"
    },
    {
      "line": 3,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Verify customer able to Sign in to the GCR application",
  "description": "",
  "id": "sign-in-to-the-gcr-application;verify-customer-able-to-sign-in-to-the-gcr-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "customer is on GCR Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "customer enters email address as \"\u003cEmail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "customer enters password as \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "customer clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "sign in to the GCR Application is successful",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "sign-in-to-the-gcr-application;verify-customer-able-to-sign-in-to-the-gcr-application;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ],
      "line": 19,
      "id": "sign-in-to-the-gcr-application;verify-customer-able-to-sign-in-to-the-gcr-application;;1"
    },
    {
      "cells": [
        "jaga14032018@gmail.com",
        "jaga@12345"
      ],
      "line": 20,
      "id": "sign-in-to-the-gcr-application;verify-customer-able-to-sign-in-to-the-gcr-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5359602998,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify customer able to Sign in to the GCR application",
  "description": "",
  "id": "sign-in-to-the-gcr-application;verify-customer-able-to-sign-in-to-the-gcr-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@jagatheshwaran"
    },
    {
      "line": 2,
      "name": "@12/03/2018"
    },
    {
      "line": 3,
      "name": "@tag"
    },
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "customer is on GCR Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "customer enters email address as \"jaga14032018@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "customer enters password as \"jaga@12345\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "customer clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "sign in to the GCR Application is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInPageDefinition.customer_is_on_GCR_Login_Page()"
});
formatter.result({
  "duration": 7028762981,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jaga14032018@gmail.com",
      "offset": 34
    }
  ],
  "location": "SignInPageDefinition.customer_enters_email_address_as(String)"
});
formatter.result({
  "duration": 336713524,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jaga@12345",
      "offset": 29
    }
  ],
  "location": "SignInPageDefinition.customer_enters_password_as(String)"
});
formatter.result({
  "duration": 184388435,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageDefinition.customer_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 1937533020,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageDefinition.sign_in_to_the_GCR_Application_is_successful()"
});
formatter.result({
  "duration": 70328624,
  "status": "passed"
});
formatter.after({
  "duration": 806393218,
  "status": "passed"
});
});