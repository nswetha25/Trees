package com.telusko.main;
import java.sql.*;

public class LaunchMain2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		//Below steps are almost similar irrespective of any project or db apart from changing the db name and loading the db. But in framework this becomes easy
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String userName="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/studentinfo";
		Connection connect=DriverManager.getConnection(url, userName, password);
		
		Statement stmt= connect.createStatement();
		
		//String query="INSERT into student(sid,sname,sage,saddr) values(5,'Testing',22,'testingpurpose')";
		
		//Lets delete a row
		
		String query="DELETE from student where sid=3";
		int rowsAffected=stmt.executeUpdate(query);//generally insert,update and delete gives the result as number of rows effected
		
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
