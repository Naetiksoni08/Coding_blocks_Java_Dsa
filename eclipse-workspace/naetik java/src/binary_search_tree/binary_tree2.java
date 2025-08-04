package binary_search_tree;

import java.util.Scanner;

import binary_search_tree.binary_tree.Node;

public class binary_tree2 {
	class Node {
		int val;
		static Node left;
		static Node right;

	}

	private Node root;
	Scanner Sc = new Scanner(System.in);

	public binary_tree2() {
		root = createtree();
	}

	private Node createtree() {
		int item = Sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = Sc.nextBoolean();
		if (hlc) { // has left child
			nn.left = createtree();

		}
		boolean rlc = Sc.nextBoolean();
		if (rlc) {
			nn.right = createtree();

		}
		return nn;

	}

	public void Display() { // what we did was we cannot access the display method because it was private so
							// we will make another public method and uske andar we will be calling the code
							// that was inside the private display
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "";
		s = "<--" + nn.val + "-->";
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
		Display(nn.left);
		Display(nn.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if(node==null ) {
			return Integer.MIN_VALUE;
		}
		int lmax = max(Node.left);
		int rmax = max(Node.right);
		return Math.max(node.val, Math.max(lmax, rmax));
		
	}

}
