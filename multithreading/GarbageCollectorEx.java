package com.multithreading;

public class GarbageCollectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectorEx gc=new GarbageCollectorEx();
		GarbageCollectorEx gc1=new GarbageCollectorEx();
		GarbageCollectorEx gc2=new GarbageCollectorEx();
		
		//gc=null;
	//	gc1.hashCode();
	//	gc2=null;
		
		gc1=gc;  //one object is referencing to another 
		
		System.gc(); // this method is used to collect the garbage 
		
		

	}
	public void finalize() {
		System.out.println("Garbage collected");
	}

}
