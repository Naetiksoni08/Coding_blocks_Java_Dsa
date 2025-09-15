package assignment_questions;

import java.util.Scanner;

public class Is_Balanced {

	 class Node {
		int value;
		Node left;
		Node right;
	}

	public Node CreateTree(Scanner sc) {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.value = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree(sc);
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree(sc);
		}
		return nn;
	}

	public static int height(Node nn) {
		if (nn == null) {
			return 0;
		}

		int lh = height(nn.left);
		int rh = height(nn.right);
		return Math.max(lh, rh) + 1;

	}

	public static boolean isbalanced(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean lhc = isbalanced(nn.left);
		boolean rhc = isbalanced(nn.right);

		int lh = height(nn.left);
		int rh = height(nn.right);
		boolean ans = Math.abs(lh - rh) <= 1;
		return lhc && rhc && ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Is_Balanced ib = new Is_Balanced();   // create object (because Node is inner class)
		Node root = ib.CreateTree(sc);          // build the tree
		System.out.println(isbalanced(root)); // call isbalanced and print result
	}
	
}
