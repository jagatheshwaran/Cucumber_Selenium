package com.jaga.cucumber.framework.stepdefinition.AccountCreation;

import com.jaga.cucumber.framework.configurationreader.ObjectReader;
import com.jaga.cucumber.framework.helper.testbase.TestBase;
import com.jaga.cucumber.framework.pagelibrary.AccountRegistrationPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Jagatheshwaran
 * @since 13/3/2018
 * @Modified - 19/03/2018
 *
 */
public class AccountCreationPageDefinition {

	AccountRegistrationPage accountRegistrationPage = new AccountRegistrationPage(TestBase.driver);

	@Given("^customer is on GCR Login Page$")
	public void customer_is_on_GCR_Login_Page() throws Throwable {
		TestBase.driver.get(ObjectReader.reader.getWebsite());
		Thread.sleep(3000);
	}

	@When("^customer click on New Customer Continue button$")
	public void customer_click_on_New_Customer_Continue_button() throws Throwable {
		accountRegistrationPage.newCustomerContinue();

	}

	@When("^customer clicks Gender as \"([^\"]*)\"$")
	public void customer_clicks_Gender_as(String arg1) throws Throwable {
		accountRegistrationPage.clickGender();
	}

	@When("^customer enters FirstName as \"([^\"]*)\"$")
	public void customer_enters_FirstName_as(String arg1) throws Throwable {
		accountRegistrationPage.enterFirstName(arg1);
	}

	@When("^customer enters LastName as \"([^\"]*)\"$")
	public void customer_enters_LastName_as(String arg1) throws Throwable {
		accountRegistrationPage.enterLastName(arg1);
	}

	@When("^customer enters BirthDate as \"([^\"]*)\"$")
	public void customer_enters_BirthDate_as(String arg1) throws Throwable {
		accountRegistrationPage.enterBirthDate(arg1);
	}

	@When("^customer enters EmailAddress as \"([^\"]*)\"$")
	public void customer_enters_EmailAddress_as(String arg1) throws Throwable {
		accountRegistrationPage.enterEmail(arg1);
	}

	@When("^customer enters Company Name as \"([^\"]*)\"$")
	public void customer_enters_Company_Name_as(String arg1) throws Throwable {
		accountRegistrationPage.enterCompanyName(arg1);
	}

	@When("^customer enters Address as \"([^\"]*)\"$")
	public void customer_enters_Address_as(String arg1) throws Throwable {
		accountRegistrationPage.enterAddress(arg1);
	}

	@When("^customer enters Postalcode as \"([^\"]*)\"$")
	public void customer_enters_Postalcode_as(String arg1) throws Throwable {
		accountRegistrationPage.enterPostalCode(arg1);
	}

	@When("^customer enters City as \"([^\"]*)\"$")
	public void customer_enters_City_as(String arg1) throws Throwable {
		accountRegistrationPage.enterCity(arg1);
	}

	@When("^customer enters State as \"([^\"]*)\"$")
	public void customer_enters_State_as(String arg1) throws Throwable {
		accountRegistrationPage.enterState(arg1);
	}

	@When("^customer selects Country as \"([^\"]*)\"$")
	public void customer_selects_Country_as(String arg1) throws Throwable {
		System.out.println(arg1);
		accountRegistrationPage.selectCounty(arg1);
	}

	@When("^customer enters Telephone Number as \"([^\"]*)\"$")
	public void customer_enters_Telephone_Number_as(String arg1) throws Throwable {
		accountRegistrationPage.enterTelephoneNumber(arg1);
	}

	@When("^customer enters Password as \"([^\"]*)\"$")
	public void customer_enters_Password_as(String arg1) throws Throwable {
		accountRegistrationPage.enterPassword(arg1);
	}

	@When("^customer enters Confirm Passowrd as \"([^\"]*)\"$")
	public void customer_enters_Confirm_Passowrd_as(String arg1) throws Throwable {
		accountRegistrationPage.enterConfirmPassowrd(arg1);
	}

	@When("^customer clicks on Submit button$")
	public void customer_clicks_on_Submit_button() throws Throwable {
		accountRegistrationPage.clickSubmitButton();
	}

	@Then("^Account Creation is Successful$")
	public void account_Creation_is_Successful() throws Throwable {
		accountRegistrationPage.verifySuccessAccountCreationMessage();
	}

	@Then("^Account Creation is UnSuccessful$")
	public void account_Creation_is_UnSuccessful() throws Throwable {
		accountRegistrationPage.verifyAccountCreationErrorMessage();
	}
}
