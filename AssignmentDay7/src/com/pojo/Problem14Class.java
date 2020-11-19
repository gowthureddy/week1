package com.pojo;

public class Problem14Class {
	public static String convertDateFormat(String input) {

		String dateFormatter = input.replaceAll("/", "-");
		return dateFormatter;
	}

}
