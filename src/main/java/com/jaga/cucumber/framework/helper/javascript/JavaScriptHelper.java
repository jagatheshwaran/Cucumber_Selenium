package com.jaga.cucumber.framework.helper.javascript;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.jaga.cucumber.framework.helper.logger.LoggerHelper;

/**
 * 
 * @author Jagatheshwaran
 * @since 6/3/2018
 *
 */
public class JavaScriptHelper {

	public WebDriver driver;
	private Logger logger = LoggerHelper.getLogger(JavaScriptHelper.class);

	// Created by Jagatheshwaran on 6/3/2018
	public JavaScriptHelper(WebDriver driver) {
		this.driver = driver;
		logger.info("JavaScriptHelper : " + this.driver.hashCode());
	}

	// Created by Jagatheshwaran on 6/3/2018
	public Object executeScript(String script) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		logger.info(script);
		return executor.executeAsyncScript(script);
	}

	// Created by Jagatheshwaran on 6/3/2018
	public Object executeScript(String script, Object... arguments) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		logger.info(script);
		return executor.executeAsyncScript(script, arguments);
	}

	// Created by Jagatheshwaran on 6/3/2018
	public void scrollToElement(WebElement element) {
		executeScript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x, element.getLocation().y);
		logger.info(element);
	}

	// Created by Jagatheshwaran on 6/3/2018
	public void scrollToElementAndClick(WebElement element) {
		scrollToElement(element);
		element.click();
		logger.info(element);
	}

	public void scrollIntoView(WebElement element) {
		executeScript("arguments[0].scrollIntoView()", element);
		logger.info(element);
	}

	// Created by Jagatheshwaran on 6/3/2018
	public void scrollIntoViewAndClick(WebElement element) {
		scrollIntoView(element);
		element.click();
		logger.info(element);
	}

	// Created by Jagatheshwaran on 6/3/2018
	public void scrollUpVertical() {
		executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}

	// Created by Jagatheshwaran on 6/3/2018
	public void scrollDownVertical() {
		executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	// Created by Jagatheshwaran on 6/3/2018
	public void ScrolUpByPixel() {
		executeScript("window.scrollBy(0,-1500)");
	}

	// Created by Jagatheshwaran on 6/3/2018
	public void ScrolDownByPixel() {
		executeScript("window.scrollBy(0,1500)");
	}
	
	// Created by Jagatheshwaran on 7/3/2018
	public void zoomInByPercentage()
	{
		executeScript("document.body.style.zoom='50'");
	}
}