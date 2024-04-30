
public class Multi2 {

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread());//Thread[main,5,main]- For every thread a rank is given from 0 to 10 and for the main thread it is 5 . Here 10 is more priority
		
		//JVM will allocate this main thread
		//Lets store the current thread value in one thread reference
		
		Thread thread=Thread.currentThread();
		String tname=thread.getName();
		System.out.println(tname); //main
		System.out.println(thread.getPriority()); //Here we can get the priority of the thread which is 5
		
		//Let me change the name and priority of the main thread
		
		thread.setName("swetha");
		thread.setPriority(7);
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		
		System.out.println(thread.getClass());
		System.out.println(thread.toString());
		

	}

}
