package com.problem1_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		AdvancedInterface advancedinterface = new MyCaluculator();
		System.out.println("Sumof factors of given number is " + advancedinterface.divisorSum(scanner.nextInt()));
		scanner.close();

	}

}
