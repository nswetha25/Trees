

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Request2
 */
@WebServlet("/Request2")
public class Request2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw=response.getWriter();	
		
		HttpSession session=request.getSession(false);//Here false means dont create new session object use the exisitng session created in Request1
		
		if(session==null) {
			pw.println("<h1> No session information is available </h1>");
		}
		else {
			
			pw.println("<table> <tr> <th> Attribute value </th></tr> ");//just for look and feel
			Enumeration<String> en= session.getAttributeNames();
			//process the information using while loop
			
			while(en.hasMoreElements()) {
				String name=(String)en.nextElement();
				Object value=session.getAttribute(name);
				pw.println("<tr><td>"+name+"</td><td>"+value+"</td></tr>");
				pw.println("</table>");
			}
			
			long crtime=session.getCreationTime();
			session.getLastAccessedTime();
			//pw.println("<h1> creation time : "+new Date(crtime)+"</h1>");
			pw.close();
		}
		
	}

	

}
