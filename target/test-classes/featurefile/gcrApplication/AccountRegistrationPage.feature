@jagatheshwaran
@13/03/2018
@tag
Feature: Create Account and Register into the GCR application

@tag1
Scenario: Verify customer able to create new account and register into the GCR application


Given customer is on GCR Login Page
When customer click on New Customer Continue button
When customer clicks Gender as "Male"
And customer enters FirstName as "jaga"
And customer enters LastName as "waran"
And customer enters BirthDate as "03/03/2018"
And customer enters EmailAddress as "testjaga1332018@gmail.com"
And customer enters Company Name as "Softwre Company"
And customer enters Address as "Sholinganallur"
And customer enters Postalcode as "600119"
And customer enters City as "Chennai"
And customer enters State as "TamilNadu"
And customer selects Country as "India"
And customer enters Telephone Number as "9876543210"
And customer enters Password as "jaga@12345"
And customer enters Confirm Passowrd as "jaga@12345"
And customer clicks on Submit button
Then Account Creation is Successful 
	


