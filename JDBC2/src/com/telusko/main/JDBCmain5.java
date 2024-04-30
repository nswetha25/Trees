package com.telusko.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.telusko.utility.JDBCUtility2;
 
// Till now we performed CRUD operations. First diff between statement and preparedstatement is no need to pass the query in createstatement itself but in
//preparedstatement we have to pass the query inside itself. Second diff is in preparedstatement we have incomplete query and pass the values during run time.
//when using preapredstatement it will compile only once and at run time it executes it multiple times if necessary.

public class JDBCmain5 {

	public static void main(String[] args) {
		
		Connection connect=null;
		PreparedStatement stmnt=null;
		ResultSet result=null;
		Scanner scan=null;
		
		try {
			connect=JDBCUtility2.getDbConnection();
			
			if(connect!=null) {
			String sql="select sid,sname,sage,saddr from student where sid=?";
			
			stmnt=connect.prepareStatement(sql);
			scan=new Scanner(System.in);
			
			System.out.println("Please enter the info that needs to be updated");
			System.out.println("Kindly enter your id: ");
			int id=scan.nextInt();
			
			
			stmnt.setInt(1, id);
			
			boolean status=stmnt.execute();
			System.out.println("ID\tName\tage\taddress");
			if(status==true) {
				//System.out.println("update sucess");
				result=stmnt.getResultSet();
				while(result.next()) {
					System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getInt("sage")+"\t"+result.getString(4));//I can give colum,n name also if I know correctly
					
				}
				
				
//				else {
//					System.out.println("records not available for this id");
//				}
				
				
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
		
	}}



/*1. Performance:
Statement:

Statement objects are generally slower, especially when executing the same SQL query multiple times with different parameters.
The SQL query is compiled each time it is executed, leading to potential performance overhead.
PreparedStatement:

PreparedStatement is precompiled, and the SQL query is compiled only once during the creation of the PreparedStatement object.
This leads to improved performance, especially in scenarios where the same query is executed with different parameter values multiple times.
2. Security:
Statement:

Statements are vulnerable to SQL injection attacks when parameters are concatenated directly into the SQL query string.
PreparedStatement:

PreparedStatement uses parameterized queries, which help prevent SQL injection attacks. The parameters are treated as placeholders and are not directly concatenated into the SQL query.
3. Reusability:
Statement:

Statements are not easily reusable if you want to execute the same query with different parameter values.
PreparedStatement:

PreparedStatement allows you to reuse the same prepared statement with different parameter values, improving code maintainability and reducing redundant code.
4. Batch Processing:
Statement:

Supports batch processing to execute multiple SQL statements in a single call.
PreparedStatement:

Also supports batch processing, allowing you to execute multiple parameterized queries efficiently.
When to Use Each:
Statement:

Use Statement when the SQL query is static and does not require parameters.
Suitable for scenarios where the query is executed only once or a few times.
PreparedStatement:

Use PreparedStatement when the SQL query is parameterized and might be executed multiple times with different parameter values.
Recommended for improved performance, security (to prevent SQL injection), and code maintainability.
Particularly useful in situations where the same query structure is reused with different parameters.*/

/*
Batch processing in JDBC allows you to group multiple SQL statements into a single batch and execute them together, which can lead to improved performance 
compared to executing each statement individually. Both Statement and PreparedStatement interfaces in JDBC support batch processing, but the implementation
 details differ slightly.

Benefits of Batch Processing:
Reduced Communication Overhead:

Batch processing reduces the number of round-trips between the application and the database, improving efficiency.
Improved Performance:

Executing multiple statements in a single batch can be more efficient than executing them individually.
Atomic Execution:

Either all statements in the batch are executed, or none of them are. This ensures atomicity.
Optimized Database Interaction:

Database systems can optimize the execution of a batch, leading to better performance.*/

/*Bulk Data Operations:

When performing bulk insert, update, or delete operations on a large amount of data, batch processing allows you to group these operations into a single batch, reducing the number of database round-trips and improving performance.
Data Migration:

During data migration tasks, where you need to transfer a significant amount of data from one table or database to another, batch processing can be employed to execute the migration operations in a more optimized manner.
Batch Inserts:

For scenarios where you need to insert multiple rows into a table, using batch processing with PreparedStatement allows you to efficiently insert multiple sets of parameters with a single execution.
Large-Scale Updates:

When updating multiple rows in a database, batch processing can be used to group these update statements and execute them together, reducing the overall execution time.
Data Synchronization:

In scenarios involving synchronization of data between different systems or databases, batch processing helps in efficiently executing the necessary update, insert, or delete operations.
Processing Multiple Statements as a Unit:

When you need to ensure that a group of SQL statements is executed as a single unit of work (atomicity), batch processing provides a convenient way to achieve this.*/
