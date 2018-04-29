package com.jaga.cucumber.framework.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.jaga.cucumber.framework.utility.ResourceFetchUtility;

/**
 * 
 * @author Jagatheshwaran
 * @since 5/3/2018
 *
 */
public class FireFoxBrowser {

	public Capabilities getFireFoxCapabilities() {
		FirefoxOptions firefoxoptions = new FirefoxOptions();
		firefoxoptions.addArguments("start-maximized");
		DesiredCapabilities firefox = DesiredCapabilities.firefox();
		FirefoxProfile firefoxprofile = new FirefoxProfile();
		firefoxprofile.setAcceptUntrustedCertificates(true);
		firefoxprofile.setAssumeUntrustedCertificateIssuer(true);
		firefox.setJavascriptEnabled(true);
		firefox.setCapability(FirefoxDriver.PROFILE, firefoxprofile);
		firefox.setCapability("marionette", true);
		return firefox;

	}

	public WebDriver getFireFoxDriver(Capabilities firefox) {
		if (System.getProperty("os.name").contains("Mac")) {
			System.setProperty("webdriver.gecko.driver",
					ResourceFetchUtility.getResourcePath("/src/main/resources/drivers/geckodriver"));
			return new ChromeDriver(firefox);
		} else if (System.getProperty("os.name").contains("Window")) {
			System.setProperty("webdriver.gecko.driver",
					ResourceFetchUtility.getResourcePath("/src/main/resources/drivers/geckodriver.exe"));
			return new ChromeDriver(firefox);
		}
		return null;

	}
}
