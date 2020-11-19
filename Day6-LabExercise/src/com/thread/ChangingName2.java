
/*In the previous program remove the try{}catch(){} block surrounding the sleep method and try to execute the code. 
 * What is your observation?
*/

package com.thread;

public class ChangingName2 {
	 public void run() 
	    { 
			
	            long start=System.currentTimeMillis();
	            System.out.println(start);
	                //Thread.sleep(1000);
	                System.out.println(start);

	    }
}

//My observation it is throwing error as to surround with try-catch.