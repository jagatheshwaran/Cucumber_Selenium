package com.jaga.cucumber.framework.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ResourceFetchUtility {

	public static String getResourcePath(String resource) {
		String path = getBaseResourcePath() + resource;
		return path;

	}

	public static String getBaseResourcePath() {
		String path = System.getProperty("user.dir");
		return path;

	}

	public static InputStream getResourcePathInputStream(String path) throws FileNotFoundException {
		return new FileInputStream(ResourceFetchUtility.getResourcePath(path));

	}

}
