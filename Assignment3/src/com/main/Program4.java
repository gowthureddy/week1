package com.main;

import java.util.Arrays;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println("Array is " + Arrays.toString(array));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = scanner.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (input == array[i]) {
				System.out.println("Element Found");
				break;
			}
		}
		scanner.close();

	}

}
