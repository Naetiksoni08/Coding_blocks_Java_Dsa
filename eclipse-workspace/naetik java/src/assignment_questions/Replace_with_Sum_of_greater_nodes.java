package assignment_questions;

import java.util.Scanner;

public class Replace_with_Sum_of_greater_nodes {
	// left root right
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // 20 30 40 50 60 70 80
		}

		generateans(arr);
		Node root = buildbst(arr, 0, n-1);
		display(root);

	}

	static int sum = 0;

	public static void generateans(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) { // 80 sai start hua 20 tk gaya
			sum += arr[i]; // 0+80 = 80 , 80+70 = 150
			arr[i] = sum; //replace the sum with the arr element so 80 ki jagah 80 aah jayega, 70 ki jagah 150 and so on

		}

	}

	public static Node buildbst(int[] arr, int start, int end) { // now we need to build the tree too
		if (start > end) { // agar start joh hai voh bada ho ho jata hai end sai toh null return kardo
			return null;
		}
		int mid = (start + end) / 2; // We take the middle element of the current subarray as the root.Why middle? Because this ensures the tree is balanced:
		Node root = new Node(arr[mid]); // make it a node 
		root.left = buildbst(arr, start, mid - 1);
		root.right = buildbst(arr, mid + 1, end);
		return root;

	}

	public static void display(Node root) {
		if (root == null) { // root null hai kuch ni
			return;
		} 
		System.out.print(root.data + " "); // preorder format 
		display(root.left);
		display(root.right);
	}

}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int val) {
		this.data = val;
	}
}



//arr = [350, 330, 300, 260, 210, 150, 80]
//Start indices: start = 0, end = 6
//mid = (0 + 6)/2 = 3 → root = arr[3] = 260
//Root = 260
//Left subarray: [350, 330, 300] → indices 0 to 2
//Right subarray: [210, 150, 80] → indices 4 to 6
