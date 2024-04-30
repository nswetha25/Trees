//Here we will take the scenario as driving license application
//Synchronized exceptio - Present at a specific location like in the below case it is present while we are checking the condition of age.
//Unsyncronized exception-possibly it can happend anywhere in the pgm and we are not aware of that 

import java.util.Scanner;
class UnderageException extends Exception{
	public UnderageException(String msg) {
		super(msg);
	}
}
class OverageException extends Exception{
	public OverageException(String msg) {
		super(msg);
	}
	
}
class Applicant{
	
	int age;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		age=sc.nextInt();
	}
	public void verify() throws UnderageException,OverageException {
		if(age>=18 && age<=60) {
			System.out.println("you can apply license");
		}
		else if(age<18) {
			UnderageException uage=new UnderageException("You are under age");
			System.out.println(uage.getMessage());
			throw uage;
		}
		else {
			OverageException oage=new OverageException("You are overage");
			System.out.println(oage.getMessage());
			throw oage;
		}
	}
		
		
		
	}
class RTO{
	public void start() throws UnderageException,OverageException{
		Applicant ap=new Applicant();
		try {
		ap.input();
		ap.verify();
		}
		//we can also have generic which is parent type 'Exception' directly instead of UnderageException|OverageException
		catch(UnderageException|OverageException e) {
			try {
				ap.input();
				ap.verify();
			}
			catch(UnderageException|OverageException e1) {
				try {
					ap.input();
					ap.verify();
				}
				catch(UnderageException|OverageException e2) {
					System.out.println("fool you are blocked");
				}
			}
			
		}
	}
}

public class LaunchException1 {

	public static void main(String[] args) throws UnderageException,OverageException{
		RTO r=new RTO();
		r.start();
		

	}

}
