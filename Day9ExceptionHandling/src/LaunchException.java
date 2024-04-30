//Genreally ther is one doubt why cant we do everything with if else why we are using Exception for that the below program is the solution. If I want my ATM credentisla to only 
//try for 5 times if at 6th time it failed then its not possible to implement using if else(but we can have some static counter and implement it).
//so if I use exception it will be easy
import java.util.Scanner;

//creating our own exception for implmenting the abvoe scenario
class invalidcustomer extends Exception{
	public  invalidcustomer(String msg) {
		//If I dont use this then that error msg will not be displayed. but after using this we have to print that in the verify method. so it gives that msg again to the obj calling
		//and displays directly in the method
		super(msg);
	}
}
class ATM{
	private int accountnum=1111;
	private int pass=2222;
	int acc;
	int pw;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the acct number");
		acc=sc.nextInt();
	    System.out.println("Enter the password");
	    pw=sc.nextInt();
	}
	public void verify() throws invalidcustomer {
		if(accountnum==acc && pass==pw) {
			System.out.println("collect u r cash");
			
		}
		else {
			//if suscipicion activity is happening it has to go to the bank so exceptio concepti is required. because if we dont pass it to baknk he many try in different atms 
			//This below print statment I will directly pass in the object
			//System.out.println("invalid cred Try again");
			//so we have to have to this constructor above so I am adding the constructor that will accpet the parameter 
						invalidcustomer ic=new invalidcustomer("invalid cred Try again");
						System.out.println(ic.getMessage());
			throw ic;
			//we can write throw as below alos
			//throw new invalidcustomer();
			//After throw we cant have any statements
			//System.out.println("invalid cred");
		}
	}
}

class Bank{
	public void start() throws invalidcustomer {
		ATM at=new ATM();
		//as we are calling it will come to this to handle the exception. so we write try catch to handle
		try {
		at.input();
		at.verify();
		}
		catch(invalidcustomer ic) {
			try {
			at.input();
			at.verify();
			}
			catch(invalidcustomer ic1) {
				try {
					at.input();
					at.verify();
				}
				catch(invalidcustomer ic2) {
					System.out.println("you card is blocked");
				}
				
			}
			
		}
	}
}
public class LaunchException {

	public static void main(String[] args) throws invalidcustomer {
		Bank b=new Bank();
		b.start();
		

	}

}
