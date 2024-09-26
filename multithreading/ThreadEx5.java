package com.multithreading;

public class ThreadEx5 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx5 te=new ThreadEx5();
		ThreadEx5 te1=new ThreadEx5();
		ThreadEx5 te2=new ThreadEx5();
		
		te.setDaemon(true);   //if we use after the start of thread then it will work as user thread to set daemon thread it will use before start of thread .
		
		te.start();
		te1.start();
		te2.start();
		
		

	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread()+" This is deamon thread");
			
		}
		else {
			System.out.println(Thread.currentThread()+" This user thread");
		}
		
	}

}
