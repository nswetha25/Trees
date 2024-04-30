//Here when u come next time instead of hardcoding the value array size use without it
public class Queue {
	private int front;
	private int rear;
	private int size;
	private int len;
	private int[] arr; 
	//I will be using constructor to define those values not necessary but I will use
	public Queue() {
		front =0;
		rear=-1;
		size=0;
		arr=new int[4];
		len=arr.length;
		
	}
	
public void enqueue(int data) {
	//rear++;
	//Instead of using rear++ we will be using modulo operatio as discussed
	//Here first check if the queue is full full or not before inserting any new element
	if(!isFull()) {
	rear=(rear+1)%4;
	arr[rear]=data; 
	size++;
	}
	else {
		System.out.println("queue is full");
	}
}
//Also I want to do the samething for dequeue if there is no element present to print we need to check the conditon first and then print no element to present
public int dequeue() {
	
	if(isEmpty()) 
	{
	throw new RuntimeException("Queue is Empty");
	}
	int data=arr[front];
	front=(front+1)%4;
	size--;
	 return data;
	 
}

public int peek() {
	if(isEmpty()) 
	{
	throw new RuntimeException("Queue is Empty");
	}
	int data=arr[front];

	 return data;
	
}

//Lets check if the queue is full or not before inserting because if I try to insert even if it is full it is not throwing any error but it is removing the first element and insertong the latest one
public boolean isFull() {
	return size==4;
}
public boolean isEmpty() {
	return size==0;
}
public void show() {
	for(int i=front;i<size;i++) {
		System.out.println(arr[i]+ " ");
	}
}
} 
