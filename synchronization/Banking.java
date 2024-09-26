package com.synchronization;

public class Banking {

	public static void main(String[] args) {
		
		Sbi s=new Sbi();
		Thread t1=new Thread() {
			
			public void run() {
				
				try {
					s.withdraw();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
			};
		
			Thread t2=new Thread() {
			
			public void run() {
				
				try {
					s.deposite();
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
				
			}
		};
		}}


 class Sbi {
	 
	 int balance=1000;
	 Integer a=250;
	 Integer b=200;
	 
	 void withdraw() throws InterruptedException {
	 
	 
	 synchronized (a) {
		 balance=balance-a;
		 
		 System.out.println("amoutn balance"+balance);
		 
	 }
	 }
	 
	 void deposite()  throws InterruptedException {
	 synchronized(b) {
         balance=balance+b;
		 
		 System.out.println("amoutn balance"+balance);
		 

	 }
	 }
	 }
