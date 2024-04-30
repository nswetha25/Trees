

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("request received");
		
		//response.sendRedirect("/SeventServletReqDispatch/first.html"); I guess it is not able to redirect to two html pages. so if i comment this
		//first it is coming to this servlet and then the request is dispatching to secondservlet and then using that reference in the secnond servlet
		//it is redirecting to second html page and then forwarded the response.
		
		//RequestDispatcher rd=request.getRequestDispatcher("/SecondServlet");// Here u have to give whatever u gave @WebServlet in SecondServelt. I did not change the name
		//Now lets comment this above and below forward lne and do in onle line
		
		//rd.forward(request, response);
		
		//request.getServletContext().getRequestDispatcher("/SecondServlet").forward(request, response);// called Servlet chaining
		//getServletContext means we are getting the object of servlet.
		
		//so instead of writing requestdispatcher and then using forward method we can directly writer above one line
		
		System.out.println("control is back here");
		
		//PrintWriter writer=response.getWriter();
		//writer.println("<html><body><h1> Registration succesful </h1> </body></html>");//As the control goes to secnod serlvet we cant see this msg becuae
		//in the url we will be in the second.html page being displayed as control goesthere
		
		//Now above we have seen the forward() next we will see the include()
		
		request.getServletContext().getRequestDispatcher("/SecondServlet").include(request, response);// if we use forward the response will be from sencond servlet
		//but if we use include it is going to the second servlet but the response is from first servlet
		
		response.sendRedirect("/SeventServletReqDispatch/first.html");// It goes to second servlet above but again comes to back to first servlet. so we dont
		//get any output on the browser but if I use this redirect we are able to see whatever present.
		
		
		 
	}

}
