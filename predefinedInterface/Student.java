package com.predefinedInterface;

import java.util.Map;

public class Student {
	
	public static void inform(String name) {
		
		System.out.println("welcome to cyber success Mr./Miss. "+name);
		
	}
	public static void display(int age) {
		System.out.println("Your Registered age is "+age);
		
	}
	
	public static void details(String name,int age) {
		System.out.println("Your name is:"+name+" Your age is:"+age);
		
	}
	public static void foods(Map<Integer,String>maps,String name) {
		System.out.println("The Below products were consumed by:"+name);
		maps.forEach((key,val)-> System.out.println(val  +" "+key));
	}

}
