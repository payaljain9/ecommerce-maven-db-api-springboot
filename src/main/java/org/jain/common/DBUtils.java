package org.jain.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	
	private static String url="jdbc:mysql://localhost:3306/managment";
	private static String username="root";
	private static String password="Payal@j9067";
	
	private static Connection con;
	
	static 
	{
		try
		{
			con=DriverManager.getConnection(url, username, password);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static ResultSet executeSelectQuery(String query) throws SQLException
	{
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(query);
		
		return rs;
	}
}
