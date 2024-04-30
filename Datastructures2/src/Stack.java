//while both peek() and top involve accessing the top element of the stack, peek() is a method specifically designed for this purpose in standard stack implementations,
//while top is often a variable used in custom implementations to keep track of the position of the top element. The actual use and naming conventions may vary depending
//on the programming language and specific implementation.
public class Stack {
	
	//create an array of some size first as we already that stack can be created by using array or linkedlist
	int[] arr=new int[5];
	//The "top" refers to the position where the next element will be added or the position of the current top element that can be removed. 
	int top;
	int size;
	//have a constructor to assign the values. we can have this values without constructor also.
	public Stack() {
		top=-1;
		size=arr.length;
	}
	public void push(int data) {
		// Here before pushing data we have to increase the top value to 1 everytime 
		//Also we have to check if the stack is full or not before inserting
		top++;
		if(top<size) {
		
		arr[top]=data;
		}
		//But if you want the user to know that there is an error about stack overflow use else condition
		else {
			System.out.println("stack overflow");
		}
	}
	//No needx to pass anything as we are just removing the first element.
	public int pop() {
		//here we know that top keeps tract of the element at the first position. so after few pushes if the class calls this pop method it means the top most element will be removed
		//Here if I just use arr[top] then it will return the value at the top but it stays in the stack so to remove that we have to decreement the top . we can do that
		//inside it or outside it also
		
		//Also having the top condiiton checked first will not thow any exception if there anre no elements
		if(top>-1) {
		return arr[top--];
		}
		else {
			System.out.println("stack underfloe"); 
		}
		return 0;
	}
//Implementing peek is also same except we dont remove the value which means we dont do decrement
	public int peek() {
		return arr[top];
	}
	//we cant display in main class directly so we will have a method to display the elements present in stack
	public void disp() {
		for(int n:arr) {
			System.out.println(n);
		}
	}

}
