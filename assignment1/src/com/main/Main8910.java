package com.main;
import java.util.Scanner;

import com.pojo.Program10;
import com.pojo.Program8;
import com.pojo.Program9;
public class Main8910 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Program to check sum of odd digits is even or odd");
		System.out.println("Enter a number u want to check");
		int input = scanner.nextInt();
		System.out.println(Program8.checkSum(input));
		System.out.println("Program to check sum of square of even digits");
		System.out.println("Enter a number u want to find");
		int input1 = scanner.nextInt();
		System.out.println(Program9.sumOfSquaresOfEvenDigits(input1));
		System.out.println("To fing the largest word in the string");
		System.out.println("Enter the string;");
		String string = "";
		string += scanner.nextLine();
		System.out.println(string);
		System.out.println(Program10.getLargestWord(string));

		scanner.close();

	}

}
