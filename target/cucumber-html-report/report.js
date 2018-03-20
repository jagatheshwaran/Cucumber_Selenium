$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/gcrApplication/SingInPage.feature");
formatter.feature({
  "line": 7,
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
      "name": "@Created_12/03/2018"
    },
    {
      "line": 3,
      "name": "@Modified_19/03/2018"
    },
    {
      "line": 6,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "1.Verify customer able to Sign in to the GCR application with valid credentials",
  "description": "",
  "id": "sign-in-to-the-gcr-application;1.verify-customer-able-to-sign-in-to-the-gcr-application-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "customer is on GCR Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "customer enters email address as \"\u003cEmail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "customer enters password as \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "customer clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "sign in to the GCR Application is successful",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "sign-in-to-the-gcr-application;1.verify-customer-able-to-sign-in-to-the-gcr-application-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ],
      "line": 22,
      "id": "sign-in-to-the-gcr-application;1.verify-customer-able-to-sign-in-to-the-gcr-application-with-valid-credentials;;1"
    },
    {
      "cells": [
        "jaga32018@gmail.com",
        "jaga@12345"
      ],
      "line": 23,
      "id": "sign-in-to-the-gcr-application;1.verify-customer-able-to-sign-in-to-the-gcr-application-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 19476785233,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "1.Verify customer able to Sign in to the GCR application with valid credentials",
  "description": "",
  "id": "sign-in-to-the-gcr-application;1.verify-customer-able-to-sign-in-to-the-gcr-application-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@jagatheshwaran"
    },
    {
      "line": 6,
      "name": "@tag"
    },
    {
      "line": 2,
      "name": "@Created_12/03/2018"
    },
    {
      "line": 9,
      "name": "@tag1"
    },
    {
      "line": 3,
      "name": "@Modified_19/03/2018"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "customer is on GCR Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "customer enters email address as \"jaga32018@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "customer enters password as \"jaga@12345\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "customer clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "sign in to the GCR Application is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInPageDefinition.customer_is_on_GCR_Login_Page()"
});
formatter.result({
  "duration": 7453263791,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jaga32018@gmail.com",
      "offset": 34
    }
  ],
  "location": "SignInPageDefinition.customer_enters_email_address_as(String)"
});
formatter.result({
  "duration": 351790427,
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
  "duration": 151877712,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageDefinition.customer_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 2845579930,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageDefinition.sign_in_to_the_GCR_Application_is_successful()"
});
formatter.result({
  "duration": 211600615,
  "status": "passed"
});
formatter.after({
  "duration": 1153449947,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 27,
  "name": "2.Verify customer is not able to Sign in to the GCR application with invalid credentials",
  "description": "",
  "id": "sign-in-to-the-gcr-application;2.verify-customer-is-not-able-to-sign-in-to-the-gcr-application-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "customer is on GCR Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "customer enters email address as \"\u003cEmail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "customer enters password as \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "customer clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "sign in to the GCR Application is Unsuccessful",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "sign-in-to-the-gcr-application;2.verify-customer-is-not-able-to-sign-in-to-the-gcr-application-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ],
      "line": 39,
      "id": "sign-in-to-the-gcr-application;2.verify-customer-is-not-able-to-sign-in-to-the-gcr-application-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "jaga32018@gmail.com",
        "jaga@1234"
      ],
      "line": 40,
      "id": "sign-in-to-the-gcr-application;2.verify-customer-is-not-able-to-sign-in-to-the-gcr-application-with-invalid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4886815764,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "2.Verify customer is not able to Sign in to the GCR application with invalid credentials",
  "description": "",
  "id": "sign-in-to-the-gcr-application;2.verify-customer-is-not-able-to-sign-in-to-the-gcr-application-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@jagatheshwaran"
    },
    {
      "line": 6,
      "name": "@tag"
    },
    {
      "line": 26,
      "name": "@tag2"
    },
    {
      "line": 2,
      "name": "@Created_12/03/2018"
    },
    {
      "line": 3,
      "name": "@Modified_19/03/2018"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "customer is on GCR Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "customer enters email address as \"jaga32018@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "customer enters password as \"jaga@1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "customer clicks on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "sign in to the GCR Application is Unsuccessful",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInPageDefinition.customer_is_on_GCR_Login_Page()"
});
formatter.result({
  "duration": 6336442450,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jaga32018@gmail.com",
      "offset": 34
    }
  ],
  "location": "SignInPageDefinition.customer_enters_email_address_as(String)"
});
formatter.result({
  "duration": 342085779,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jaga@1234",
      "offset": 29
    }
  ],
  "location": "SignInPageDefinition.customer_enters_password_as(String)"
});
formatter.result({
  "duration": 195586504,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageDefinition.customer_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 1584260163,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageDefinition.sign_in_to_the_GCR_Application_is_Unsuccessful()"
});
formatter.result({
  "duration": 109243143,
  "status": "passed"
});
formatter.after({
  "duration": 848625675,
  "status": "passed"
});
});