package assignment_questions;

import java.util.*;

public class Add_duplicate_BST {

	private static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	private int size;

	public Add_duplicate_BST() {
		this.root = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void add(int data) {
		this.add(data, this.root);
	}

	private void add(int data, Node node) {
		if (this.isEmpty()) {
			Node n = new Node(data, null, null);
			this.size++;
			this.root = n;
			return;
		} else {
			if (data > node.data && node.right == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.right = n;
			} else if (data < node.data && node.left == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.left = n;
			} else if (data > node.data) {
				add(data, node.right);
			} else if (data < node.data) {
				add(data, node.left);
			}
		}
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + " => ");
		} else {
			System.out.print("END => ");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.print(" <= " + node.right.data);
		} else {
			System.out.print(" <= END");
		}
		System.out.println();
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}
	}

	public void duplicate() {
		this.duplicate(this.root);
	}

	private void duplicate(Node root) {
		// Your Code Goes Here
		if (root == null) {
			return;
		}
	    Node duproot = new Node(root.data, null, null);//This is a new node with the same value as root.//Initially, duproot.left and duproot.right are null.

		duproot.left = root.left; // left ke pure subtree ko uthakar duplicate root ke left mai rakh dia  data vagera sb mil gaya hoga...  // attach original left subtree to duplicate
		root.left = duproot;  // aur bas end mai uss duplicate node ko root ke left mai daal dia ...  // attach duplicate as left child of root
		//duproot.left now points to the original left subtree 

		duplicate(duproot.left); // why duproot because humani root ka left ka address and nodes sab kuch duproot ke left ko dediye the
		duplicate(root.right);

	}

	public static void main(String[] args) {
		BST bst = new BST();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			bst.add(s.nextInt());
		}
		bst.duplicate();
		bst.display();
	}
}



//root.left is now “taken” by the duplicate node.
//The original left tree is now hanging under duproot.left.
//To continue duplicating all original nodes, we follow the original left subtree, which is duproot.left.



