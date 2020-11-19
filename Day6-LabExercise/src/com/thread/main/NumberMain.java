/*Write a program to create a class Number  which implements Runnable. Run method displays the multiples of a number accepted as 
a parameter. In main create three objects - first object should display the multiples of 2, second should display the multiples of
5 and third should display the multiples of 8. Display appropriate message at the beginning and ending of thread. The main thread
should wait for the first object to complete. Display the status of threads before the multiples are displayed and after 
completing the multiples.
*/


package com.thread.main;
import com.thread.Number;

public class NumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1=new Thread(new Number(2));
		Thread thread2=new Thread(new Number(5));
		Thread thread3=new Thread(new Number(8));
		thread1.setName("2 multiple");
		thread2.setName("5 multiple");
		thread3.setName("8 multiple");
		thread1.start();
		try {
			thread1.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		thread2.start();
		thread3.start();

	}

}
