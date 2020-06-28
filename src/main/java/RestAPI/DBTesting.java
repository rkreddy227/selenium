package RestAPI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTesting {
	
	public void selectQuery() throws SQLException, ClassNotFoundException { 
		 String dbURL = "jdbc:sqlserver://localhost:1433/BikeStores";
		 String username = "Rama Krishna";
		        String password = "2525";
		        //Load MS SQL JDBC Driver
		        Class.forName("net.sourceforge.jtds.jdbc.Driver");
		        //Creating connection to the database
		        Connection con = DriverManager.getConnection(dbURL,username,password);
		        //Creating statement object
		     Statement st = con.createStatement();
		     String selectquery = "SELECT * FROM production.brands WHERE brand_id=5";
		        //Executing the SQL Query and store the results in ResultSet
		     ResultSet rs = st.executeQuery(selectquery);
		     //While loop to iterate through all data and print results
		     while (rs.next()) {
		     System.out.println(rs.getString("transaction_datetime"));
		     }
		        //Closing DB Connection
		     con.close();
		 }

}
