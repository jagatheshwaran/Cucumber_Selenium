package com.jaga.cucumber.framework.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.jaga.cucumber.framework.utility.ResourceFetchUtility;

public class ChromeBrowser {

	public Capabilities getChromeCapabilities() {
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("start-maximized");
		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		chrome.setJavascriptEnabled(true);
		chrome.setCapability(ChromeOptions.CAPABILITY, chromeoptions);
		return chrome;

	}

	public WebDriver getChromeDriver(Capabilities chrome) {
		if (System.getProperty("os.name").contains("Mac")) {
			System.setProperty("webdriver.chrome.driver",
					ResourceFetchUtility.getResourcePath("/src/main/resources/drivers/chromedriver"));
			return new ChromeDriver(chrome);
		} else if (System.getProperty("os.name").contains("Window")) {
			System.setProperty("webdriver.chrome.driver",
					ResourceFetchUtility.getResourcePath("/src/main/resources/drivers/chromedriver.exe"));
			return new ChromeDriver(chrome);
		}
		return null;

	}
}
