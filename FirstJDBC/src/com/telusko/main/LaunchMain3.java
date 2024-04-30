package com.telusko.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchMain3 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String userName="root";
			String password="root";
			String url="jdbc:mysql://localhost:3306/studentinfo";
			Connection connect=DriverManager.getConnection(url, userName, password);
			
			Statement stmt= connect.createStatement();
			
			String query="UPDATE student set sage=30  where sid=1";
			int rowsAffected=stmt.executeUpdate(query);
			
			if(rowsAffected==1) {
				System.out.println("Data inserted successfully");
			}
			else {
				System.out.println("Not sucess");
			}
			
			stmt.close();
			connect.close();
			
			} 
			
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
