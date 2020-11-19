package com.main;

import java.util.Scanner;

import com.pojo.Problem14Class;

public class Problem14Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the date: ");
		String date= scanner.nextLine();
		
		System.out.println("DateConvertFormat : "+ Problem14Class.convertDateFormat(date));


	}

}
