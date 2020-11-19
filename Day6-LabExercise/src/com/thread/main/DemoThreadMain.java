/*Write a program to create a class DemoThread1 implementing Runnable interface. In the constructor, create a new 
thread and start the thread. In run() display a message "running child Thread in loop : " display the value of the counter ranging from 1 to 10. 
Within the loop put the thread to sleep for 2 seconds. In main create 3 objects of the DemoTread1 and execute the program.
*/



package com.thread.main;

import com.thread.DemoThread1;

public class DemoThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoThread1("One");
	     new DemoThread1("Two");
	     new DemoThread1("Three");
	try {
	     Thread.sleep(10000);
	} catch (InterruptedException e) {
	      System.out.println("Main thread Interrupted");
	}
	      System.out.println("Main thread exiting.");
	      }
	}

	
