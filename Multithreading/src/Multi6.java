import java.util.Scanner;

class Banking3 extends Thread{
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

class Printing3 extends Thread{
	
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
public class Multi6 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread started");
		System.out.println(" Resources opening");
		//Till now along with main thread 3 threads are created. Just creating the thread will not have any life. By using start method they come in to life. Let us see the 
		//life of thread
				Banking3 b1=new Banking3();
				Printing3 pr=new Printing3();
				System.out.println(b1.isAlive()); //boolean --Here I get false because thread has no life because I did not start it yet
				System.out.println(pr.isAlive());
				b1.start();
				pr.start();
				System.out.println(b1.isAlive());
				System.out.println(pr.isAlive());
				//But I want my main method to not finish and wait for other threads to comple and join
				//Without join method I will get the resources closed msgs down but if this join method is there main method will stop and allow us to enter the values
				//we can do these for any other threads also
				b1.join();
				pr.join();
				System.out.println("Resources closed");
				System.out.println("Main thread closed");

	}

}
