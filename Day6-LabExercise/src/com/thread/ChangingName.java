
/*Write a program to assign the current thread to t1. Change the name of the thread to MyThread. Display the changed 
 * name of the thread. Also it should display the current time. Put the thread to sleep for 10 seconds and display the
 *  time again.
*/
package com.thread;

import java.text.SimpleDateFormat;

public class ChangingName  extends Thread{
	@Override
    public void run() 
    { 
		try {
            long start=System.currentTimeMillis();
            System.out.println(start);
                Thread.sleep(1000);
                System.out.println(start);

            }
		catch (Exception e)
        {
			System.out.println(e);
        }
        	
        }
        
      

}
