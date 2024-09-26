package com.synchronization;

public class SyncEx3  {
	public   void info(int a,int b) {
		System.out.println("Before Synchronized");
		synchronized(this) {
		
		for(int i=a;i<=b;i++) {
			System.out.println(i);
		 }
		}
		System.out.println("After Synchronized");
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncEx3 se=new SyncEx3();
		
		Runnable r1=new Runnable() {
			public void run() {
				se.info(10,20);
				
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		Runnable r2=new Runnable() {
			public void run() {
				se.info(50,60);
				
			}
		};
		Thread t2=new Thread(r2);
		t2.start();
		}
	}


//runnable is an anonynous class so we cannot use implements 
//
