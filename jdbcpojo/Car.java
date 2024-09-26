package com.jdbcpojo;

public class Car {

	private int id;
	private String company;
	private String name;
	private int price;
	public Car(int id, String name, String company, int price) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}
