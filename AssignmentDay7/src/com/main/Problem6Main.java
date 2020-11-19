package com.main;

import java.util.Scanner;

import com.pojo.Problem6Class;

public class Problem6Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem6Class problem5class = new Problem6Class();
	    int year = sc.nextInt();
	    int month = sc.nextInt();
	    System.out.println(problem5class.display(year, month));
	    sc.close();

	}

}
