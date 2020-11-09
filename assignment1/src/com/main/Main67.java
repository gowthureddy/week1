package com.main;
import java.util.Scanner;

import com.pojo.Program6;
import com.pojo.Program7;

public class Main67 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Program6 program6 = new Program6();
		System.out.println("Enter a character");
		program6.setLetter(scanner.next().charAt(0));
		System.out.println("Ascii value of the character " + program6.getLetter() + " is" + " "
				+ program6.asciiValue(program6.getLetter()));
		Program7 program7 = new Program7();
		System.out.println("Fizz buzz program output is");

		int temp = 0;
		for (temp = 0; temp < 100; temp++) 
		{

			System.out.println(program7.fizzBuzz(temp + 1));
		}
		
		scanner.close();

	}

}
