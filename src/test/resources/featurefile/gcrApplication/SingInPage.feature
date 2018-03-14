@jagatheshwaran
@12/03/2018
@tag
Feature: Sign in to the GCR application

@tag1
Scenario: Verify customer able to Sign in to the GCR application


Given customer is on GCR Login Page
When customer enters email address as "testjaga277171@gmail.com"
And customer enters password as "jaga@12345"
And customer clicks on sign in button
Then sign in to the GCR Application is successful
	


