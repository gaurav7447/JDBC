package com.interThreadCommunication;

class BankAc extends Thread {

	int balance=1000;
	public synchronized void withdraw(int amount) throws InterruptedException{
		if(balance<=0) {
			System.out.println("Insufficient balance ,Unable to proceed");
			wait();
		}
		balance-=amount;
		System.out.println("New balance after withdraw is :"+balance);
		
		
	}
	public synchronized void  deposite(int amount) {
		balance+=amount;
		System.out.println("New balance after deposite is:"+balance);
		notify();
		
	}
}

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		BankAc b1=new BankAc();
		Thread t1=new Thread() {
			public void run() {
				for(int i=1;i<=5;i++) {
				try {
					b1.withdraw(250);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				}
			}

			
		};
		
		Thread t2=new Thread() {
			public void run() {
				for(int i=1;i<=5;i++) {
				
				b1.deposite(200);
				}
			}
		};
		t1.start();
		//t1.join();
		t2.start();
		t2.join();
		System.out.println("final available balance is:"+b1.balance);
		
	}
}
