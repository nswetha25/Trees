//Lets explore daemon thread. It is for backend works. After all the things got executed last it should execute.I did not really understand this concept
class wordpad extends Thread{
	
	public void run() {
		String tname=Thread.currentThread().getName();
		if("Type".equals(tname)) {
			typing();
		}
		else if("check".equals(tname)) {
			spellcheck();
		}
		else {
			saving();
		}
		
		
		
	}
	public void typing() {
		try {
		for(int i=0;i<3;i++) {
			System.out.println("Typing....");
			Thread.sleep(5000);
		}
		}
		catch(Exception e) {
			System.out.println("some pblm");
		}
		
	}
	public void spellcheck() {
		try {
			//once after making these two threads as daemon I should have infiniete loop . It means it will not execute infinite tmes but JVM will understand these are daemon threads
			
		for(;;) {
			System.out.println("specllcheck....");
			Thread.sleep(5000);
		}
		}
		catch(Exception e) {
			System.out.println("some pblm");
		}
		
	}
	public void saving() {
		try {
		for(;;) {
			System.out.println("saving....");
			Thread.sleep(5000);
		}
		}
		catch(Exception e) {
			System.out.println("some pblm");
		}
		
	}
	
}
public class Multi13daemon {

	public static void main(String[] args) {
		wordpad wp=new wordpad();
		wordpad wp2=new wordpad();
		wordpad wp3=new wordpad();
		wp.setName("Type");
		wp2.setName("check");
		wp3.setName("saving");
		//Here I want check and saving after type so I am making these two threads as daemon threads
		wp2.setDaemon(true);
		wp3.setDaemon(true);
		//Also we will make the priority less than 5
		wp2.setPriority(3);
		wp3.setPriority(2);
		wp.start();
		wp2.start();
		wp3.start();

	}

}