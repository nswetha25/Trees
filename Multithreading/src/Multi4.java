//Now here we are going to see the second way of creating threads unlike Multi3.java

import java.util.Scanner;

class Banking1 extends Thread{
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

class Printing1 extends Thread{
	
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
public class Multi4 {

	public static void main(String[] args) {
		
		//In previous Multi3.java after creating Thread objects then only we said threads are created but here I am saying by just creating objects for two classes t2 threads
		//got created? How? It is beacuse of the concept of interface because in those class I hve extended the Thread class which is an Thread class and its parent of all classes.
		//so it means when I create object for these classes as I am extending those classes through inheritance then the  method present in the parent class can be extneded and can use them
	//without explicity creating an object for them 
		//Similar to Multi3.java here also we dont get the expected results because threads will not waste cpu time so it goes on executing the application
		
Banking1 b1=new Banking1();
Printing1 pr=new Printing1();

b1.start();
pr.start();

	}

}
