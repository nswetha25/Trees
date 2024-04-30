//I dont think we have anything related to Tree as inbuilt class . but we have inbuilt class for binarytree
public class treestructure {

	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.insert(8);
		tree.insert(7);
		tree.insert(2);
		tree.insert(5);
		tree.insert(12);
		tree.insert(15);
		tree.insert(17);
		System.out.println("Inorder traversal");
		tree.inorder();
		System.out.println("pre order traversak");
		tree.preorder();
		System.out.println("post order traveral");
		tree.postorder();
		
	}

}
