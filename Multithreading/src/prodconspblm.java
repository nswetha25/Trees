//Here both producer and consumer class without creating the object of queue class they can invoke the method of the queue class as we have created a object in main class and passed
//that reference to the producer and consumer
class Producer extends Thread{
	Queue q;
	public Producer(Queue y) {
		q=y;
		
	}
	public void run() {
		//Lets generate data
		int i=1;
		while(true) {
		q.put(i);
		}
		
		
	}
	
}
class Consumer extends Thread{
	Queue q;
	public Consumer(Queue y) {
		q=y;
		
	}
	public void run() {
		while(true) {
		q.get();
		}
	}
	
}
class Queue{
	int x;
	public void put(int data) {
		x=data;
		System.out.println("I hav eput the data in to x :"+x);
		
	}
	public void get() {
		System.out.println("I have consumerd the data from x :"+x);
	}
	
}
public class prodconspblm {
//As I am creating the object of queue class in this main so it is loosely coupled but if I create the object of queue class directly in the producer class then it is tightly coupled
	public static void main(String[] args) {
		Queue q=new Queue();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		
		p.start();
		c.start();
		

	}

}