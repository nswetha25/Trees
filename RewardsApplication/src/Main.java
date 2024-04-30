import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class Main {

	public static void main(String[] args) {
		Userdata ud=new Userdata();
		System.out.println("user data done");
		
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5); // For example, 5 threads

        // Schedule the transaction task for each thread
        for (int i = 0; i < 5; i++) {
            executorService.scheduleAtFixedRate(new Transaction(ud.getUsers()), 0, 2, TimeUnit.SECONDS);
        }
		
 
 	}

}
