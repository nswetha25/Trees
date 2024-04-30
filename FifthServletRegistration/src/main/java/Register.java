

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/Reg")
public class Register extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//lets fetch the data using request object
		
		String name=request.getParameter("username");
		String age=request.getParameter("Age");
		String addr=request.getParameter("Address");
		
		//Next I have to collect the data in array as I can select many values
		
		String courses[]=request.getParameterValues("course");
		
		// Convert the array of courses into a comma-separated string
		String coursesString = String.join(",", courses);
		
		//Lets do jdbc connection to update in the db. 
		
		
		Connection connect=null;
		PreparedStatement pstmnt=null;
		String sql="INSERT into studentTable (sid,sname,sage,saddr,courses) VALUES(?,?,?,?,?)";
		
		PrintWriter writer=response.getWriter();//From servlet if it is going somewhere u have to use response object
		
		writer.println("<html><head><title> Registeration </title></head>");
		//But generally we have to write this jdbc file in seperate file for more clearere way
		
		try {
		
			connect=jdbcutility.getDbConnection();
			
		pstmnt=connect.prepareStatement(sql);
		
		pstmnt.setInt(1, 2);
		pstmnt.setString(2, name);
		pstmnt.setInt(3, Integer.parseInt(age));// see I am collecting as a string in the above but in the table it stores as integer so I will store it in integer
		pstmnt.setString(4, addr);
		pstmnt.setString(5, coursesString);
		
		
		int rowsAffected=pstmnt.executeUpdate();
		
		if(rowsAffected>0) {
			writer.println("<body><h1> Registration succesful </h1>");
			//if I want to print the data on the page
			writer.println("<table border='2px'>");
			writer.println("<tr><td>USERNAME</td><td>"+name+"</td></tr>");
			writer.println("<tr><td>AGE</td><td>"+age+"</td></tr>");
			writer.println("<tr><td>Address</td><td>"+addr+"</td></tr>");
			for(String course:courses) {
			writer.println("<tr>");
			writer.println("<td>course selected </td><td>"+course+"</td>");
			writer.println("</tr>");
			
			}
			writer.println("</table>");
			writer.println("</body>");
			
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


