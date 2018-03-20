@jagatheshwaran
@Created_13/03/2018
@Modified_19/03/2018


@tag
Feature: Create Account and Register into the GCR application

@tag1
Scenario Outline: 1.Verify customer able to create new account and register into the GCR application with valid details


Given customer is on GCR Login Page
When customer click on New Customer Continue button
When customer clicks Gender as "<Gender>"
And customer enters FirstName as "<FName>"
And customer enters LastName as "<LName>"
And customer enters BirthDate as "<BirthDate>"
And customer enters EmailAddress as "<Email>"
And customer enters Company Name as "<Company>"
And customer enters Address as "<Address>"
And customer enters Postalcode as "<Postcode>"
And customer enters City as "<City>"
And customer enters State as "<State>"
And customer selects Country as "<Country>"
And customer enters Telephone Number as "<Phone>"
And customer enters Password as "<Password>"
And customer enters Confirm Passowrd as "<ConfirmPassword>"
And customer clicks on Submit button
Then Account Creation is Successful 
	

Examples: 
 
|Gender|FName|LName|BirthDate|Email|Company|Address|Postcode|City|State|Country|Phone|Password|ConfirmPassword|
|Male|Jaga|Waran|03/03/2018|jaga21032018@gmail.com|Software Company|Sholinganallur|600119|Chennai|TamilNadu|India|9876543210|jaga@12345|jaga@12345|


@tag2
Scenario Outline: 2.Verify customer is not able to create new account and register into the GCR application with invalid details


Given customer is on GCR Login Page
When customer click on New Customer Continue button
When customer clicks Gender as "<Gender>"
And customer enters FirstName as "<FName>"
And customer enters LastName as "<LName>"
And customer enters BirthDate as "<BirthDate>"
And customer enters EmailAddress as "<Email>"
And customer enters Company Name as "<Company>"
And customer enters Address as "<Address>"
And customer enters Postalcode as "<Postcode>"
And customer enters City as "<City>"
And customer enters State as "<State>"
And customer selects Country as "<Country>"
And customer enters Telephone Number as "<Phone>"
And customer enters Password as "<Password>"
And customer enters Confirm Passowrd as "<ConfirmPassword>"
And customer clicks on Submit button
Then Account Creation is UnSuccessful 
	

Examples: 
 
|Gender|FName|LName|BirthDate|Email|Company|Address|Postcode|City|State|Country|Phone|Password|ConfirmPassword|
|Male|Jaga|Waran|03/03/2018|jaga21032018@gmail.com|Software Company|Sholinganallur|600119|Chennai|TamilNadu|India|9876543210|jaga@12345|jaga@12345|


      
