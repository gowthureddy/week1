package com.main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program2 {

	public static void main(String[] args) {
Date date = new Date();
		
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println(dateFormat1.format(date));
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("hh:mm:ss");
		System.out.println(dateFormat2.format(date));
		

	}

}
