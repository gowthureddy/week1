package com.main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program1 {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		
		System.out.println("Date and Time in the format:  "+dateFormat.format(date));

	}

}
