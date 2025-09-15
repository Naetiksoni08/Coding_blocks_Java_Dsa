package assignment_questions;

import java.util.*;


public class Binary_tree_print_all_leaf_node {

	 static class Node {
		int value;
		Node left;
		Node right; // this part is simple

		public Node(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // took scanner
		int root = sc.nextInt(); // root input karlia
		Node nn = new Node(root); // ek naya node banya usmai root daal dia
		// hy queue becuase wee need to take the input in level order way
		Queue<Node> q = new LinkedList<>();
		
	     q.add(nn); // 1st root or node daal kar start kia // q = [1]
	     while(!q.isEmpty()) { // jab tk empty nai hota 
	    	 Node rv = q.poll(); // poll kia element
	    	 int leftchild = sc.nextInt(); // check if that polled element has further childs tske input of them
	    	 int rightchild = sc.nextInt();
	    	 if(leftchild!=-1) { // left chhild exists
	    		 Node newNode = new Node(leftchild); // ek new node banaya aur usmai left child add kardia
	    		 rv.left = newNode; // fir uss left child ko rmeoved element ke left mai dalo
	    		 q.add(newNode); // aur pura node ko push kardo in the queue
	    		 
	    	 }
	    	 if(rightchild!=-1) {
	    		 Node newNode = new Node(rightchild);
	    		 rv.right = newNode;
	    		 q.add(newNode);
	    	 }
	    	 
	     }
	     displayleafnode(nn) ;

	}

	public static void displayleafnode(Node root) {
		if(root==null) { // agar root hi null hai say 20 is root 40 and 60 are childs
			return;
		}
		
		if(root.left==null && root.right == null) { // agar 20 ke left aur right null hai toh simply value print karo of root that is 20 aur return kr jao 
			System.out.print(root.value+" ");
			return;
		}
		displayleafnode(root.left); // call laga di ki left mai sai dhundh ke aah leaf node 
		displayleafnode(root.right); // aur right mai sai dhudh ke lag right node 
		
		
	}

}
