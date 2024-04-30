//Servlet has 3 steps in its life cycle: initalize, do some service and finish: To initialize we use init method and by default it is getting called and we
//did not do anything. Next is service like doPost and doGet methods. Means we will process the request coming from the client. 

//Actual servlets we create inside Java Resources insidde the source. But if i want to give plain static repsonse we create in src->webAPP- done in secodservlet

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyFirstServlet") // if I dont want this annotation i can use xml. by default we get this annotation
//Here when I click to view this page I can see this \MyFirstServlet on the web page address
public class MyFirstServlet extends HttpServlet { // by default it extneds this interface i guess
	private static final long serialVersionUID = 1L;
       
   static { //this particular block is written by us to check whether the serlet is loading or not because when the class loads automatically static block gets exectued that we know
	   
	   System.out.println("servlet loadoing...");
   }
	
	
    public MyFirstServlet() {// constructor gets executed when the object is created. Here behind the scenes container creates an object so this constructor should get called. so if we are getting this message then the servlet object is created
        super();
        
        System.out.println("servlet instantialtion..");
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("servlet initialization.. ");
		
	}

	
	public void destroy() {
		
		System.out.println("servlet de instantiated..");
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//Here response I am giving from servlet so it is dynamic response
		
		System.out.println("request is processing");
		
		//if i wnat to display something on the browser so i can use printwriter to write my html 
		PrintWriter pw=response.getWriter();
		pw.println("<html><head><title> Landing Page </title></head>");
		pw.println("<body bgcolor='purple'> <marquee><h2>  Welcome to the Servlet world!  </h2></marquee> </body>");
		pw.println("</html>");
		pw.close();
		
		
	}
	
	/*When you run a servlet in a web container like Tomcat, the servlets need to be mapped to specific URLs so that the container knows which servlet to invoke when a request is made to a particular URL. This mapping is specified through annotations, XML configuration, or other means.

In your case, you've annotated your servlet class with @WebServlet("/MyFirstServlet"). This annotation indicates that your servlet should handle requests mapped to the URL pattern "/MyFirstServlet". When you run the server, you need to specify the complete URL to access your servlet.

If you want your servlet to handle requests directly at the root context ("/"), you can modify the @WebServlet annotation like this:*/

}
