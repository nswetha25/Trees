//If you get some exception in alpha method and if u dont handle it in this but its handling in main class atlease throws the exception so that JVM will directly go to main method
//for seeing the exception instead of going through all the remaining code. Its a good pgming sign. we all it as Ducking exception
import java.util.Scanner;

class Demo1{
	public void alpha() throws Exception {
		System.out.println("connection is established");
		
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nominator");
		int num1=sc.nextInt();
		
	
		System.out.println("Enter denominator");
        int num2=sc.nextInt();
        
        int res=num1/num2; 
        System.out.println("result :"+res);
		
		System.out.println("connection close");
	}
}
public class Exception5 {

	public static void main(String[] args) {
		System.out.println("open conn");
		Demo1 d=new Demo1();
		try {
		d.alpha();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			//System.out.print(e.printStackTrace());
			System.out.println("Dont give zero");
		}
		System.out.println("conn close");

	}

}
