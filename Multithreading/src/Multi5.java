import java.util.Scanner;

class Banking2 extends Thread{
	@Override
	public void run() {
		System.out.println("Activity 1 started");

		System.out.println("Enter account numer");
		Scanner sc=new Scanner(System.in);
		int acct=sc.nextInt();
		System.out.println("Enter pwd");
		int pwd=sc.nextInt();
		
		System.out.println("Account details :"+acct +" "+pwd);
		//Thread.sleep(3000);
		System.out.println("Activity 1 ended");
		
	}
}

class Printing2 extends Thread{
	
	@Override
	public void run() {
System.out.println("Activity 3 started");
		
		for(int i=65;i<70;i++)
		{
			System.out.println("Alphabets :"+(char)i);
			try {
		Thread.sleep(3000); 
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Activity 3 end");
		
	}
}
public class Multi5 {

	public static void main(String[] args) {
		
System.out.println("Main thread started");
System.out.println(" Resources opening");
		Banking2 b1=new Banking2();
		Printing2 pr=new Printing2();
		//Here I dont want to start the threads but instead I want to run the threads directly
		//Here as I an not using start method which means I am not handing over to ThreadScheduler so it will not have no control with Threadscheduler and it runs it normally.
		//Because we are calling the run method by ourself so it will run the first banking class and then once it finishes then only it goes to printingt2. Here we just 
		//created the threads but no life.
		b1.run();
		pr.run();
		System.out.println("Resources closed");
		System.out.println("Main thread closed");

	}

}
