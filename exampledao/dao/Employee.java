package com.exampledao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Employee {
	int empId  ;
	String name;
	String dept;
	int salary;
	
	
	public Employee(int empId, String name, String dept, int salary) {
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
}