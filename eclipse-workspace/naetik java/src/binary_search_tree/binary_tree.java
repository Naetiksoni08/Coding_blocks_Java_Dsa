package binary_search_tree;

public class binary_tree {

	// TODO Auto-generated method stub
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public binary_tree(int[] in) {
		root = create_tree(in, 0, in.length - 1);
	}

	private Node create_tree(int[] in, int si, int ei) {
		if(si>ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.val = in[mid];
		nn.left = create_tree(in, si, mid - 1);
		nn.right = create_tree(in, mid+1,ei);
		return nn;
	}
// those tree who do not have any kids or child are called leaf node 
	// generic tree are those tree where there is no restrictions on their kids(number of child par no restriction)
	// binary tree  or binary search tree says that at max 2 kids there should be present 
	// the first node is called root in binary tree or in any tree
}
