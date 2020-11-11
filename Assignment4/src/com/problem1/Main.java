package com.problem1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter 1 for circle\n 2 for square \n 3 for rectangle");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input == 1) {
			System.out.println("Enter the radius");
			float radius = scanner.nextFloat();
			Shape shape = new Circle("circle", radius);
			System.out.printf("Area is %.2f", shape.calculateArea());

		}
		if (input == 2) {
			System.out.println("Enter the length");
			float length = scanner.nextFloat();
			Shape shape = new Square("square", length);
			System.out.printf("Area is %.2f", shape.calculateArea());

		}
		if (input == 3) {
			System.out.println("Enter the length");
			float length = scanner.nextFloat();
			System.out.println("Enter breadth");
			float breadth = scanner.nextFloat();
			Shape shape = new Rectangle("Rectangle", length, breadth);
			System.out.printf("Area is %.2f", shape.calculateArea());
		}

		scanner.close();
	}

}
