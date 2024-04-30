// we understood that there are two ways to create threads: One is to extend Thread class and another is to implement Runnable interface
//After runing this code threadscheduler will have now three threds along wiht main it is 4 but it wil not wait for the acitivities to complete one after another.
//WHich one will execute we have no control here . THreadscheudler will be handling all these stuff. Threadscheduling is not bothering about the importance/priotiry only it is giving
//importance to cupus time cycle. Even if there is slightest delay in processing TS is going to another thread executing that activity.
import java.util.Scanner;

class banking implements Runnable{
	
	
//Here as we are implementing runnable interface it means this interface has only one abstract method run which we need to implement
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
class Printingnumbers implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Activity 2 started");
		for(int i=0;i<50;i++)
		{
			System.out.println("numbers :"+i);
			//Thread.sleep(3000);
		}

		
	}
}

class Printalpha implements Runnable{
	
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
public class Multi3 {

	public static void main(String[] args) throws InterruptedException {
		banking b=new banking();
		
		Printingnumbers pn=new Printingnumbers();
	
		Printalpha pa=new Printalpha();
		
		//Here we need thread for every activity and I can create threads in java. So for every activity let me create seperate threads. As for main method JVM will create the thread 
		//I will leave that but apart from that Let me create threads for all other activities
		//Here along with main thread I have created 3 therads so totally 4 threads are present. Whenever we create any new thread that thread will execute the acitivity which is
		//in run method only.So I will pass the reference to which this thread should execute. It checks that particular class and execute run method
		Thread t1= new Thread(b);
		Thread t2=new Thread(pn);
		Thread t3= new Thread(pa);
		
		//Using start method we are saying to threadscheduler the control to go and run the activities
		
		t1.start();
		t2.start();
		t3.start();
		
	
		

	}

}
