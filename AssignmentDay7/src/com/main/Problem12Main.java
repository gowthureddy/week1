package com.main;

import java.util.Scanner;

import com.pojo.Problem12Class;


public class Problem12Main {

	public static void main(String[] args) {
Scanner  scanner = new Scanner(System.in);
		
		System.out.println("Enter Ip Address");
		String string = scanner.nextLine();
		
		int result = Problem12Class.ipValidator(string);
		if(result==1) {
			System.out.println("Valid");
		}
		else {
			System.out.println("InValid");
		}

	}

}
