package com.jaga.cucumber.framework.helper.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.jaga.cucumber.framework.utility.ResourceFetchUtility;
/**
 * 
 * @author Jagatheshwaran
 * @since 5/3/2018
 *
 */
public class LoggerHelper {

	private static boolean root = false;

	// Created by Jagatheshwaran on 5/3/2018
	@SuppressWarnings("rawtypes")
	public static Logger getLogger(Class getclass) {
		if (root) {
			return Logger.getLogger(getclass);
		}
		PropertyConfigurator.configure(
				ResourceFetchUtility.getResourcePath("/src/main/resources/configurationfiles/log4j.properties"));
		root = true;
		return Logger.getLogger(getclass);

	}

}
