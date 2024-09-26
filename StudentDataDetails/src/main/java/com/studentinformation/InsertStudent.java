package com.studentinformation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.mysql.cj.xdevapi.Statement;

public class InsertStudent extends HttpServlet {
  private static final long serialVersionUID = 1L;
  Connection con;

  public void init(ServletConfig config) throws ServletException {
	  ServletContext context=config.getServletContext();
    String url = context.getInitParameter("dburl");
        String username = config.getInitParameter("dbname");
        String password = config.getInitParameter("dbpass");
        
        try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
        
        try {
          con = DriverManager.getConnection(url,username,password);
    } catch (SQLException e) {
      // TODO Auto-generated catch blocks
      e.printStackTrace();
    }
      
  }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      String fname = request.getParameter("fname");
      String lname = request.getParameter("lname");
      String email = request.getParameter("email");
      String pass = request.getParameter("pass");
      
      try {
			Statement stmt=con.createStatement();
			
			int result=stmt.executeUpdate("insert into  student_info values ('"+fname+"','"+lname+"','"+email+"','"+pass+"')");
			System.out.println(result+"student inserted");
			
			
			response.setContentType("text/html");
			
			PrintWriter out=response.getWriter();
					if(result>0) {
						out.println("<h2 style='color:green'> student inserted </h2>");
					}
					else {
						out.println("<h2 style='color:red'> Error to inserted data </h2>");
					}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
      
  }
    
    public void destroy() {
      // TODO Auto-generated method stub
      try {
        con.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }


}