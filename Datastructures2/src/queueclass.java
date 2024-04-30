

public class queueclass {

	public static void main(String[] args) {
		Queue q=new Queue();
		
q.enqueue(10);
q.enqueue(20);

q.show();
System.out.println(q.dequeue());
q.show();
	}
 
}
