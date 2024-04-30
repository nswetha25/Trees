//We are keeping the utility class as same because there is no change and we are only creating new main classes for different pperations
package com.telusko.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.telusko.utility.JDBCUtility2;

public class JDBCmain3 {

	public static void main(String[] args) {
		
		
		Connection connect=null;
		PreparedStatement stmnt=null;
		ResultSet result=null;
		
		Scanner scan=null;
		
		//But still one more thing we cna make changes here see only the below logic like getting the infor from user and updating/inserting /deleting is changing
		//apart from that having all the reference varaibles and other finally closing resources evertyihg is same right. So everything is boiler plate code as it 
		//is common for all the projects. That is the reason we have this concept called Framework in order to avoid the repetetive work.
		
		try {
			connect=JDBCUtility2.getDbConnection();
			
			if(connect!=null) {
			String sql="UPDATE student set saddr=? where sid=?";
			
			stmnt=connect.prepareStatement(sql);
			
			scan=new Scanner(System.in);
			
			System.out.println("Please enter the info that needs to be updated");
			System.out.println("Kindly enter your id: ");
			int id=scan.nextInt();
			System.out.println("kindly enter your corct addr:");
			String name=scan.next();
			
			stmnt.setString(1, name);
			stmnt.setInt(2, id);
			
//			int rowsAffected=stmnt.executeUpdate();// Lets try execute which gives boolean
			//if the boolean gives true it means it gives the result set and if it is false it means it goes to other loop which gives how many rows effected
			
			//execute() Method:

//The execute() method is a general-purpose method that can be used to execute any SQL statement (query, update, insert, delete, etc.).
//It returns a boolean value (true if the first result is a ResultSet, false if it is an update count or there are no results).
//This method is suitable for executing any SQL statement that may produce multiple results (e.g., executing stored procedures with multiple result sets).
			
			//The executeUpdate() method is specifically designed for executing SQL statements that modify the database, such as INSERT, UPDATE, or DELETE statements.
			//It returns an int representing the number of rows affected by the SQL statement. This method is ideal for statements that are expected to change the data in the database.
			
			boolean status=stmnt.execute();
			
			if(status==true) {
				//System.out.println("update sucess");
				result=stmnt.getResultSet();
			}
			else {
				int rows=stmnt.getUpdateCount();
				if(rows>0) {
					System.out.println("rows inserted");
				}
				else {
					System.out.println("problem inserting ");
				}
			}
			
			
			
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
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
