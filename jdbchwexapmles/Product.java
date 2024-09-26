package com.jdbchwexapmles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Product {
	int id;
	String name;
	String catagory;
	int price;
	public Product(int id, String name, String catagory, int price) {
		super();
		this.id = id;
		this.name = name;
		this.catagory = catagory;
		this.price = price;
	}
	
	

}
