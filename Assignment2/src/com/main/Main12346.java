package com.main;

import java.util.Scanner;
import com.pojo.Program1;
import com.pojo.Program2;
import com.pojo.Program3;
import com.pojo.Program4;

public class Main12346 {

	public static void main(String[] args) {
		Program1 smallest = new Program1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Program for smallest of the numbers");
		System.out.println("Enter the threee numbers");
		smallest.setNumber1(scanner.nextInt());
		smallest.setNumber2(scanner.nextInt());
		smallest.setNumber3(scanner.nextInt());
		System.out.println(
				smallest.smallestOfNumbers(smallest.getNumber1(), smallest.getNumber2(), smallest.getNumber3()));

		System.out.println("Find the middle characters");

		System.out.println("Enter the string");
		String str = scanner.next();
		System.out.println("Middle string is");
		System.out.println(Program2.returnMiddle(str));

		System.out.println("Counting the number of vowels");
		Program3 vowels3 = new Program3();
		System.out.println("Enter the string");
		vowels3.setInput(scanner.next());
		System.out.println("Vowel count is");
		System.out.println(vowels3.vowelCount(vowels3.getInput()));

		System.out.println("Room type");
		Program4 room = new Program4();
		System.out.println("Enter room no");
		room.setRoomNo(scanner.nextInt());
		System.out.println("Enter room type");
		room.setRoomType(scanner.next());
		System.out.println("Enter room float");
		room.setRoomArea(scanner.nextFloat());
		System.out.println("Enter Ac machine");
		room.setAcMachine(scanner.next());
		room.setData(room.getRoomNo(), room.getRoomType(), room.getRoomArea(), room.getAcMachine());
		room.displayData();

		
		scanner.close();



	}

}
