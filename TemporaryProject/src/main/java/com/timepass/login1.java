package com.timepass;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/show")
public class login1 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter p= res.getWriter();
	String email=req.getParameter("email");
	String passwords=req.getParameter("password");	
	//p.println(email);
	//p.println(passwords);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		Connection con;
		try {
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String uname="system";
			String password="root";
			
			String query  = "Select * from userinfo ";
			
			Connection c= DriverManager.getConnection(url,uname,password);
			Statement s= c.createStatement();
			ResultSet rs= s.executeQuery(query);
			String a="";
			
			String b="";
			while(rs.next()) {
				if(email.equals(rs.getString(3)) && passwords.equals(rs.getString(4))) {
					a=rs.getString(3);
					b=rs.getString(4);
					p.println("Login Succesfull");
					break;
				}
			}
				
			if(email.equals(a) && passwords.equals(b)) {
			}else {
				p.println("invalid email and password");
				
			}
			
			c.close();
			s.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	}
}
