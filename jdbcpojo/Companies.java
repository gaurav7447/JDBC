package com.jdbcpojo;

public class Companies {
	
	int id;
	String name;
	String location;
	String domain;
	int turnover;
	public Companies(int id, String name, String location, String domain, int turnover) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.domain = domain;
		this.turnover = turnover;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getTurnover() {
		return turnover;
	}
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}

}
