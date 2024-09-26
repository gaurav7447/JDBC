package com.jdbcpojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestCompany {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		
		
		Companies com=new Companies(101,"TCS","PUNE","Service based",2000000);
		Companies com1=new Companies(102,"CyberSuccess","PUNE","Training Institute",500000);
		Companies com2=new Companies(103,"Hexaware","Mumabi","Product Based",400000);
		
		String url="jdbc:mysql://localhost:3306/Companies";
		String username="root";
		String password="1234";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement("insert into company values(?,?,?,?,?)");
//		pst.setInt(1, com.id);
//		pst.setString(2, com.name);
//		pst.setString(3, com.domain);
//		pst.setString(4, com.location);
//		pst.setInt(5, com.turnover);
		
		//pst.executeUpdate();
		
		
//		pst.setInt(1, com1.id);
//		pst.setString(2, com1.name);
//		pst.setString(3, com1.domain);
//		pst.setString(4, com1.location);
//		pst.setInt(5, com1.turnover);
//		
//		pst.executeUpdate();
//		
//		
//		pst.setInt(1, com2.id);
//		pst.setString(2, com2.name);
//		pst.setString(3, com2.domain);
//		pst.setString(4, com2.location);
//		pst.setInt(5, com2.turnover);
//		
//		pst.executeUpdate();
		
//		
//		PreparedStatement pst1=con.prepareStatement("update company set location=? where id=?");
//		pst1.setString(1, "Delhi");
//		pst1.setInt(2, 101);
//		pst1.executeUpdate();
		
		

//		PreparedStatement pst2=con.prepareStatement("delete from company where id=?");
//		pst2.setInt(1, 102);
//		
//		pst2.executeUpdate();
		
		PreparedStatement pst2=con.prepareStatement("select * from company");
	    //pst2.setInt(1, 102);
		
		ResultSet r1=pst2.executeQuery();
		while(r1.next()) {
			System.out.println("company id: "+r1.getInt(1));
			System.out.println("company name: "+r1.getString(2));
			System.out.println("company domain: "+r1.getString(3));
			System.out.println("company location: "+r1.getString(4));
			System.out.println("company turnover: "+r1.getInt(5));
			
			
			
			
		}
		
		
		

	}

}
