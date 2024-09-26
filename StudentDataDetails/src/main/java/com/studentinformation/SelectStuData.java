package com.studentinformation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SelectStuData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection con;

	public void init(ServletConfig config) throws ServletException {
		  String url = config.getInitParameter("dburl");
	        String username = config.getInitParameter("dbname");
	        String password = config.getInitParameter("dbpass");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con =DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		
		
		try {
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student_info");
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			out.println("<table>");
			out.println("<tr>");
			out.println("<th> First Name </th>");
			out.println("<th> last Name </th>");
			out.println("<th> Email </th>");
			out.println("</tr>");
			while(rs.next()) {
				out.println("<tr>");
				out.println("<td>");
				out.println(rs.getString(1));
				out.println("</td>");
				
				//out.println("<tr>");
				out.println("<td>");
				out.println(rs.getString(2));
				out.println("</td>");
				
				//out.println("<tr>");
				out.println("<td>");
				out.println(rs.getString(3));
				out.println("</td>");
				out.println("</tr>");
			
				
			}
			out.println("</table>");
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
public void destroy() {
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

}
