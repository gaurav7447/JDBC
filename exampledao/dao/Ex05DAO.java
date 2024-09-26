package com.exampledao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class EmployeeDAOImp implements EmployeeDAO{
	
	static String url  = "jdbc:mysql://localhost:3306/Employees";
	static String user = "root";
	static String pass = "1234";
	
	
	private static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url,user,pass);
	}
	
	
	public void save(Employee emp) {
		try {
			
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("insert into employeeData values(?,?,?,?)");
			
			pst.setInt(1, emp.empId);
			pst.setString(2, emp.name);
			pst.setString(3, emp.dept);
			pst.setInt(4, emp.salary);
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
}
	public void readEmployee() throws SQLException, ClassNotFoundException {

			Connection con=getConnection();
			
			//for particular data retrival
//			PreparedStatement pstmt=con.prepareStatement("select * from employeeData where id=?");
//			pstmt.setInt(1, 101); 
			//for all data retrival
			PreparedStatement pstmt=con.prepareStatement("select * from employeeData ");
			ResultSet rs=pstmt.executeQuery();
			System.out.println("Employee data are: ");
			
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
//				System.out.print(rs.getString(2)+" ");
//				System.out.print(rs.getString(3)+" ");
//				System.out.print(rs.getInt(4));
			}
			
			con.close();
			pstmt.close();
			rs.close();
			
			
			
		
	
	
	
	}


	@Override
	public void updataEmloyee() throws ClassNotFoundException, SQLException {
		Connection con=getConnection();
			PreparedStatement pst=con.prepareStatement("update employeedata set salary=? where id=?");
			pst.setInt(1, 50000);
			pst.setInt(2, 101);
			
			pst.executeUpdate();
			con.close();
			pst.close();
			
			
		
		
		
	}


	


}



public class Ex05DAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Employee emp = new Employee(101, "Pratik" , "Developer" , 70000);
		//Employee emp1 = new Employee(102, "Gaurav" , "Tester" , 60000);
		//Employee emp1 = new Employee(103, "Kedar" , "Manager" , 600000);
//		Employee emp1 = new Employee(104, "lucky" , "Manager" , 800000);
		EmployeeDAO empdao = new EmployeeDAOImp();
		
//		empdao.save(emp1);
		empdao.readEmployee();
		empdao.updataEmloyee();
		
		
	}

}
