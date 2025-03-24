package demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String uname="system";
		String password="root";
		
		String query  = "Select * from employee ";
		
		Connection c= DriverManager.getConnection(url,uname,password);
		Statement s= c.createStatement();
		ResultSet rs= s.executeQuery(query);
		
		while(rs.next()) {
			System.out.println(rs.getString(3) +" " + rs.getString(2)+" "+ rs.getString(1));
		}
		
		c.close();
		s.close();
		
	}

}
