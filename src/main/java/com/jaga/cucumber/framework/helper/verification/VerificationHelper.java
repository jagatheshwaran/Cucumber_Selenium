package com.jaga.cucumber.framework.helper.verification;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.jaga.cucumber.framework.helper.logger.LoggerHelper;

/**
 * 
 * @author Jagatheshwaran
 * @since 7/3/2018
 *
 */
public class VerificationHelper {

	private static Logger logger = LoggerHelper.getLogger(VerificationHelper.class);

	// Created by Jagatheshwaran on 7/3/2018
	public static synchronized boolean verifyElementPresent(WebElement element) {
		boolean isDisplayed = false;
		try {
			isDisplayed = element.isDisplayed();
		} catch (Exception exception) {
			logger.error("Element not found :" + exception);
		}
		return isDisplayed;

	}

	// Created by Jagatheshwaran on 7/3/2018
	public static synchronized boolean verifyTextEquals(WebElement element, String text) {
		boolean flag = false;
		try {
			String actualText = element.getText();
			if (actualText.equals(text)) {
				return flag = true;
			} else {
				return flag;
			}

		} catch (Exception exception) {
			logger.info("Element not found :" + element);
			return flag;
		}
	}

}
