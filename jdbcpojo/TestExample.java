package com.jdbcpojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/Car";
		String username="root";
		String password="1234";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt=con.createStatement();
		
		//Car car1=new Car(103,"Toyota","Fortuner",4500000);
		//Car car2=new Car(102,"Mahindra","Scorpio N",2300000);
		
		
		//inserting the values into cardata table in car database
//	    int value=stmt.executeUpdate("insert into cardata values('"+car1.getId()+"','"+car1.getCompany()+"','"+car1.getName()+"','"+car1.getPrice()+"')");
//	    int value1=stmt.executeUpdate("insert into cardata values('"+car2.getId()+"','"+car2.getCompany()+"','"+car2.getName()+"','"+car2.getPrice()+"')");
//
//		if(value==1 && value1==1) {
//			System.out.println("Data inserted");
//		}
//		
		
		//deleting the value
		//int value=stmt.executeUpdate("delete from cardata where id='"+car2.getId()+"'");
		
		//update query
		//int value3=stmt.executeUpdate("update cardata set name='Safari' where '"+car1.getId()+"'=101 ");
		

		
		

	}

}
