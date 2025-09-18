package assignment_questions;

import java.util.*;


public class Right_side_view {
	static int maxd = 0;

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int val) {
			this.data = val;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();
		Node root = new Node(item);
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node rv = q.poll();
			int firstchild = sc.nextInt();
			int secondchild = sc.nextInt();
			if(firstchild!=-1) {
				Node newnode = new Node(firstchild);
				q.add(newnode);
				rv.left = newnode;
			}
			if(secondchild!=-1) {
				Node newNode = new Node(secondchild);
				q.add(newNode);
				rv.right = newNode;
			}
			
		}
		printRightSide(root,1);
		
	}

	public static void printRightSide(Node root, int currentlevel) {
		if (root == null) {
			return;
		}

		if(currentlevel>maxd) {
			System.out.print(root.data + " ");
			maxd=currentlevel;
		}
			printRightSide(root.right, currentlevel + 1);
			printRightSide(root.left, currentlevel + 1);
		}
	}


// see the first way is mai level order traversal lagau aur fir har node ki last value will be my answer 
// the logic of which is below 

//	public List<Integer> RightsideView(Node root) {
//	List<Integer> ll = new ArrayList<>();
//	if (root == null) {
//		return ll;
//	}
//	Queue<Node> q = new LinkedList<>();
//	q.add(root);
//	while (!q.isEmpty()) {
//		int size = q.size();
//		for (int i = 0; i < size; i++) {
//			Node rv = q.remove();
//		
//			if(i==size-1) {
//				ll.add(rv.data);
//			}
//			
//			if (rv.left != null) {
//				q.add(rv.left);
//			}
//			if (rv.right != null) {
//				q.add(rv.right);
//			}
//
//		}
//	}
//	return ll;
//
//}
