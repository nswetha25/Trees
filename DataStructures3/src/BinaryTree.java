//so u have a method insert which takes data but u need node for that so we create node
class Node{
	//Node will have data and next node but in tree we have left and right node 
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data=data;
	}
}
public class BinaryTree {
Node root;
	public void insert(int data) {
		//when we say insert we have to create a root first
		root=insertrec(root,data); 
		
	}
	public Node insertrec(Node root, int data) {
		if(root==null) 
			root=new Node(data);
			else if(data<root.data) {
				root.left=insertrec(root.left,data);
			}
			else if(data>root.data) {
				root.right=insertrec(root.right,data);
			}
			
			return root;
		}
	
	//Inorder traversal
	public void inorder() {
		inorderrec(root);
	}
	public void inorderrec(Node root) {
		if(root!=null) {
			inorderrec(root.left);
	
		System.out.print(root.data+" ");
		inorderrec(root.right);
		}
	}
	
	//preorder traversal
	
	public void preorder() {
		preorderrec(root);
	}
	public void preorderrec(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preorderrec(root.left);
	
		preorderrec(root.right);
		}
	}
	//post order traversal
	
	public void postorder() {
		postorderrec(root);
	}
	public void postorderrec(Node root) {
		if(root!=null) {
		
			postorderrec(root.left);
	
		postorderrec(root.right);
		System.out.print(root.data+" ");
		}
	}
}
