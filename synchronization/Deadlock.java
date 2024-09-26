package com.synchronization;
 class ThreadLock{
	 String red="red";
	 String blue="blue";
	 
	 
	 void display() throws InterruptedException{
	 
	 synchronized(red) {
		 System.out.println("thread red in display");
		 Thread.sleep(1000);
		 synchronized(blue) {
			 System.out.println("thread blue in display");
		 }
		 
	 }
	 }
	 
	 
	 void info()  throws InterruptedException{
		 
		 synchronized(blue) {
			 System.out.println("thread blue in info");
			 Thread.sleep(1000);
			 synchronized(red) {
				 System.out.println("thread red in info");
			 }
			 
		 }
		 }
	
	
}
public class Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadLock t1=new ThreadLock();
		
		
		Thread t2=new Thread() {
			public void run() {
			try {
				t1.display();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
		};
		
		
		
		
		Thread t3=new Thread() {
			public void run() {
			try {
				t1.info();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
			
		};
		t2.start();
		
		t3.start();
		

	}

}
