package com.jaga.cucumber.framework.helper.dropdown;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.jaga.cucumber.framework.helper.logger.LoggerHelper;

/**
 * 
 * @author Jagatheshwaran
 * @since 6/3/2018
 *
 */
public class DropDownHelper {

	public WebDriver driver;
	private Logger logger = LoggerHelper.getLogger(DropDownHelper.class);

	// Created by Jagatheshwaran on 6/3/2018
	public DropDownHelper(WebDriver driver) {
		this.driver = driver;
		logger.debug("DropDownHelper : " + this.driver.hashCode());
	}

	// Created by Jagatheshwaran on 6/3/2018
	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		logger.info("Element : " + element + "Value : " + value);
	}

	// Created by Jagatheshwaran on 6/3/2018
	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		logger.info("Element : " + element + "Index : " + index);
	}

	// Created by Jagatheshwaran on 6/3/2018
	public void selectByVisibleText(WebElement element, String visibletext) {
		Select select = new Select(element);
		select.selectByVisibleText(visibletext);
		logger.info("Element : " + element + "Visible Text : " + visibletext);
	}

	// Created by Jagatheshwaran on 6/3/2018
	public String getSelectValue(WebElement element) {
		String value = new Select(element).getFirstSelectedOption().getText();
		logger.info("Element : " + element + "Value : " + value);
		return value;

	}

	// Created by Jagatheshwaran on 6/3/2018
	public List<String> getAllDropDownValue(WebElement element) {
		Select select = new Select(element);
		List<WebElement> listelements = select.getOptions();
		List<String> dropdownvalues = new LinkedList<String>();
		for (WebElement elements : listelements) {
			logger.info(elements.getText());
			dropdownvalues.add(elements.getText());
		}
		return dropdownvalues;

	}
}
