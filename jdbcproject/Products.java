package com.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Products {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/Products";
		String username="root"; 
		String pass="1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,pass);
		Statement stmt=con.createStatement();
//	    int value=stmt.executeUpdate("insert into product values(10,'maggi','grocery',14)");    //executeupdate is used to use commands like update delete insert and ddl commands we cannot use select command.
//		int value2=stmt.executeUpdate("insert into product values(3,'oil','grocery',120)");
//		int value3=stmt.executeUpdate("insert into product values(4,'bisleri','grocery',20)");
//		int value4=stmt.executeUpdate("insert into product values(5,'notebook','stationary',65)");
//		int value5=stmt.executeUpdate("insert into product values(6,'tata salt','grocery',20)");
//		int value6=stmt.executeUpdate("insert into product values(7,'bike','vehicle',1200000)");
//		int value7=stmt.executeUpdate("insert into product values(8,'facewash','beauty',56)");
//		int value8=stmt.executeUpdate("insert into product values(9,'pencil','sttionary',5)");
		//int result=stmt.executeUpdate("update product set catagory='stationary' where id=9");
//		int result=stmt.executeUpdate("update product set price=70  where id=5");
//		System.out.println(result+"product upadated");
		//int result1=stmt.executeUpdate("delete from product where id=10");
		
		ResultSet rs=stmt.executeQuery("Select * from product"); //executequery is used to use select command only
		
		while(rs.next()) {
			System.out.println("The porducts detaiol are below:");
			System.out.println("Product id:"+rs.getInt(1));
			System.out.println("Product Name:"+rs.getString(2));
			System.out.println("Product category:"+rs.getString(3));
			System.out.println("Product price:"+rs.getInt(4));
			//if we want to read specific column then we have to add that specifity column index to retrive data 
			//eg:- select name from product;
			// then rs.getstring(2); here 2 is index of name  column in product table.
		}
		rs.close();
		stmt.close();
		con.close();
		
	}

}
