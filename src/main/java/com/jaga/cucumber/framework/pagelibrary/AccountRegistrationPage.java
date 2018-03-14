package com.jaga.cucumber.framework.pagelibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jaga.cucumber.framework.helper.dropdown.DropDownHelper;
import com.jaga.cucumber.framework.helper.logger.LoggerHelper;
import com.jaga.cucumber.framework.helper.testbase.TestBase;
import com.jaga.cucumber.framework.helper.verification.VerificationHelper;
import com.jaga.cucumber.framework.helper.wait.WaitHelper;

/**
 * 
 * @author Jagatheshwaran
 * @since 13/3/2018
 *
 */
public class AccountRegistrationPage {

	private static Logger logger = LoggerHelper.getLogger(AccountRegistrationPage.class);
	WebDriver driver;
	WaitHelper wait;
	DropDownHelper dropDownHelper = new DropDownHelper(TestBase.driver);

	@FindBy(xpath = "//*[@id='tdb4']//*[text()='Continue']")
	WebElement CreateAccContinueBtn;

	@FindBy(xpath = "//*[@name='gender'][1]")
	WebElement genderOption;

	@FindBy(name = "firstname")
	WebElement firstName;

	@FindBy(name = "lastname")
	WebElement lastName;

	@FindBy(id = "dob")
	WebElement dateOfBirth;

	@FindBy(name = "email_address")
	WebElement emailAddress;

	@FindBy(name = "company")
	WebElement companyName;

	@FindBy(name = "street_address")
	WebElement address;

	@FindBy(name = "postcode")
	WebElement postCode;

	@FindBy(name = "city")
	WebElement cityName;

	@FindBy(name = "state")
	WebElement stateName;

	@FindBy(name = "country")
	WebElement countryName;

	@FindBy(name = "telephone")
	WebElement telephoneNumber;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "confirmation")
	WebElement confirmationPassword;

	@FindBy(id = "tdb4")
	WebElement submitButton;

	@FindBy(xpath = "//*[@class='grid_16 push_4']/h1")
	WebElement successMessage;

	@FindBy(xpath = "//*[@class='messageStackError']//td")
	WebElement errorMessage;

	public AccountRegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void newCustomerContinue() {
		this.CreateAccContinueBtn.click();
		logger.info("Create New User Button clicked...");
	}

	public void clickGender() {
		this.genderOption.click();
		logger.info("Gender Option clicked...");
	}

	public void enterFirstName(String fname) {
		this.firstName.sendKeys(fname);
		logger.info("First Name entered...");
	}

	public void enterLastName(String lname) {
		this.lastName.sendKeys(lname);
		logger.info("Last Name entered...");
	}

	public void enterBirthDate(String dob) {
		this.dateOfBirth.sendKeys(dob);
		logger.info("Date Of Birth entered...");
	}

	public void enterEmail(String email) {
		this.emailAddress.sendKeys(email);
		logger.info("Email address entered...");
	}

	public void enterCompanyName(String company) {
		this.companyName.sendKeys(company);
		logger.info("Company Name entered...");
	}

	public void enterAddress(String address) {
		this.address.sendKeys(address);
		logger.info("Address entered...");
	}

	public void enterPostalCode(String postcode) {
		this.postCode.sendKeys(postcode);
		logger.info("Postal Code entered...");
	}

	public void enterCity(String city) {
		this.cityName.sendKeys(city);
		logger.info("City entered...");
	}

	public void enterState(String state) {
		this.stateName.sendKeys(state);
		logger.info("State entered...");
	}

	public void selectCounty(String country) {
		dropDownHelper.selectByVisibleText(countryName, country);
		logger.info("County selected...");
	}

	public void enterTelephoneNumber(String phone) {
		this.telephoneNumber.sendKeys(phone);
		logger.info("Telephone Number entered...");
	}

	public void enterPassword(String password) {
		this.password.sendKeys(password);
		logger.info("Password entered...");
	}

	public void enterConfirmPassowrd(String confirmPassword) {
		this.confirmationPassword.sendKeys(confirmPassword);
		logger.info("Confirm Password entered...");
	}

	public void clickSubmitButton() {
		this.submitButton.click();
		logger.info("Submit Button clicked...");
	}

	public boolean verifySuccessAccountCreationMessage() {
		new VerificationHelper();
		logger.info("Account Creation successful...");
		return VerificationHelper.verifyElementPresent(successMessage);

	}
}
