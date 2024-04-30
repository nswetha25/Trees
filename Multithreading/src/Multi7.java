//Here the task is I have to create 5 threads and those 5 threads should execute only one run method. Also I am showing how we can call another metthods apart from run method

import java.util.Scanner;

class Multitask implements Runnable{
	
	public void run() {
		//Getting name of the thread
		String name=Thread.currentThread().getName();
		if(name.equals("Bank")) {
			banking();
		}
		
	}
	public void  banking() {
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
public class Multi7 {

	public static void main(String[] args) 
	{
		Multitask m1=new Multitask();
		//Creating a thread object
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m1);
		Thread t3=new Thread(m1);
		
		//Lets set the name of thread
		
		t1.setName("Bank");
		t2.setName("Bank");
		t3.setName("Bank");
		 //Next starting the thread
		t1.start();
		
		t2.start();
		t3.start();
		
		Multitask mt=new Multitask();
		mt.banking();
		
	}

}
