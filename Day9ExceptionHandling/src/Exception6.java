
public class Exception6 {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello");
		//Here compiler only shows the error to handle the exception but I dont want to use try catch so I wil just duck the exception using throws 
		//so we call it as Checked Exception bec compiler only checks the possibility of exception. 
		Thread.sleep(10000);
		System.out.println("world");
		

	}

}
