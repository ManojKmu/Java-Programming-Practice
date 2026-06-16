package Trees;
//Binary search tree complexity is O(log n) ,it is more efficient than binary tree
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class BinarySearchTree {
public Node insert(Node root,int newData) {
	Node newNode=new Node(newData);
	if(root==null) {
		root=newNode;// create new node if tree is empty
	}
	if(newData<root.data) {
		root.left=insert(root.left,newData);
	}
	if(newData>root.data) {
		root.right=insert(root.right,newData);
	}
	return root;
}

//In-order traversal (Left → Root → Right)
public void inOrder(Node root) {
	if(root==null) {
		return;
	}  else {
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  BinarySearchTree bst=new BinarySearchTree();
  Node root=null;
  System.out.println("Enter the no.of elements:");
  int node=sc.nextInt();
  System.out.println("The Elements are:");
  for(int i=0;i<node;i++)
  {
	  int val=sc.nextInt();
	  root=bst.insert(root,val);
  }
  System.out.print("The Inorder Traversal is:");
  bst.inOrder(root);
	}

}
/*
Enter the no.of elements:
4
The Elements are:
12
8
15
4
The Inorder Traversal is:4 8 12 15 
*/