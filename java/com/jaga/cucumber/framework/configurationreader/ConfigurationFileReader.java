package com.jaga.cucumber.framework.configurationreader;

import com.jaga.cucumber.framework.browser.BrowserType;

/**
 * 
 * @author Jagatheshwaran
 * @since 6/3/2018
 *
 */
public interface ConfigurationFileReader {

	public String getUserName();

	public String getPassword();

	public String getWebsite();

	public int getPageLoadTime();

	public int getImplicitWait();

	public int getExplicitWait();

	public BrowserType getBrowser();

}
