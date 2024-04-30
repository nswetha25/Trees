//Here we can avoid dead lock . see the explanation . In next program we will see the deadlock by just chanign the resources order.
class Library implements Runnable{
	String res1=new String("Java book");
	String res2=new String("DSA");
	String res3=new String("Springboot");
	public void run() {
		
		String tname=Thread.currentThread().getName();
		if("student1".equals(tname)) {
			try {
				//If student1 enters the loop he will take some time to search and then apply lock to that book
				Thread.sleep(3000);
				synchronized(res1) {
					System.out.println(" Student 1 has accquired :"+res1);
					//Again he will search the book
					Thread.sleep(3000);
					synchronized(res2) {
						System.out.println(" Student 1 has accquired :"+res2);
						Thread.sleep(3000);
						synchronized(res3) {
							System.out.println(" Student 1 has accquired :"+res3);
						}
					}
				}
				
			}
			catch(Exception e) {
				System.out.println("pblm");
			}
		}
		//In the below part as we are giving resources to res1,res2, and then res3 . so what happens is lets say if student1 goes first he will go and sleep for some time
		//in mean time it comes to student2 and he will come and sleep for some time. then again student1 comes and lock the book res1 and go to sleep again. Now student2 comes and check
		//for res1 and as he did not find he will go to block state . Now it goes up and locks res2 and go to sleep. Noe student2 comes and he will not find any book so he stays
		//in the same block state and now agina student1 blocks res3  and oce he is done and once it comes out of the loop he release all the locks. so now the student 2 will
		//be there in block state so he will come and use the resources. 
		else {
			try {
				//If student1 enters the loop he will take some time to search and then apply lock to that book
				Thread.sleep(3000);
				synchronized(res1) {
					System.out.println(" Student 2 has accquired :"+res1);
					//Again he will search the book
					Thread.sleep(3000);
					synchronized(res2) {
						System.out.println(" Student 2 has accquired :"+res2);
						Thread.sleep(3000);
						synchronized(res3) {
							System.out.println(" Student 2 has accquired :"+res3);
						}
					}
				}
				
			}
			catch(Exception e) {
				System.out.println("pblm");
			}
			
		}
		
	}
}
public class Multi11deadlock {

	public static void main(String[] args) {
		Library lb=new Library();
		Thread t1=new Thread(lb);
		Thread t2=new Thread(lb);
		t1.setName("student1");
		t2.setName("student2");
		t1.start();
		t2.start();
		
		

	}

}
