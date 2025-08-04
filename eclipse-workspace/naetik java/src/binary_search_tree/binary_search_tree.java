package binary_search_tree;

public class binary_search_tree {
	
	class Node{
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public binary_search_tree(int []arr) {
		root = create_tree(arr,0,arr.length-1);
	}

	private Node create_tree(int[] arr, int si, int ei) {
		if(si>ei) {
			return null;
		}
	int mid = (si+ei)/2;
	Node nn = new Node();
	nn.val = arr[mid];
	nn.left = create_tree(arr,si,mid-1);
	nn.right = create_tree(arr,mid+1,ei);
		return nn;
	}

	public static void main(String[] args) {
		int []arr = {10,20,30,40,50,60,70,80};
		binary_search_tree bt = new binary_search_tree(arr);
	}
//create a tree using in order traversal array mai inorder traversal given hai
//	inorder traversal given hai toh sorted hoga 

}
