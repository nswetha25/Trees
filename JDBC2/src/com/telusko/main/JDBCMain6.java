package com.telusko.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.telusko.utility.JDBCUtility2;

public class JDBCMain6 {

	public static void main(String[] args) {
		
		Connection connect=null;
		PreparedStatement stmnt=null;
		ResultSet result=null;
		Scanner scan=null;
		
		try {
			connect=JDBCUtility2.getDbConnection();
			System.out.println("connect :"+connect);
			
			String sql="UPDATE student set sname=? where sid=?";
			
			if(connect!=null) {// Here lets say i dont include the connection and it will be null and if i dont inlcude this statememnt it gives nullpointerexception
			
			
			stmnt=connect.prepareStatement(sql);
			scan=new Scanner(System.in);
			System.out.println("checking");
			
			//if i dont want to use batch then I need to have seperate preparedstatement for each operation and do that which is repetetive
			//if u observe I am only compiliing once above but executing twice for the below updating
			if(stmnt!=null) {
				stmnt.setString(1,"swethaadf");
				stmnt.setInt(2, 4);
				stmnt.addBatch();
				
				stmnt.setString(1,"akhilyerr");
				stmnt.setInt(2, 4);
				stmnt.addBatch();
				
				stmnt.setString(1,"akhilyerrabo");
				stmnt.setInt(2, 8);
				stmnt.addBatch();
				
				int[] totalrowsaffected=stmnt.executeBatch();
				
				//Below commented part is not letting me understanding if there any partial failures
				
//				if(totalrowsaffected.length>0) {
//				
//				System.out.println("rows affected");
//				}
//				else {
//					System.out.println("failed");
//				}
				
			}
			
			

	}

}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
finally {
			
			//Actually here we are passing prepared statement but in JDBCUTILity2 we have statement but it will not throw error because prepared statment is a child of statement
			//Here we are passing result anyways we are not using it so no need to close if its not required
			try {
				JDBCUtility2.closeResource(result, stmnt, connect);
				//scan.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}}
