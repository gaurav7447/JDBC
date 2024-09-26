package com.synchronization;

public class SyncEx2  {
	public static synchronized void info(int a,int b) {
		int p=0;
		
		for(int i=a;i<=b;i++) {
			 int count=i;
			 int flag=0;
			
				 if(count<1) {
					flag=1;
				 }
				 else {
					 for (int j = 2; j <= Math.sqrt(count); j++) {
		                    if (count % j == 0) {
		                        flag=1;
		                        break;
		                    }
		                    }
				 }
				 if(flag==0) {
					 System.out.println(i);
					 p++;
				 }
				
			}
		 System.out.println(p);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1=new Runnable() {
			public void run() {
				info(100,1000);
				
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		Runnable r2=new Runnable() {
			public void run() {
				info(1001,10000);
				
			}
		};
		Thread t2=new Thread(r2);
		t2.start();
		}
	}


//runnable is an anonymous class so we cannot use implements 
//
