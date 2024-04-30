//Here lets take a funny example. Here it is not good use of multithreading because it goes in any random order. So we can lock method to work as the way we expect 
//Using synchronized keyword other threads will not be able to execute till the thread that has started should finish.so only one thread at any given point will excute despite
//having multiple threads

//without synchronized keyword multiple threads wil come and execute and this is called 'Race condition'

class bathroom implements Runnable{
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+ " has entered bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+ " has usng bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+ " has exited bathroom");
		}
		catch(Exception e) {
			System.out.println("Exception caching");
		}
		
	}
}
public class Mutli8 {

	public static void main(String[] args) {
		bathroom b=new bathroom();
		Thread t1=new Thread(b);
		Thread t2=new Thread(b); 
		Thread t3=new Thread(b);
		
		//Lets set the names
		
		t1.setName("boy");
		t2.setName("Girl");
		t3.setName("Infant");
		
		//start the threads and now it will be under the control of ThreadScheduler. As I am using synchronized it looks like single threaded progam but not becasue order is not
		//as we gave.
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}