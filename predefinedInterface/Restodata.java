package com.predefinedInterface;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Restodata {

	public static void main(String[] args) {
		// function interface will accept one argument and return one value, The method is apply();
		Function<String,String> resto1=Restaurant::data;
		System.out.println(resto1.apply("Good luck Cafe"));
		
		// BiFunction interface will accept two argument and return one value, The method is apply();
		BiFunction<String,String,String> resto2=Restaurant::data2;
		System.out.println(resto2.apply("Tiranga"," Only Biryani"));
		//upto this is  for Function Interface and BiFunction Interface
		
		
		
		// Predicate interface accept one argument and return boolean value and method is test();
		Predicate<Integer> resto3= Restaurant::information;
		System.out.println(resto3.test(60));

	}

}
