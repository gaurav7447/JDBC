package com.predefinedInterface;

public class Restaurant {
	
	public static String data(String name){
		return "The best cuisine of "+ name+" is Bun Maska ";
	}
	public static String data2(String name,String cuisine) {
		return "The best cuisine of "+name+" is"+cuisine;
		
	}
	
	public static boolean information(int rate) {
		if(rate<500) {
			return true;
		}
		else {
			return false;
			}
	}

}
