package com.telusko.main;
import java.sql.*;

import com.telusko.util.Utility;

public class LaunchMain {

	public static void main(String[] args) throws SQLException {
		
		//Opened all the resources
		Connection connect=null;
		Statement stmnt=null;
		//ResultSet result=null;
		int result=0;
		
		try 
		{
			connect=Utility.getDbConnection();
			
			if(connect!=null)
				stmnt=connect.createStatement();//this is like creating a bridge between connection and then passing the sql queries
			
//			if(stmnt!=null)
//				result=stmnt.executeQuery("select id, name from student1");
			
			if(stmnt!=null)
				result=stmnt.executeUpdate("UPDATE student1 set name='swetha' where id=1");//whenever we pass the query each and every time it will compile and execute
			//But if we have preaprestatement instead of createstatement it will autocompile directly. Lets see this in JDBC2 project
			
			
//			if(result!=null)
//			{
//				System.out.println("ID\tNAME\tAGE\tGENDER");
//			
//				//process data 
//			  while(result.next())
//			  {
//				  System.out.println(result.getInt(1)+ "\t" + result.getString(2) + "\t" +result.getInt(3)
//				  
//						  + "\t" + result.getString(4));
//			  }
//		  
//			}
			
			if(result>=1) {
				System.out.println("Data inserted successfully");
			}
			else {
				System.out.println("Not sucess");
			}
				
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
		finally 
		{
			try 
			{
				//Utility.closeResource(result, stmnt, connect);
				Utility.closeResource( stmnt, connect);//Here result is an primitive type so there is nothing to close
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
		
		

	}

}
