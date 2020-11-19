package com.main;

import java.util.Scanner;

import com.pojo.Problem7Class;

public class Problem7Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string");
		String string = scanner.nextLine();

		int result = Problem7Class.checkCharacters(string);
		if (result == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("InValid");
		}
		scanner.close();

	}

}
