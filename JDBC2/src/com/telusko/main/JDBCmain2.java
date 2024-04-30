package com.telusko.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.telusko.utility.JDBCUtility2;

//Here I am planning to use preparedstatmenet instead of statement.	

//Instead of writing try, catch and finally we can do this using try wiht resources
public class JDBCmain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connect=null;
		PreparedStatement stmnt=null;
		ResultSet result=null;
		
		Scanner scan=null;
		try {
		connect=JDBCUtility2.getDbConnection();
		
		if(connect!=null) {
		String sql="INSERT into student (sid,sname,sage,saddr) values(?,?,?,?)";//not passing actual values but placeholders to get the data 
		
		stmnt=connect.prepareStatement(sql);//Instead of normal statement I am using preapred statement here. what happens here is here only it will compile it unlike last one where
		//we used statement so at each and every step it will compile.
		
		//To reitterate it more clearly whenever we are using the statement we will use the reference.executeQuery and give the Sql statement but here we can directly
		//give the sql statement in the prepareStatement itself.
		}
		if(stmnt!=null) {
			//check this that while entering the name with spaces it is not behaving as expected
			scan=new Scanner(System.in);
			System.out.println("Enter your id");
			int id=scan.nextInt();
			System.out.println("Enter your name");
			String name=scan.next();
			System.out.println("Enter your age");
			int age=scan.nextInt();
			System.out.println("Enter your addr");
			String addr=scan.next();
			
			//After taking the input from user I have to insert in to that placeholder
			
			stmnt.setInt(1, id);
			stmnt.setString(2, name);
			stmnt.setInt(3, age);
			stmnt.setString(4, addr);// If I dont want to take from the user I can directly give here stmnt.setNString(4,"rdige");
			
			int rowsAffected=stmnt.executeUpdate();
			
			if(rowsAffected==1) {
				
				System.out.println("Data is stored successfully");//Here in real time we will do the operations like once the record is siubmiiteed sucessfully maybe we pass
				//this msg to servlet and the user will get it is stored sucessfuly something like that.
			}
			else {
				System.out.println("Not success");
			}
			
			
		}
		
		/*In JDBC (Java Database Connectivity), both Statement and PreparedStatement are interfaces used to execute SQL queries and commands against a database. However, there are significant differences between the two:

Execution Process:

Statement: Executes a SQL query each time it is called. The SQL query is sent to the database and compiled at the database server every time it is executed.
PreparedStatement: Precompiles the SQL query and stores it in a cache on the database server. This allows for faster execution because the query is only compiled once, and subsequent executions reuse the precompiled query.
Performance:

Statement: May be less efficient for repeated execution of the same query since it is compiled each time.
PreparedStatement: More efficient for repeated execution as it is precompiled and can be reused with different parameter values.
SQL Injection:

Statement: Prone to SQL injection attacks as it directly concatenates user inputs with the SQL query.
PreparedStatement: Provides better protection against SQL injection because it uses placeholders for parameters, and the parameters are bound separately, reducing the risk of malicious SQL injection.
Usability:

Statement: Suitable for simple queries where the SQL statement doesn't change frequently.
PreparedStatement: Ideal for scenarios where the same SQL statement needs to be executed multiple times with different parameter values.
Syntax:

Statement: Uses plain SQL queries.
PreparedStatement: Uses parameterized SQL queries with placeholders for input parameters.*/
		
		/*PreparedStatement: While it is true that using PreparedStatement helps prevent SQL injection, it doesn't mean that SQL injection can only occur when using PreparedStatement. The key reason PreparedStatement helps prevent SQL injection is because it treats user input as data, not as executable code. The use of placeholders and parameter binding ensures that user input doesn't alter the structure of the SQL query.

Statement: On the other hand, using Statement without proper input validation and concatenation of user input into the SQL query can expose the application to SQL injection. If user input is directly concatenated into the SQL string without proper validation or escaping, an attacker could manipulate the input to inject malicious SQL code.*/
		
		
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			//Actually here we are passing prepared statement but in JDBCUTILity2 we have statement but it will not throw error because prepared statment is a child of statement
			//Here we are passing result anyways we are not using it so no need to close if its not required
			try {
				JDBCUtility2.closeResource(result, stmnt, connect);
				scan.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
