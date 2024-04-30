import java.util.Scanner;
//Here if I dont have try catch and if exception occured in demo class then first it checks in the alpha method stack if there is any catch exception block written if none
//it checks the main class that has ths method and if it is not htere finally the code will the default exception handler and abruptly terminates

class Demo{
	public void alpha() {
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
public class Exception4 {

	public static void main(String[] args) {
		System.out.println("open conn");
		Demo d=new Demo();
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
