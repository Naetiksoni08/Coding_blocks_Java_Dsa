package blind_45_days_sheet;

import java.util.*;

public class create_tree_using_level_order_traversal {

	class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}
	}
	private Node root;

	public create_tree_using_level_order_traversal() {
		CreateRoot();
	}

	
	
	private void CreateRoot() {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node nn = new Node(data);
		root = nn;
		Queue<Node> q = new LinkedList<>();
		q.add(nn);
		while (!q.isEmpty()) {
			Node rv = q.remove(); // both poll and remove removes from starting
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a != -1) {
				Node node = new Node(a);
				rv.left = node;
				q.add(node);
			}
			if (b != -1) {
				Node node = new Node(b);
				rv.right = node;
				q.add(node);
			}
		}
	}

	public void Display() {
		display(root);
	}

	private void display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "<--" + nn.val + "-->";
		if (nn.left != null) {
			s = nn.left.val + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		display(nn.left);
		display(nn.right);

	}

	public static void main(String[] args) {
		create_tree_using_level_order_traversal tree = new create_tree_using_level_order_traversal();
		tree.Display();

	}

}

//10 20 30 40 50 -1 70 -1 -1 60 -1 -1 -1 -1 -1
