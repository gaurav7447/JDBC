package com.interThreadCommunication;

 class Alkatheather extends Thread{
	
	int seats=10;
	public synchronized void book(int tickets) throws InterruptedException{
		if(seats<=4) {
			System.out.println("Tickets are out of stock try other movie");
			wait();
		}
		seats-=tickets;
		
		System.out.println("Your tickets are booked available seats area:"+seats);
		
		
	}
	
	public synchronized void newhall(int tickets) {
		seats+=tickets;
		System.out.println("New available tickets are :"+tickets);
		notify();
		
		
	}

}



 public class Booking{
	 public static void main(String[]args) throws InterruptedException{
		Alkatheather t1=new Alkatheather();
		 
		 Thread th=new Thread() {
			 public void run() {
				 for(int i=1;i<=5;i++) {
					 try {
						t1.book(4);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
			 }
			 
		 };
		 
		 
		 Thread th1=new Thread() {
			 public void run() {
				 for(int i=1;i<=5;i++) {
					t1.newhall(5);
				 }
			 }
			 
		 };
		 th.start();
		 th1.start();
		 th1.join();
		 System.out.println("Final available tickets are:"+t1.seats);
		 
		 
				 
		 
	 }
	
	 
	
}
