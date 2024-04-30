import java.util.Scanner;

//All the below three activities there is no relation between them. WIth in one application we have 3 tasks and a re independent on each other. In the below eventhough these 3 activities
//are independent if I dont give the account number it will not proceed to executing the other activities. This problem is associated with Single Thread programming beacuaser right now
//this appicaiton is Single threaded applicaiton. Even though if I write this in seperate classes it will not execute at a time. we have to finish step by step based on our execution flow.
//Till now whatever we have written all the applications are single threaded applicaitons. If somewhere it is struck it will not move to the next one.
public class Multi1 {

	public static void main(String[] args) throws Exception{
		
		System.out.println("Activity 1 started");

		System.out.println("Enter account numer");
		Scanner sc=new Scanner(System.in);
		int acct=sc.nextInt();
		System.out.println("Enter pwd");
		int pwd=sc.nextInt();
		
		System.out.println("Account details :"+acct +" "+pwd);
		Thread.sleep(3000);
		System.out.println("Activity 1 ended");
		

		System.out.println("************************");

		System.out.println("Activity 2 started");
		for(int i=0;i<5;i++)
		{
			System.out.println("numbers :"+i);
			Thread.sleep(3000);
		}

		System.out.println("Activity 2 end");
		
		System.out.println("************************");

		System.out.println("Activity 3 started");
		
		for(int i=65;i<70;i++)
		{
			System.out.println("Alphabets :"+(char)i);
			Thread.sleep(3000);
		}

		System.out.println("Activity 3 end");
		

	}

}
