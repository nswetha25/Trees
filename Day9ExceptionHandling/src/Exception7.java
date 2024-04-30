//Here will we see Rethrowing an exception. see if I have try catch block in the alpha method itself then it will not go to catch block which is present in main method
//But if I want it to go to catch block in main method and execute the code then I use throw exceptionref in my alpha catch block
//see after using throw exception it is not printing connection close statement because it is directly goind to the main method catch and continuing
//see it is called rethrowing because we have already handled the exception but even after that we are throwing it so only we call it as Rethrowing Excetpion 
//See here once we are rethrowing exception it is not executing the lines present after that right but If I want to print even those line we have to write them in finally block
import java.util.Scanner;

class Demo2{
	public void alpha() throws Exception {
		System.out.println("connection is established");
		
			
		Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter nominator");
		int num1=sc.nextInt();
		
	
		System.out.println("Enter denominator");
        int num2=sc.nextInt();
        
        int res=num1/num2; 
        System.out.println("result :"+res);
	}
		
		 catch(Exception e) {
			System.out.println("Alpha method exception");
			throw e;// If i dont have this the method which is calling this alpha method eventhoeugh it has catch block it will not execute it but it we use this
			//even after catching the exception in the block it still throws the error
			
			
		}
		//To get this line executed even after rethrowing the exception we will plce this in finally block
	finally {
		System.out.println("connection close");
	}
	
	//System.out.println("connection close"); //see this statmemebt only gets executed if I dont ahve any exception present. But if i have the exception present
	// and if I have the throw keyword where it is thrwoing the exception to the main class then only the statment present in finally block will execute.
	//But if dont have throw e in catch then this statment will execute
	}
	
}

class Demo3{
	//I believe throws Exception is not necessry here.
	public void alpha() throws Exception {
		System.out.println("connection is established");
		
			
		Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter nominator");
		int num1=sc.nextInt();
		
	
		System.out.println("Enter denominator");
        int num2=sc.nextInt();
        
        int res=num1/num2; 
        System.out.println("result :"+res);
	}
		
		 catch(ArithmeticException e) {
			System.out.println("AlphaDemo method exception");
			throw e;
			
			
		}
		finally {
		System.out.println("connectionDemo close");
		}
	}
	
}
public class Exception7 {

	public static void main(String[] args){
		Demo2 d=new Demo2();
		try {
		d.alpha();
		}
		catch(Exception e1) {
			
			
			System.out.println("Main method Exception");
			 
			
		}
		System.out.println("conn close");
		Demo3 d1=new Demo3();
		try {
			d1.alpha();
			}
		catch(IndexOutOfBoundsException e) {
			System.out.println("arthmetic");
		}

			catch(Exception e1) {
				
				
				System.out.println("MainDemo method Exception");
				 
				
			}
		
	}

}
