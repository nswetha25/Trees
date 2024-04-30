package com.telusko.main;
import java.sql.*;

public class LaunchMain {

	//private static String url;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Generally whatever the db is only change is the connection string and ofcourse jar file we need to have in our project. Apart from that all other steps
		//will be same because java gave to all the companies an interface where they have to devleope and eastablish the connection
		
		//once we dowmloaded the mysql and then added here
		//Next step is to load and register the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");//In this part I am informing the java where that jar file is present lke registering with the java
		
		// Establishing the connection
		
		String userName="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/studentinfo";
		Connection connect=DriverManager.getConnection(url, userName, password);// once it is registered it takes care so we have to connect where it has to connect
		//Above connection is an interface
		//create statement object
		
		Statement stmt= connect.createStatement();//using that connect object creating a road for the queries
		
		//Execute the query
		
		String query="select sid,sage, sname, saddr from student";
		ResultSet result= stmt.executeQuery(query);
		
		
		System.out.println("ID\tName\tage\taddress");
		//Process data
		
		while(result.next()) {
			System.out.println(result.getInt(1)+"\t"+result.getString(3)+"\t"+result.getInt(2)+"\t"+result.getString(4));
		}
		
		//close the resources
		
		result.close();
		stmt.close();
		connect.close();
		
		

	}

}


