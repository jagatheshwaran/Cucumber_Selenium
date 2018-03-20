package com.jaga.cucumber.framework.stepdefinition.SignIn;

import com.jaga.cucumber.framework.configurationreader.ObjectReader;
import com.jaga.cucumber.framework.helper.testbase.TestBase;
import com.jaga.cucumber.framework.pagelibrary.SignInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Jagatheshwaran
 * @since 12/3/2018
 * @Modified - 19/03/2018
 *
 */
public class SignInPageDefinition {

	SignInPage signinPage = new SignInPage(TestBase.driver);

	@Given("^customer is on GCR Login Page$")
	public void customer_is_on_GCR_Login_Page() throws Throwable {

		TestBase.driver.get(ObjectReader.reader.getWebsite());
		Thread.sleep(3000);
	}

	@When("^customer enters email address as \"([^\"]*)\"$")
	public void customer_enters_email_address_as(String arg1) throws Throwable {
		signinPage.enterEmail(arg1);
	}

	@When("^customer enters password as \"([^\"]*)\"$")
	public void customer_enters_password_as(String arg1) throws Throwable {
		signinPage.enterPassword(arg1);
	}

	@When("^customer clicks on sign in button$")
	public void customer_clicks_on_sign_in_button() throws Throwable {
		signinPage.clickSignIn();

	}

	@Then("^sign in to the GCR Application is successful$")
	public void sign_in_to_the_GCR_Application_is_successful() throws Throwable {
		signinPage.verifySuccessLoginMessage();
	}

	@Then("^sign in to the GCR Application is Unsuccessful$")
	public void sign_in_to_the_GCR_Application_is_Unsuccessful() throws Throwable {
		signinPage.verifyLoginErrorMessage();
	}

}
