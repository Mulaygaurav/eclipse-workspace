package com.gaurav;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

// This class can be used to initialize the database connection 
public class DatabaseConnection { 
	protected static Connection initializeDatabase() 
		throws SQLException, ClassNotFoundException 
	{ 
		// Initialize all the information regarding 
		// Database Connection 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String name="system";
		String password="root";
		String query="insert into temp values(?,?)";
		
		Connection con = DriverManager.getConnection(  name, 
													password, 
													query); 
		return con; 
	} 
} 

