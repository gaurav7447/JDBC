package com.multithreading;

public class ThreadEx1 extends Thread {
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		System.out.println("welcome tho thread" +Thread.currentThread());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1 t1=new ThreadEx1();
		ThreadEx1 t2=new ThreadEx1();
		ThreadEx1 t3=new ThreadEx1();
		t1.start();
		t2.start();
		t3.start();
		

	}

}
