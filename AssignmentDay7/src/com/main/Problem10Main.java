package com.main;

import java.util.Scanner;

import com.pojo.Problem10Class;

public class Problem10Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the dates ");
		String date1 = scanner.nextLine();
		String date2 = scanner.nextLine();

		String oldDate = Problem10Class.findOldDate(date1, date2);
		String[] result = oldDate.split("-");

		String dateFormat = "";
		dateFormat += result[1] + "/";
		dateFormat += result[0] + "/";
		dateFormat += result[2];

		System.out.println(dateFormat);

	}

}
