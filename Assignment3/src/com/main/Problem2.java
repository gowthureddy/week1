package com.main;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		System.out.println(" replace all the 'd' occurrence characters with �h� characters in each string.");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		System.out.println("After replacing\n" + input.replace('d', 'h'));
		scanner.close();

	}

}
