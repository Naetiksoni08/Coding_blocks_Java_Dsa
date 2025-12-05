package blind_45_days_sheet;

public class create_bst_using_inorder_traversal {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private static Node root;

	public create_bst_using_inorder_traversal(int[] arr) {
		root = createTree(arr, 0, arr.length - 1);

	}

	private Node createTree(int[] arr, int si, int ei) {
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.val = arr[mid];
		nn.left = createTree(arr, si, mid - 1);
		nn.right = createTree(arr, mid + 1, ei);
		return nn;
	}

	public void Display(Node nn) {
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
		Display(nn.left);
		Display(nn.right);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
		create_bst_using_inorder_traversal bst = new create_bst_using_inorder_traversal(arr);
		bst.Display(root);
	}

}

//so static vairbale or method belong to the class and nons tatic beolngs to the object so static vaibale cannot access the non static ones u ahve to make the non static to be static ut non static elong to the object and each object knows where it comes from that is the class so non static can access static