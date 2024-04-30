import java.util.Random;

public class Transaction implements Runnable{
	
	private User[] users;
	private Random random;
	
	public Transaction(User[] users) {
		this.users=users;
		this.random=new Random();
		
	}

	@Override
	public void run() {
		//selecting a random user
		int userIndex=random.nextInt(users.length);
		User randomuser=users[userIndex];
		
		//Generating a random number of points between 1000 and 20000
		
		int points= 1000+ random.nextInt(20000);
		//Add points to random user
		
		synchronized (randomuser) {
            randomuser.addPoints(points);
            System.out.println("Added " + points + " points to user " + randomuser.getName() + ". Total points: " + randomuser.getPoints());
		
		
		
	}

}
}
