package com.lanbdaexpression;

public class Brands {

	public static void main(String[] args) {
		Car c1 = (a,b)->{return "car name is:"+a+"price is:"+b;};
		System.out.println("Mahindra XUV 700 "+1500000);
		
		Car c2 = (a,b)->{return "car name is "+a+"price"+b;};
		System.out.println("Range Rover "+"price is:"+50000000);
		
		Car c3 = (a,b)-> "car name is "+a+"price"+b;   //if we have single statement then their is not need to give curly brackets we can write single statement 
		System.out.println("Mustang "+20000000);
		

	}

}


interface Car{
	public String details(String a,int b);
}