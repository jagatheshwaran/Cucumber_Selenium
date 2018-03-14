$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/gcrApplication/AccountRegistrationPage.feature");
formatter.feature({
  "line": 2,
  "name": "Create Account and Register into the GCR application",
  "description": "",
  "id": "create-account-and-register-into-the-gcr-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 11532477053,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify customer able to create new account and register into the GCR application",
  "description": "",
  "id": "create-account-and-register-into-the-gcr-application;verify-customer-able-to-create-new-account-and-register-into-the-gcr-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "customer is on GCR Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "customer click on New Customer Continue button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "customer clicks Gender as \"Male\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "customer enters FirstName as \"jaga\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "customer enters LastName as \"waran\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "customer enters BirthDate as \"03/03/2018\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "customer enters EmailAddress as \"testjaga1332018@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "customer enters Company Name as \"Softwre Company\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "customer enters Address as \"Sholinganallur\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "customer enters Postalcode as \"600119\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "customer enters City as \"Chennai\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "customer enters State as \"TamilNadu\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "customer selects Country as \"India\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "customer enters Telephone Number as \"9876543210\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "customer enters Password as \"jaga@12345\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "customer enters Confirm Passowrd as \"jaga@12345\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "customer clicks on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Account Creation is Successful",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountCreationPageDefinition.customer_is_on_GCR_Login_Page()"
});
formatter.result({
  "duration": 14865700586,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationPageDefinition.customer_click_on_New_Customer_Continue_button()"
});
formatter.result({
  "duration": 2606055704,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Male",
      "offset": 27
    }
  ],
  "location": "AccountCreationPageDefinition.customer_clicks_Gender_as(String)"
});
formatter.result({
  "duration": 104941165,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jaga",
      "offset": 30
    }
  ],
  "location": "AccountCreationPageDefinition.customer_enters_FirstName_as(String)"
});
formatter.result({
  "duration": 170007678,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "waran",
      "offset": 29
    }
  ],
  "location": "AccountCreationPageDefinition.customer_enters_LastName_as(String)"
});
formatter.result({
  "duration": 135147842,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "03/03/2018",
      "offset": 30
    }
  ],
  "location": "AccountCreationPageDefinition.customer_enters_BirthDate_as(String)"
});
formatter.result({
  "duration": 426208509,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testjaga1332018@gmail.com",
      "offset": 33
    }
  ],
  "location": "AccountCreationPageDefinition.customer_enters_EmailAddress_as(String)"
});
formatter.result({
  "duration": 486861339,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Softwre Company",
      "offset": 33
    }
  ],
  "location": "AccountCreationPageDefinition.customer_enters_Company_Name_as(String)"
});
formatter.result({
  "duration": 274958129,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sholinganallur",
      "offset": 28
    }
  ],
  "location": "AccountCreationPageDefinition.customer_enters_Address_as(String)"
});
formatter.result({
  "duration": 230614079,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "600119",
      "offset": 31
    }
  ],
  "location": "AccountCreationPageDefinition.customer_enters_Postalcode_as(String)"
});
formatter.result({
  "duration": 151171207,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chennai",
      "offset": 25
    }
  ],
  "location": "AccountCreationPageDefinition.customer_enters_City_as(String)"
});
formatter.result({
  "duration": 194274870,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TamilNadu",
      "offset": 26
    }
  ],
  "location": "AccountCreationPageDefinition.customer_enters_State_as(String)"
});
formatter.result({
  "duration": 181736120,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 29
    }
  ],
  "location": "AccountCreationPageDefinition.customer_selects_Country_as(String)"
});
formatter.result({
  "duration": 331083403,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9876543210",
      "offset": 37
    }
  ],
  "location": "AccountCreationPageDefinition.customer_enters_Telephone_Number_as(String)"
});
formatter.result({
  "duration": 211777608,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jaga@12345",
      "offset": 29
    }
  ],
  "location": "AccountCreationPageDefinition.customer_enters_Password_as(String)"
});
formatter.result({
  "duration": 233403726,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jaga@12345",
      "offset": 37
    }
  ],
  "location": "AccountCreationPageDefinition.customer_enters_Confirm_Passowrd_as(String)"
});
formatter.result({
  "duration": 205397781,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationPageDefinition.customer_clicks_on_Submit_button()"
});
formatter.result({
  "duration": 6079809416,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationPageDefinition.account_Creation_is_Successful()"
});
formatter.result({
  "duration": 69853094,
  "status": "passed"
});
formatter.after({
  "duration": 50827,
  "status": "passed"
});
});