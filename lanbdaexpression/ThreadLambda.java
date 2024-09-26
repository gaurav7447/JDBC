package com.lanbdaexpression;

public class ThreadLambda {
	public static void main(String [] args) {
		
		//normal way
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread());
			}
		};
		
		Thread t1=new Thread(r1,"Shreenivasana");
		Thread t5=new Thread(r1,"chinnaswammi");
		t1.start();
		t5.start();
		
		//lambda expression
		
		Runnable r2=()->System.out.println(Thread.currentThread());
		
		Thread t2 =new Thread(r2,"mutthuswammi");
		Thread t3=new Thread(r2,"venu gopal");
		Thread t4=new Thread(r2,"Iyer");
		
		
		//here runnable interface has a single abstract method i.e run()
		//hence it is a functional interface
		t2.start();
		t3.start();
		t4.start();
		
	}
}
