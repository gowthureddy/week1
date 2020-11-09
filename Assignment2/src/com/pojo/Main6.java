package com.pojo;
import java.util.Scanner;


public class Main6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter six numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		int num6 = scanner.nextInt();
		
		System.out.println("Sum of two numbers passing two arguments " + new Addition6(num1, num2));
		System.out.println("Passing 3 args" + new Addition6(num1, num2, num3));
		System.out.println("Passing 5 args" + new Addition6(num1, num2, num3, num4, num5));
		System.out.println("Passing 6 args" + new Addition6(num1, num2, num3, num4, num5, num6));

		scanner.close();


	}

}
