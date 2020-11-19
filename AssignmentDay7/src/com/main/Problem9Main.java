package com.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.pojo.Problem9Class;



public class Problem9Main {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of users:  ");
		int users = scanner.nextInt();
		
		scanner.nextLine();
		Map<String, String> employeeDetail = new HashMap();
		for(int i=0;i<users;i++) {
			
			System.out.println("Enter employee name ");
			String name = scanner.nextLine();
			
			System.out.println("Enter employee designation ");
			String designation = scanner.nextLine();
			
			employeeDetail.put(name, designation);
		}
		
		System.out.println("Enter designation to fetch");
		String designationInput = scanner.nextLine();
		List<String> details = Problem9Class.obtainDesignation(employeeDetail, designationInput);
		
		for (String string : details) {
			System.out.println(string);
		}
		scanner.close();
	}

}
