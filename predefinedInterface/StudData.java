package com.predefinedInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class StudData {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Name:");
			String name=sc.next();
			System.out.println("Enter your Age: ");
			int age=sc.nextInt();
			
			//Consumer is a per-defined interface which accept 1 argument which has 1 abstract method called as accept() and it does not return anything
			Consumer<String> con1=Student::inform;
			con1.accept(name);
			
			Consumer<Integer>con2=Student::display;
			con2.accept(age);
			
			//BiConsumer is a per-defined interface which accept 2 argument which has 1 abstract method called as accept() and it does not return anything
			BiConsumer<String,Integer> bic1=Student::details;
			bic1.accept("Gaurav Deshmane",22);
			
			Map<Integer,String> maps=new HashMap<Integer,String>();
			maps.put(15,"Vada Pav");
			maps.put(12,"Maggi");
			maps.put(10,"Wai-Wai");
			maps.put(13,"cutting chai");
			maps.put(20,"Samosa");
			maps.put(5,"Parle-G");
			
			BiConsumer<Map<Integer,String>,String> bic2=Student::foods;
			bic2.accept(maps, "Gaurav");

	}

}
