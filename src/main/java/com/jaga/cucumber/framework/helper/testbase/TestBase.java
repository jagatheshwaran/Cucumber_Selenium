package com.jaga.cucumber.framework.helper.testbase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.jaga.cucumber.framework.browser.BrowserType;
import com.jaga.cucumber.framework.browser.ChromeBrowser;
import com.jaga.cucumber.framework.browser.FireFoxBrowser;
import com.jaga.cucumber.framework.browser.InternetExplorerBrowser;
import com.jaga.cucumber.framework.configurationreader.ObjectReader;
import com.jaga.cucumber.framework.configurationreader.PropertyFileReader;
import com.jaga.cucumber.framework.helper.logger.LoggerHelper;
import com.jaga.cucumber.framework.utility.DateTimeUtility;
import com.jaga.cucumber.framework.utility.ResourceFetchUtility;

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
	private Logger logger = LoggerHelper.getLogger(TestBase.class);

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

	// Created by Jagatheshwaran on 14/3/2018
	public String takeScreenShot(String name) throws IOException {

		if (driver instanceof HtmlUnitDriver) {
			logger.fatal("HtmlUnitDriver Cannot take the ScreenShot");
			return "";
		}

		File destinationDirectory = new File(
				ResourceFetchUtility.getResourcePath("screenshots/") + DateTimeUtility.getCurrentDate());
		if (!destinationDirectory.exists())
			destinationDirectory.mkdir();

		File destinationPath = new File(
				destinationDirectory.getAbsolutePath() + System.getProperty("file.separator") + name + ".jpg");
		try {
			FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), destinationPath);
		} catch (IOException e) {
			logger.error(e);
			throw e;
		}
		logger.info(destinationPath.getAbsolutePath());
		return destinationPath.getAbsolutePath();
	}

	// Created by Jagatheshwaran on 14/3/2018
	public WebElement getElement(By locator) {
		logger.info("Locator Value : " + locator);
		if (IsElementPresentQuick(locator))
			return driver.findElement(locator);

		try {
			throw new NoSuchElementException("Element Not Found : " + locator);
		} catch (RuntimeException re) {
			logger.error(re);
			throw re;
		}
	}

	// Created by Jagatheshwaran on 14/3/2018
	public WebElement getElementWithNull(By locator) {
		logger.info("Locator Value : " + locator);
		try {
			return driver.findElement(locator);
		} catch (NoSuchElementException e) {
			// Ignore
		}
		return null;
	}

	// Created by Jagatheshwaran on 14/3/2018
	public boolean IsElementPresentQuick(By locator) {
		boolean flag = driver.findElements(locator).size() >= 1;
		logger.info("Flag Value of Locator : " + flag);
		return flag;
	}
}
