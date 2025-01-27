package org.jain.service.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jain.common.DBUtils;

public class UserService {
	
	//fetching name from user table
	public String getName(int id)
	{
		try
		{
			ResultSet rs= DBUtils.executeSelectQuery("select Name from user where ID="+id+"");
			rs.next();
			return "Name: "+rs.getString("Name");
		}
		catch(SQLException e)
		{
			return "Some error occured..!"+ e.getMessage();
		}
	}
	
	
	//fetching password from user table
	public String getPassword(int id)
	{
		try
		{
			ResultSet rs= DBUtils.executeSelectQuery("select Password from user where ID="+id+"");
			rs.next();
			return "Password: "+rs.getString("Password");
		}
		catch(SQLException e)
		{
			return "Some error occured..!";
		}
	}
	
	
	//fetching email from user table
	public String getEmail(int id)
	{
		try
		{
			ResultSet rs= DBUtils.executeSelectQuery("select Email from user where ID="+id+"");
			rs.next();
			return "Email: "+rs.getString("Email");
		}
		catch(SQLException e)
		{
			return "Some error occured..!";
		}
	}
}
