class Node{
	int data;
	//Along with data we also need to have a create a refernece. In java if we want to refer something we will create a refereence for it.so we create reference for next node
	//so type of that particular referece is also a node. we name it as next
	Node  next;
	//Here the constructor will have the data assigned but initially we know the ref will be null 
	public Node(int data) {
		this.data=data;
		next=null;
	}
	
}
public class LinkedList {
     //bascially everytime we need to add an element we need to create a node which consists of two part. For data and reference. so we create a class 'Node' for this
	public void add(int data) {
		Node newnode=new Node(data);
		//if we want we can specify the values for the above class using object newnode.data=data   Other wise create a constructor and pass this data directly
		
		//Also one more thing to understand when we have the node created and it is the first one then we need to have head pointing to it. If its not the first then also 
		//we need some changes like referring to some other node or if it is last we need to make the ref as null
	}
}
