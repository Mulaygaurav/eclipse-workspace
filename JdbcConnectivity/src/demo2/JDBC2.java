package demo2;


import java.sql.*;

public class JDBC2 {
	public static void main(String args[]) throws Exception {
		
		// Explicitly load the Oracle JDBC driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	
		 String url = "jdbc:oracle:thin:@localhost:1521:xe"; // Change if needed
	        String user = "system";  // Replace with your Oracle username
	        String password = "root"; // Replace with your Oracle password

	        Connection conn=null ;
	        Statement stmt = null;

	        try {
	            // 1. Load Oracle JDBC Driver
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            // 2. Establish Connection
	            conn = DriverManager.getConnection(url, user, password);
	            System.out.println("Connected to Oracle Database!");

	            // 3. Create a Statement object
	            stmt = conn.createStatement();

	            // 4. Store multiple SQL commands in a String array
	            String[] sqlCommands = {
	                "CREATE TABLE employees (id NUMBER PRIMARY KEY, name VARCHAR2(50), salary NUMBER)",
	                "INSERT INTO employees (id, name, salary) VALUES (101, 'John Doe', 50000)",
	                "INSERT INTO employees (id, name, salary) VALUES (102, 'Alice Smith', 60000)",
	                "DELETE FROM employees WHERE id = 101"
	            };

	            // 5. Execute each query in the array
	            for (String sql : sqlCommands) {
	                stmt.executeUpdate(sql);
	                System.out.println("Executed: " + sql);
	            }

	            System.out.println("All queries executed successfully!");
	            
	            
	            ResultSet rs = stmt.executeQuery("select * from employees");
	            while(rs.next()) {
	            	
	            	String data = rs.getString("id")+ rs.getString("name")+ rs.getString("salary");
	            	System.out.println(data);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                // 6. Close resources
	                if (stmt != null) stmt.close();
	                if (conn != null) conn.close();
	                System.out.println("Database connection closed.");
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	
	}