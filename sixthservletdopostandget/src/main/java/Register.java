

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

    //As we use Get method then wahtever the data that we pass will be present in the URL
    
    //As I already mentioned that all t hese get and post will be present in service method
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		System.out.println("Get requ is procesed");
//		
//		String name=request.getParameter("username");
//		String addr=request.getParameter("Address");
//		
//		
//	}
    
    //if I dont specify get or post in my form then by default after filling the details I will get them in the URL which means by default it is GET method
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Get requ is procesed");
		
		String name=request.getParameter("username");
		String addr=request.getParameter("Address");
		//Above I am just collecting it but not putting it in the db and also not displaying on the broswer but using response reference I am
		//redirecting the page to another html page
		
		//wharver the message is present in success.html I have to fetch and print here. For this if i want something to go from servlet I have to use response 
		response.sendRedirect("/sixthservletdopostandget/success.html");//so once index.html data is given which has the registration form and after clicking on
		//register here in response we gave this link to success.html right which has the message so I am able to see that message in my broswer
		
		
	}

}
