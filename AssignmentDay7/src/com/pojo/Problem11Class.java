package com.pojo;

public class Problem11Class {
	public static int getMonthDifference(String date1, String date2) {

		String[] list1 = date1.split("-");
		String[] list2 = date2.split("-");

		int monthsInYear = Math.abs(Integer.parseInt(list1[0])) - Math.abs(Integer.parseInt(list2[0]));
		int countMonths = monthsInYear * 12;
		countMonths += Math.abs(Integer.parseInt(list1[1]) - Integer.parseInt(list2[1]));
		return countMonths;
	}

}
