package com.gaurav;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.gaurav.DatabaseConnection; 
@WebServlet("/show")
public class Registration extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException  {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			PrintWriter out = res.getWriter(); 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String name="system";
			String password="root";
			Connection con = DriverManager.getConnection(  url,name,password); 
					 
		 PreparedStatement st = con 
                 .prepareStatement("insert into userinfo values(?,?,?,?,?)"); 
		 st.setInt(1, Integer.valueOf(req.getParameter("userid"))); 
		  
          
         st.setString(2, req.getParameter("username"));
         st.setString(3, req.getParameter("useremail"));
         st.setString(4, req.getParameter("userpassword"));
         st.setString(5, req.getParameter("userrole"));
          st.executeUpdate(); 
		 out.println(" User Registered Successfully");
		 
		 st.close(); 
         con.close(); 
         
		}catch (Exception e) { 
            e.printStackTrace(); 
        } 
         
	}

}
