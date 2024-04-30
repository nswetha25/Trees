// Implementing BST where we will have binary tree and all the nodes less than the root
//will go on the left side and all the nodes greater will go on the right side
class Node{

    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
    }
}
class BinaryTree{

    Node root;
    public void insert(int data){
       
        root= insertrec(root, data);
        
    }

    public Node insertrec(Node root, int data){
        if(root==null){
            root=new Node(data);
        }
        else if(data<root.data){
            root.left=insertrec(root.left,data);
        }
        else if(data>root.data){
            root.right=insertrec(root.right,data);
        }
        return root;
    }
    //Lets print all the values in - In Order traversal- it is also recrusive- we get sorted values


    public void inorder(){

        inOrderRec(root);

    }

    public void inOrderRec(Node root){
        if(root!=null){
            inOrderRec(root.left);
            System.out.print(root.data+" ");
            inOrderRec(root.right);
        }
    }

}

public class BST {

    public static void main(String[] args){

    BinaryTree tree=new BinaryTree();
    tree.insert(7);
    tree.insert(6); //But when I am inserting one more value again, it should check whether root
    //is already present in the insert function and if it is then it shoul dcheck the value is > or <
    tree.insert(10);
    tree.insert(2);
    tree.insert(3);
    tree.insert(9);
    tree.insert(12);
    tree.insert(0);

    tree.inorder();

    }
    
}
