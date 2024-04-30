//If we handle the exception then the abrupt termination of the program will not coccur. Means if there is abnormal termination and if did not define user defined exception
//then connection is closed message will not be displayed. But if we want to continue displaying other statements if there is any error the we define the exception and the program
//will not terminate abruptly.
//Enclose the risky code with in the try block
//The parent of all types of exceptions is - Exception class
//As a dev we have to anticipate all the possible of cases of exception
import java.util.Scanner;

class exceptionhandling{
	
}
public class Exceptionhandling1 {

	public static void main(String[] args) {
		System.out.println("connection is established");
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nominator");
		int num1=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
	
		System.out.println("Enter denominator");
        int num2=sc1.nextInt();
        
        int res=num1/num2;
        //Here once the exception occurs even if there are 100 stmnts after this it will not be executed
        System.out.println("result :"+res);
        }
        //parent of all exceptions - Exception class
        catch(Exception e){
        	System.out.println(e);// this line tells us exactly what type of exception,. in this case if I give den as 0 it tells arithmetc exception
        	System.out.println("please enter integer data and no zero in denom");
        }
	
     finally {
        System.out.println("connection is closed");
     }

	}

}
