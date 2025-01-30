package org.jain.service.product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jain.common.DBUtils;

public class ProductService {
	
	List<String> list = new ArrayList<>();

	
	//fetching name from product table
	public List<String> getName(String name)
	{
		try
		{
			ResultSet rs= DBUtils.executeSelectQuery("select * from product where Name='"+name+"'");
			if(rs.next())
			{
				list.add(String.valueOf(rs.getInt("ID")));
				list.add(rs.getString("Name"));
				list.add(String.valueOf(rs.getInt("Price")));
				list.add(String.valueOf(rs.getInt("Quantity")));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	   
}
