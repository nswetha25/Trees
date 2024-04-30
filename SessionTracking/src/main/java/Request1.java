

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Request1")
public class Request1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

//First time when I am registering I am getting the session id which is the first rquest and then if I click on another request 'SHOW CART' which is the second request
	//from the client then my server responding with the first request also. See here I am not storing my data in any db or any variables. Here it is storing /remmembering
	//the sessiona dn when I click again/request again it is giving .But we can have control on how much time it should remember like in banking applicaiton
	//u cna only transfer based on some timeout . Otherwise session will be expired.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		
		response.setContentType("text/html");
		
		HttpSession session=request.getSession();//session object is created => to track or maintain information of client request
		
		if(session.isNew()) {
			pw.println("<h2>New session is created with id : </h2>"+session.getId());
			
		}
		else {
			pw.println("\"<h2>existing session only with id : </h2>"+session.getId());
		}
		
		//Retrieve the data from the client
		
		String name=request.getParameter("name");
		String value=request.getParameter("value");
		
		// Keep this information for the first time when my client is coming to the website in session object
		
		session.setAttribute(name, value);//Eventhough http forgets I will store this data
		
		//To see our session for some specified time
		
		session.setMaxInactiveInterval(10);//let me wait for 10 seconds and then click on show cart then we cant see the data
		
		//send back the response to client
		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		
		rd.include(request, response);
		
		pw.close();
		
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
