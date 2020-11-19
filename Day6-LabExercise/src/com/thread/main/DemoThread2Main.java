

/*Rewrite the earlier program so that, now the class DemoThread1 instead of implementing from Runnable interface, will now extend
 *  from Thread class.

*/

package com.thread.main;

import com.thread.DemoThread2;

public class DemoThread2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoThread2("One");
	     new DemoThread2("Two");
	     new DemoThread2("Three");
	try {
	     Thread.sleep(10000);
	} catch (InterruptedException e) {
	      System.out.println("Main thread Interrupted");
	}
	      System.out.println("Main thread exiting.");
	      }
	


	}


