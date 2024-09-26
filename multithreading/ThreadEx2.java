package com.multithreading;

public class ThreadEx2 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1= new ThreadEx2();
		Thread t1= new Thread(r1,"kedar");
		t1.start();
		
		//Runnable r2= new ThreadEx2();
		Thread t2= new Thread(r1,"rohan");
		t2.start();
		
		///*Runnable r3= new ThreadEx2();
		Thread t3= new Thread(r1,"garuav");
		t3.start();
		 
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println(Thread.currentThread());
	
	}

}
