package com.telusko.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.telusko.util.jdbcutility;

//In this example he started with register.html page and then create one servlet Register.java with the follwoig methods. Now he took the inputs entered
//by user with the help of request reference and then connected to the db because here we are not just displaying them on the web page but we want it to
//store in to the db when the user entered the values. For that we had a jdbcutility written in one more package which is nomral java class unlike this
//servlet class where we had all the necessary information for connecting to the database. And it is also important to write all these database operation in
//another class to have the code in a clear way but for now we are writing here. Once after connecting and giving the query and then we set the values that 
//we got from the user which we already stored insome variables innitially. ANd then we printed the message success and I can see a new row got created in the db
//In servlet if i want to see something on the browser I have to use writer.println insted of SOP.

//Also remember when u start connecting the jdbc u have to import the mysql package from java build path like we did in jdbc part but here aloing with that
//we also added something from Deployment assembly this mysql package

@WebServlet("/reg")
public class Register extends HttpServlet {

       
   
  

	public void init(ServletConfig config) throws ServletException {
		
	}

	
	public void destroy() {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//Last time after fetching the data from the web page which is register.html using request and then using response I have just displayed it .
		//But now I would like to store the data that is entered in to my db. For this I will create one utility class which has all the connection established
		
		//String id=request.getParameter("ID");
		String name=request.getParameter("username");
		String age=request.getParameter("Age");
		String addr=request.getParameter("Address");
		
		Connection connect=null;
		PreparedStatement pstmnt=null;
		String sql="INSERT into studentTable (sid,sname,sage,saddr) VALUES(?,?,?,?)";
		
		PrintWriter writer=response.getWriter();
		
		writer.println("<html><head><title> Registeration </title></head>");
		//But generally we have to write this jdbc file in seperate file for more clearere way
		
		try {
		
			connect=jdbcutility.getDbConnection();
			
		pstmnt=connect.prepareStatement(sql);
		
		pstmnt.setInt(1, 2);
		pstmnt.setString(2, name);
		pstmnt.setInt(3, Integer.parseInt(age));// see I am collecting as a string in the above but in the table it stores as integer so I will store it in integer
		pstmnt.setString(4, addr);
		
		
		int rowsAffected=pstmnt.executeUpdate();
		
		if(rowsAffected>0) {
			writer.println("<body><h1> Registration succesful </h1> </body>");
		}
		else {
			writer.println("<body> Failed </body>");
		}
		
		writer.println("</html>");
		
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				jdbcutility.closeResource(pstmnt, connect);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}

}
