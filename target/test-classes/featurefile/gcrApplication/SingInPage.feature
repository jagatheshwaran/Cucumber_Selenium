@jagatheshwaran
@Created_12/03/2018
@Modified_19/03/2018


@tag
Feature: Sign in to the GCR application

@tag1
Scenario Outline: 1.Verify customer able to Sign in to the GCR application with valid credentials


Given customer is on GCR Login Page
When customer enters email address as "<Email>"
And customer enters password as "<Password>"
And customer clicks on sign in button
Then sign in to the GCR Application is successful
	

Examples: 
 
|Email|Password|
|jaga22032018@gmail.com|jaga@12345|


@tag2
Scenario Outline: 2.Verify customer is not able to Sign in to the GCR application with invalid credentials


Given customer is on GCR Login Page
When customer enters email address as "<Email>"
And customer enters password as "<Password>"
And customer clicks on sign in button
Then sign in to the GCR Application is Unsuccessful
	

Examples: 
 
|Email|Password|
|jaga22032018@gmail.com|jaga@1234|

