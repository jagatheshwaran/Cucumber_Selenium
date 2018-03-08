package com.jaga.cucumber.framework.helper.testbase;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.jaga.cucumber.framework.browser.BrowserType;
import com.jaga.cucumber.framework.browser.ChromeBrowser;
import com.jaga.cucumber.framework.browser.FireFoxBrowser;
import com.jaga.cucumber.framework.browser.InternetExplorerBrowser;
import com.jaga.cucumber.framework.configurationreader.ObjectReader;
import com.jaga.cucumber.framework.configurationreader.PropertyFileReader;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
/**
 * 
 * @author Jagatheshwaran
 * @since 5/3/2018
 *
 */
public class TestBase {

	public static WebDriver driver;

	// Created by Jagatheshwaran on 5/3/2018
	public WebDriver getBrowserObject(BrowserType browsertype) throws Exception {
		try {

			switch (browsertype) {
			case Chrome:
				ChromeBrowser chrome = ChromeBrowser.class.newInstance();
				return chrome.getChromeDriver(chrome.getChromeCapabilities());

			case Firefox:
				FireFoxBrowser firefox = FireFoxBrowser.class.newInstance();
				return firefox.getFireFoxDriver(firefox.getFireFoxCapabilities());

			case InternetExplorer:
				InternetExplorerBrowser internetexplorer = InternetExplorerBrowser.class.newInstance();
				return internetexplorer.getInternetExplorerDriver(internetexplorer.getInternetExporerCapabilities());

			default:
				throw new Exception(" Driver Not Found : " + new PropertyFileReader().getBrowser());

			}

		} catch (Exception e) {
			throw e;
		}
	}

	// Created by Jagatheshwaran on 5/3/2018
	public void setupDriver(BrowserType browsertype) throws Exception {
		// ObjectReader.reader = new PropertyFileReader();
		driver = getBrowserObject(browsertype);
		driver.manage().timeouts().pageLoadTimeout(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(ObjectReader.reader.getImplicitWait(), TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	// Created by Jagatheshwaran on 5/3/2018
	@Before
	public void before() throws Exception {
		ObjectReader.reader = new PropertyFileReader();
		setupDriver(ObjectReader.reader.getBrowser());

	}

	// Created by Jagatheshwaran on 5/3/2018
	@After
	public void after(Scenario scenario) {
		driver.quit();
	}

	public String getElement(By locator) {
		// TODO Auto-generated method stub
		return null;
	}
}
