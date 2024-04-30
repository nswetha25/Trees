package com.telusko.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



//Actuall operation is performing the query operation apart fromt he loading the driver and connecting and closing the resources can be placed in some utility class
//So here we place this in static block because whenever this class gets loaded static part will get executed without main so we have this static and place the
//code that should get executed automatically.

public class Utility {
	
	//practical use of static block
	
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Driver registered successfully");
	}
	
	//Connection is also a work for my actual part so having it before that
	
	public static Connection getDbConnection() throws SQLException {
		
		String userName="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/studentinfo";
		
		 return DriverManager.getConnection(url, userName, password);
		
		
	}
	
	public  static void closeResource(Statement st, Connection c) throws SQLException
	{
		
//		if(rs!=null)
//			rs.close();
		if(st!=null)
			st.close();
		if(c!=null)
			c.close();
	}

}
