package com.jaga.cucumber.framework.helper.wait;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jaga.cucumber.framework.helper.logger.LoggerHelper;

/**
 * 
 * @author Jagatheshwaran
 * @since 8/3/2018
 *
 */
public class WaitHelper {

	public WebDriver driver;
	public WebDriverWait wait;
	private static Logger logger = LoggerHelper.getLogger(WaitHelper.class);

	// Created by Jagatheshwaran on 8/3/2018
	public WaitHelper(WebDriver driver) {
		this.driver = driver;
		logger.info("Wait Helper : " + this.driver.hashCode());
	}

	// Created by Jagatheshwaran on 8/3/2018
	public void setImplicitWait(long timeout, TimeUnit unit) {
		logger.info(timeout);
		driver.manage().timeouts().implicitlyWait(timeout, unit == null ? TimeUnit.SECONDS : unit);
	}

	// Created by Jagatheshwaran on 8/3/2018
	public WebDriverWait getPollingWait(int timeout, int pollingsec) {
		wait = new WebDriverWait(driver, timeout);
		wait.pollingEvery(pollingsec, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(NoSuchFrameException.class);
		return wait;
	}

	// Created by Jagatheshwaran on 8/3/2018
	public void waitForElementVisible(WebElement element, int timeout, int pollingsec) {
		logger.info("Web Element : " + element);
		wait = getPollingWait(timeout, pollingsec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// Created by Jagatheshwaran on 8/3/2018
	public void waitForElementClick(WebElement element, int timeout, int pollingsec) {
		logger.info("Web Element : " + element);
		wait = getPollingWait(timeout, pollingsec);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
