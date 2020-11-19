package com.thread.main;

import com.thread.ChangingName;

public class ChangingNameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangingName t1=new ChangingName();
		t1.start();
		t1.setName("MyThread"); 
        System.out.println("Thread names after changing the "+  
        "thread names"); 
        System.out.println("New Thread 1 name:  " + t1.getName()); 
		

	}

}
