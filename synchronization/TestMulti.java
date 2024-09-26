package com.synchronization;

public class TestMulti {

	public static void main(String[] args) {
		
		Driving d1=new Driving();
		Listening l1=new Listening();
		Eating e1=new Eating();
		
		d1.start();
		l1.start();
		e1.start();
		}
}


class Driving extends Thread{
	
	public void info() {
		System.out.println("I am driving Scorpio N");
	}
	
	public void run() {
		info();
	}
	
}

class Listening extends Thread{
	public void info() {
		System.out.println("I am listening Night Changes song");
	}
	
	public void run() {
		info();
		
	}
	
}

class Eating extends Thread{
	public void info() {
		System.out.println("I am eating Biryani");
	}
	
	public void run() {
		info();
		
	}
}
