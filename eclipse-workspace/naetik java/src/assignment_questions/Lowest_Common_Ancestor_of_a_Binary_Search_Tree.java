package assignment_questions;

import java.util.Scanner;

public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Node root = null;

		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			root = insert(root, val);
		}
		int p = sc.nextInt();
		int q = sc.nextInt();

		Node lca = LCA(root, p, q);
		System.out.print(lca.data);

	}

	private static Node insert(Node root, int val) {
		if (root == null) {
			return new Node(val);

		}
		if (val < root.data) {
			root.left = insert(root.left, val);
		}
		if (val > root.data) {
			root.right = insert(root.right, val);
		}
		return root;
	}

	private static Node LCA(Node root, int p, int q) {
		if (root == null) {
			return null;
		}
		if (p < root.data && q < root.data) {
			return LCA(root.left, p, q);
		} else if (p > root.data && q > root.data) {
			return LCA(root.right, p, q);
		}
		return root;

	}

}

class Node {
	Node right;
	Node left;
	int data;

	public Node(int val) {
		this.data = val;
	}
}
//so basically what im understanding is that doing lca or perfroming lca is much easier in a binary tree basically 
//the code i wrote was for binary tree while the question asked us to wrote the solution with respect to a binary search tree in bst all the node in left should be less than the root 
//while all the nodes on right should be greater than the value of the root lets talk abt the solution wee took a sacanner entered no of node and set the root as null 
//for now then we applied a a loop and enter the rest of the element and now we need to obvio 
//insert those node manually at there correct places then we took p and q whose ancestor we needed to find then we
//called lca and return the data of it then insert function is easy if root is null then we make a new node and
//return it allong with its value if the value is less than roots data which means we need to isnert the 
//vaue in left as the defination of bst says if the value is greater than the root data then er need
//to insert it on right and at the end return the root now the lca method it is just the same if root
//is null then fuck ancestor if pand q is samller than the value of root then left ka call 
//therwise right ka call and at the end simpy return the root and lastly we made a node class
