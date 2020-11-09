package com.main;

import java.util.Scanner;
import com.pojo.Program1;
import com.pojo.Program2;
import com.pojo.Program345;

public class ProgramMain1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the 6 values");
		int aa = scanner.nextInt();
		int bb = scanner.nextInt();
		int cc = scanner.nextInt();
		int dd = scanner.nextInt();
		int ee = scanner.nextInt();
		int ff = scanner.nextInt();
		Program1 program1 = new Program1();
		System.out.println("the value for expression  -a + b * c is " + program1.fun1(aa, bb, cc));
		System.out.println("the value for expression  (a+b) % c is " + program1.fun2(aa, bb, cc));
		System.out.println("the value for expression  a + -b*c / d is " + program1.fun3(aa, bb, cc, dd));
		System.out.println("the value for expression  a + b / c * d - e % f is " + program1.fun4(aa, bb, cc, dd, ee, ff));
		Program2 program2 = new Program2();
		System.out.println(" ");
		System.out.println("addition of two numbers is " + program2.addition(aa, bb));
		System.out.println("subtraction of two numbers is " + program2.subtraction(aa, bb));
		System.out.println("multiplication of two numbers is " + program2.multiplication(aa, bb));
		System.out.println("division of two numbers is " + program2.division(aa, bb));
		System.out.println(" ");
		Program345 program345 = new Program345();
		System.out.println("average of the 3 numbers is " + program345.average(aa, bb, cc));
		System.out.println("swap of 2 numbers a=" + aa + " and b =" + bb + " is ");
		program345.SwapOfNumbers(aa, bb);
		if (program345.checkPrime(aa))
			System.out.println(aa + " is a prime number");
		else
			System.out.println(aa + " is not a prime number");
		scanner.close();
	}

}
