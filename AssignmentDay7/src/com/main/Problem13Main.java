package com.main;

import java.util.Scanner;

import com.pojo.Problem13Class;

public class Problem13Main {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Enter the dates to find months ");
		
		String date1 = scanner.nextLine();
		String date2 = scanner.nextLine();
		
		int difference = Problem13Class.getDateDifference(date1, date2);
		System.out.println("Difference between dates "+difference);
		scanner.close();

	}

}
