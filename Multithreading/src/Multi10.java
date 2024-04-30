//Generally we should not interrupt a thread while it is in running state but if we want we can only do that if it is in sleep or waiting stage
class Example implements Runnable{
	
	public void run() {
		
		for(int i=0;i<4;i++) {
			try {
			System.out.println("focus is the key");
			//See when I dont have this Thread.sleep then the interrupt method will not work because as discussed above we can interrupt thread only if it is in sleep or wait state
			//Not during running state so if I dont have this sleep method which means thread is running and we can never interrupt a thread
			Thread.sleep(3000);
		
		}
		
		catch(Exception e) {
			System.out.println("thread is interruped");
		}
		}
		
	}
}
public class Multi10 {

	public static void main(String[] args) {
		Example ex=new Example();
		Thread t=new Thread(ex);
		t.start();
		//To interrupt a thread
		t.interrupt();

	}

}
