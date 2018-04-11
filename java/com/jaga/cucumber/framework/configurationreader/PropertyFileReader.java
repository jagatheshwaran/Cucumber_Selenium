package com.jaga.cucumber.framework.configurationreader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.jaga.cucumber.framework.browser.BrowserType;
import com.jaga.cucumber.framework.utility.ResourceFetchUtility;

public class PropertyFileReader implements ConfigurationFileReader {

	public Properties properties = null;

	public PropertyFileReader() throws FileNotFoundException, IOException {

		properties = new Properties();
		try {
			properties.load(ResourceFetchUtility
					.getResourcePathInputStream("/src/main/resources/configurationfiles/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getUserName() {
		return properties.getProperty("Username");

	}

	public String getPassword() {
		return properties.getProperty("Password");

	}

	public String getWebsite() {
		return properties.getProperty("Website");
	}

	public int getPageLoadTime() {
		return Integer.parseInt(properties.getProperty("PageLoadTimeOut"));
	}

	public int getImplicitWait() {
		return Integer.parseInt(properties.getProperty("ImplicitWait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(properties.getProperty("ExplicitWait"));
	}

	public BrowserType getBrowser() {
		return BrowserType.valueOf(properties.getProperty("Browser"));

	}

}
