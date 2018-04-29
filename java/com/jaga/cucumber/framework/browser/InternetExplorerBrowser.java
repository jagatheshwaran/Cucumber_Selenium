package com.jaga.cucumber.framework.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.internal.ElementScrollBehavior;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.jaga.cucumber.framework.utility.ResourceFetchUtility;

/**
 * 
 * @author Jagatheshwaran
 * @since 5/3/2018
 *
 */
public class InternetExplorerBrowser {

	public Capabilities getInternetExporerCapabilities() {
		DesiredCapabilities internetexplorer = DesiredCapabilities.internetExplorer();
		internetexplorer.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR, ElementScrollBehavior.BOTTOM);
		internetexplorer.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		internetexplorer.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		internetexplorer.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		internetexplorer.setJavascriptEnabled(true);
		return internetexplorer;

	}

	public WebDriver getInternetExplorerDriver(Capabilities internetexplorer) {
		if (System.getProperty("os.name").contains("Mac")) {
			System.setProperty("webdriver.ie.driver",
					ResourceFetchUtility.getResourcePath("/src/main/resources/drivers/internetexplorerdriver"));
			return new ChromeDriver(internetexplorer);
		} else if (System.getProperty("os.name").contains("Window")) {
			System.setProperty("webdriver.ie.driver",
					ResourceFetchUtility.getResourcePath("/src/main/resources/drivers/internetexplorerdriver.exe"));
			return new ChromeDriver(internetexplorer);
		}
		return null;

	}
}
