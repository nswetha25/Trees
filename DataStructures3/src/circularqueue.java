//Previously we implemeented normal queue but here implementing ciruclar queue because when we dequeue an element we know still one place is left but when we insert any new 
//element it will not take it. so if we implmenet circular it takes
public class circularqueue {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.dequeue());
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);
		System.out.println(q.peek());
		//q.enqueue(80);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		

	}

}
