//Here it is not necessary that child1 only enters first but it can be any child but it will finish everything then only other threads will enter- synchronization in mUltithreading
//Here I dont have any pblm for all the thrasds entering to the parking lot but its not possile to start driving the car at a time so I having synchronized work only for a
//particular block
class car implements Runnable{
	 public void run() {
		try {
			//Lets say child2 comes in to picture which means it is in running state but afte tha tit goes to sleep so now threadscheduler will schedule one more thread randomly
			//as the child2 thread is in sleep state and it does not want to waste cpu time
			//But once child2 thread comes out of sleep state it will come to the runnable state it will not enter in to running state directly
			System.out.println(Thread.currentThread().getName() +" "+"Enter the parking lot");
			Thread.sleep(3000);
synchronized(this)
			{
			System.out.println(Thread.currentThread().getName() +" "+"has entered the car");
			Thread.sleep(3000);
			
			System.out.println(Thread.currentThread().getName() +" "+"has started to drive the car");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() +" "+"reached the palce");
			
			}
		}
		catch(Exception e) {
			System.out.println("some prnlm");
		}
		
	}
	
	
	
}
public class Multi9 {

	public static void main(String[] args) {
		car c=new car();
		//Thread creation and set name is in new state
		Thread t=new Thread(c);
		Thread t2=new Thread(c);
		Thread t3=new Thread(c);
		t.setName("child1");
		t2.setName("child2");
		t3.setName("child3");
		//starting threads is in runnable state
		t.start();
		t2.start();
		t3.start();
		

	}

}
