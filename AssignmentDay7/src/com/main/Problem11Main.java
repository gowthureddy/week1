package com.main;

import java.util.Scanner;

import com.pojo.Problem11Class;


public class Problem11Main {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Enter the dates to find months ");
		
		String date1 = scanner.nextLine();
		String date2 = scanner.nextLine();
		
		int difference = Problem11Class.getMonthDifference(date1, date2);
		System.out.println("Difference between months "+difference);

	}

}
