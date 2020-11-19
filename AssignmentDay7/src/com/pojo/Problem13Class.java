package com.pojo;

public class Problem13Class {
	public static int getDateDifference(String date1, String date2) {

		String[] list1 = date1.split("-");
		String[] list2 = date2.split("-");

		return Integer.parseInt(list1[2]) - Integer.parseInt(list2[2]);
	}

}
