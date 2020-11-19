package com.pojo;

public class Problem10Class {
	public static String findOldDate(String date1, String date2) {

		String[] list1 = date1.split("-");
		String[] list2 = date2.split("-");

		if (Integer.parseInt(list1[2]) < Integer.parseInt(list2[2])) {
			return date1;
		} else if (Integer.parseInt(list1[1]) < Integer.parseInt(list2[1])) {
			return date1;
		} else if (Integer.parseInt(list1[0]) < Integer.parseInt(list2[0])) {
			return date1;
		}

		return date2;
	}

}
