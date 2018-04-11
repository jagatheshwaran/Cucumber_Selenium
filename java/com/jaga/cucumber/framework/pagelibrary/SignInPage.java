package com.jaga.cucumber.framework.pagelibrary;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jaga.cucumber.framework.helper.logger.LoggerHelper;
import com.jaga.cucumber.framework.helper.verification.VerificationHelper;
import com.jaga.cucumber.framework.helper.wait.WaitHelper;

/**
 * 
 * @author Jagatheshwaran
 * @since 12/3/2018
 * @Modified - 19/03/2018
 *
 */
public class SignInPage {

	private static Logger logger = LoggerHelper.getLogger(SignInPage.class);
	WebDriver driver;
	WaitHelper wait;

	@FindBy(name = "email_address")
	WebElement emailAddress;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(id = "tdb5")
	WebElement signInButton;

	@FindBy(xpath = "//a[@id='tdb4']/span[contains(@class,'ui-button-text')]")
	WebElement successMessage;

	@FindBy(xpath = "//*[@class='messageStackError']//td[1]")
	WebElement errorMessage;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WaitHelper(driver);
		wait.setImplicitWait(10, TimeUnit.SECONDS);
	}

	public void enterEmail(String email) {
		this.emailAddress.sendKeys(email);
		logger.info("Email address entered...");
	}

	public void enterPassword(String passcode) {
		this.password.sendKeys(passcode);
		logger.info("Password entered...");
	}

	public void clickSignIn() {
		this.signInButton.click();
		logger.info("SignIn Button clicked...");
	}

	public boolean verifySuccessLoginMessage() {
		new VerificationHelper();
		String expectedSuccessMessage = "Log Off";
		logger.info("SignIn Successful...");
		Assert.assertEquals(expectedSuccessMessage, successMessage.getText());
		return VerificationHelper.verifyElementPresent(successMessage);

	}

	public boolean verifyLoginErrorMessage() {
		new VerificationHelper();
		String expectedErrorMessage = " Error: No match for E-Mail Address and/or Password.";
		logger.info("SignIn UnSuccessful...");
		Assert.assertEquals(expectedErrorMessage, errorMessage.getText());
		return VerificationHelper.verifyElementPresent(errorMessage);

	}

}
