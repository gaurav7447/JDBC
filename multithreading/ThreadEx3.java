package com.multithreading;

public class ThreadEx3 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new ThreadEx3();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);
		Thread t3=new Thread(r1);
		
		t1.setName("Ritesh sir");
		t1.setPriority(8);
		
		
		t2.setName("Rohan pardesi");
		t2.setPriority(3);
		
		t3.setName("Kapil Pise");
		t3.setPriority(5);
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Name :"+Thread.currentThread().getName());
	  System.out.println("prority :"+Thread.currentThread().getPriority());
		
	}

}
