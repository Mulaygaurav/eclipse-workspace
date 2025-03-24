package demo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcPreaparedStatement {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String name="system";
		String password="root";
		String query="insert into temp values(?,?)";
		
		Connection con=DriverManager.getConnection(url,name,password);
		PreparedStatement pre=con.prepareStatement(query);
		if(con!= null){
			   System.out.println("Successfully connected.");
			}else{
			   System.out.println("Failed to connect.");
			}
		pre.setInt(1,10);
		pre.setString(2,"Gaurav" );
		ResultSet myRs= pre.executeQuery(); 
		
		//int rowsInserted = pre.executeUpdate();
        System.out.println("row(s) succesfully  inserted!");
        
        con.close();
        pre.close();
        
        
	}

}
