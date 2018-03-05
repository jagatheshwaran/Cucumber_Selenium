package com.jaga.cucumber.framework.stepdefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.jaga.cucumber.framework.helper.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBookLogin {
	
	@Given("^user is on FaceBook Login Page$")
	public void user_is_on_FaceBook_Login_Page() throws Throwable {
		TestBase.driver.get("https://www.facebook.com/");
	    
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" in Login option$")
	public void user_enters_and_in_Login_option(String arg1, String arg2) throws Throwable {
		TestBase.driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(arg1);
		TestBase.driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(arg2);
	    
	}

	@When("^User clicks Login button$")
	public void user_clicks_Login_button() throws Throwable {
		TestBase.driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	    
	}

	@Then("^FaceBook Home Page is Opened$")
	public void facebook_Home_Page_is_Opened() throws Throwable {
		String url = "https://www.facebook.com/";
		String currenturl = TestBase.driver.getCurrentUrl(); 
	    Assert.assertEquals(currenturl, url);
	 
	}

}
