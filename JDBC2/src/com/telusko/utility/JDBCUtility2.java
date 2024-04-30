package com.telusko.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtility2 {

//Here I am planning to use preparedstatmenet instead of statement.	
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
		String url="jdbc:mysql://localhost:3306/studentinfo";//if we want to connect to any other systen we need to know the ip address and give inplace of localhost
		
		 return DriverManager.getConnection(url, userName, password);
		
		
	}
	//preparedstatement is also an interface only and it is a child of statement also
	
	public  static void closeResource(ResultSet rs,Statement st, Connection c) throws SQLException
	{
		
		if(rs!=null)
			rs.close();
		if(st!=null)
			st.close();
		if(c!=null)
			c.close();
	}
}
