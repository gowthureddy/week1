package com.main;

import java.time.Month;
import java.util.Scanner;

import com.pojo.Problem5Class;

public class Problem5Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem5Class problem5class = new Problem5Class();
		System.out.println("enter the year");
		int year = sc.nextInt();
		System.out.println("enter the month");
		int month = sc.nextInt();
		int temp = problem5class.display(year, month);
		Month month1 = Month.of(month+1);
		System.out.println(month1 +" :"+ temp);
		sc.close();

	}

}
