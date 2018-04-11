package com.jaga.cucumber.framework.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeUtility {

	public static String getCurrentDateTime() {

		DateFormat dateformat = new SimpleDateFormat("_YYYY-MM-dd_HH-mm-ss");
		Calendar calendar = Calendar.getInstance();
		String time = " " + dateformat.format(calendar.getTime());
		return time;

	}

	public static String getCurrentDate() {
		return getCurrentDateTime().substring(1, 12);

	}

	public static String getCurrentTime() {
		return getCurrentDateTime().substring(12, 21);

	}

	public static void main(String ar[]) {
		System.out.println(getCurrentDate());
		System.out.println(getCurrentTime());
	}
}
