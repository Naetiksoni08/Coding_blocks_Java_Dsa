package blind_45_days_sheet;

import java.util.*;

public class Implementation_OF_BT {
	class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Implementation_OF_BT() {
		root = CreateTree();
	}

	public Node CreateTree() {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;

		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree();
		}

		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}
		return nn;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) { // this is preorder traversal only
		if (nn == null) {
			return;
		}
		String str = "";
		str = "<--" + nn.data + "-->";
		if (nn.left != null) {
			str = nn.left.data + str;
		} else {
			str = "." + str;
		}
		if (nn.right != null) {
			str = str + nn.right.data;
		} else {
			str = str + ".";
		}
		System.out.println(str);
		Display(nn.left);
		Display(nn.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int lmax = max(nn.left);
		int rmax = max(nn.right);
		return Math.max(nn.data, Math.max(lmax, rmax));

	}

	public boolean find(int item) {
		return find(root, item);
		// this class ke data member ko access karvata hai
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.data == item) {
			return true;
		}
		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;

	}

	public int height() {
		return height(root);
	}

	private int height(Node nn) { // maximum diff between root to leaf is the height of the tree
		// assuming the height to be 0 not 1 by default
		if (nn == null) {
			return -1; // if we return 0 then the height of the single root node becomes 1 that means
						// single node height becomes 1 if we assume the height by defualt to be 1 then
						// we can return 0
		}

		int leftheight = height(nn.left);
		int rightheight = height(nn.right);
		return Math.max(leftheight, rightheight) + 1;

	}

	public void levelorder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node rv = q.remove();
			System.out.println(rv.data + " ");
			if (rv.left != null) {
				q.add(rv.left);
			}
			if (rv.right != null) {
				q.add(rv.right);
			}

		}
		System.out.println();
	}

}
