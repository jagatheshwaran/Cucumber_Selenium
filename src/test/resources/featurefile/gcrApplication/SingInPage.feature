@jagatheshwaran
@12/03/2018
@tag
Feature: Sign in to the GCR application

@tag1
Scenario Outline: Verify customer able to Sign in to the GCR application


Given customer is on GCR Login Page
When customer enters email address as "<Email>"
And customer enters password as "<Password>"
And customer clicks on sign in button
Then sign in to the GCR Application is successful
	

Examples: 
 
|Email|Password|
|jaga14032018@gmail.com|jaga@12345|

