package com.thread;

public class DemoThread2 extends Thread{
	String name;
	Thread t;
	    public DemoThread2 (String threadname){
	 
		name = threadname; 
	    t = new Thread(this, name);
	System.out.println("New thread: " + t);
	t.start();
	}
	public void run() {
		System.out.println("running child Thread in loop");
	 try {
	     for(int i = 5; i > 0; i--) {
	     System.out.println(name + ": " + i);
	      Thread.sleep(1000);
	}
	}catch (InterruptedException e) {
	     System.out.println(name + "Interrupted");
	}
	     System.out.println(name + " exiting.");
	}

}


