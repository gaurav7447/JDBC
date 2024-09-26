package com.jdbchwexapmles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 class ProductData implements ProductDAO{
	 
	static String url="jdbc:mysql://localhost:3306/products";
	static String username="root";
	static String password="1234";
	
	private static Connection getConnection() throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url,username,password);
		
		}
	
	 
	public void save(Product pr) {
		
		try {
			Connection con = getConnection();
			PreparedStatement pst=con.prepareStatement("insert into product values(?,?,?,?)");
			pst.setInt(1,pr.id );
			pst.setString(2,pr.name );
			pst.setString(3, pr.catagory);
			pst.setInt(4, pr.price);
			pst.executeUpdate();
			
			con.close();
			pst.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
		
	}

		   
	public void read() throws SQLException, ClassNotFoundException {
		Connection con=getConnection();
		//specific data retrival
//		PreparedStatement pst1=con.prepareStatement("select * from product where id=?");
//		pst1.setInt(1, 5);
//		ResultSet rs=pst1.executeQuery();
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
////			System.out.println("name is:"+rs.getString(2));
////			System.out.println("category is:"+rs.getString(3));
////			System.out.println("price is :"+rs.getInt(4));
////			
//		}
//		con.close();
//		pst1.close();
//		rs.close();
		
		// all data read.
		PreparedStatement pst=con.prepareStatement("select * from product");
		ResultSet rs=pst.executeQuery();
		System.out.println("Products are: ");
		while(rs.next()) {
			System.out.println("--------------------------------");
			System.out.println("|"+rs.getInt(1)+" | "+rs.getString(2)+"| "+rs.getString(3)+"| "+rs.getInt(4));
//			System.out.println("name is:"+rs.getString(2));
//			System.out.println("category is:"+rs.getString(3));
//			System.out.println("price is :"+rs.getInt(4));
//			
		}
		System.out.println("--------------------------------");
		con.close();
		pst.close();
//		rs.close();
		
	}

	
	public void update() throws SQLException, ClassNotFoundException {
		Connection con=getConnection();
		PreparedStatement pst=con.prepareStatement("update product set name=?,price=? where id=?");
		pst.setString(1,"oats");
		pst.setInt(2, 17);
		pst.setInt(3,2 );
		pst.executeUpdate();
		
		con.close();
		pst.close();
		
	}

	public void delete() throws SQLException, ClassNotFoundException {
		Connection con=getConnection();
		PreparedStatement pst=con.prepareStatement("delete from product where id=?");
		pst.setInt(1, 9);
		pst.executeUpdate();
		con.close();
		pst.close();
		
	}




	

		


		   }
	
	
	
	

 

public class Ex06DAO {
	public static void main(String [] args)throws SQLException,ClassNotFoundException{
		ProductDAO pd=new ProductData();
		//Product pr=new Product(10,"soap","beauty",35);
		//pd.save(pr);
		//pd.read();
		//pd.update();
		//pd.delete();
		pd.read();
		
	}
	
	
	

}
