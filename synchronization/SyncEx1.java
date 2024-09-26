package com.synchronization;

public class SyncEx1 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncEx1 e1=new SyncEx1();
		SyncEx1 e2=new SyncEx1();
		SyncEx1 e3=new SyncEx1();
		
		e1.start();
		e2.start();
		e3.start();
		
		

	}
	
	public static synchronized void display() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		
	}
	public void run() {
		display();
	}

}
//when we use synchronized keyword to method then the thread are run one after another.
// And if no then the thread are called randomly.