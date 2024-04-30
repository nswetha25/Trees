package com.telusko.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.telusko.utility.JDBCUtility2;

public class JDBCmain4 {

	public static void main(String[] args) {
		Connection connect=null;
		PreparedStatement stmnt=null;
		ResultSet result=null;
		
		Scanner scan=null;
		
		try {
			connect=JDBCUtility2.getDbConnection();
			
			if(connect!=null) {
			String sql="DELETE from student where sid=?";
			
			stmnt=connect.prepareStatement(sql);
			
			scan=new Scanner(System.in);
			
			System.out.println("Please enter the info that needs to be updated");
			System.out.println("Kindly enter your id: ");
			int id=scan.nextInt();
			
			
			stmnt.setInt(1, id);
			
			boolean status=stmnt.execute();
			
			if(status==true) {
				//System.out.println("update sucess");
				result=stmnt.getResultSet();
			}
			else {
				int rows=stmnt.getUpdateCount();
				if(rows>0) {
					System.out.println("rows Deleted inserted");
				}
				else {
					System.out.println("problem Deleting ");
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
