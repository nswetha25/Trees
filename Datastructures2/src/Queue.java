
public class Queue {
	//whenever we use queue we ned certain variables like front,rear , size, array
	private int front;
	private int rear;
	private int size;
	private int[] arr; 
	//I will be using constructor to define those values not necessary but I will use
	public Queue() {
		front =0;
		rear=-1;
		size=0;
		arr=new int[4];
	}
public void enqueue(int data) {
	rear++;
	arr[rear]=data; 
	size++;
}
public int dequeue() {
	//Here if I directly return data I also have to move the front to next pointer. If I do that then it will not return the first element. so I am storing it in data variable
	//then moving the front variable and finally returning the element
	int data=arr[front];
	front++;
	 return data;
	 
}
public void show() {
	//Below one willprint the values but it will print the other values as 0 when we dont provide them but that is not expected it should not print zero
//	for(int n:arr) {
//		System.out.println(n+" ");
//	}
	//Here if I start with i=0 then all the elements present in the arry will print but there are elments that we remove usin dequeue so we will be using front which means it is the
	//the first element pointintg in the arry
	for(int i=front;i<size;i++) {
		System.out.println(arr[i]+ " ");
	}
	
}
}
