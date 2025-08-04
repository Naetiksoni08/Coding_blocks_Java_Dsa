package binary_search_tree;

import binary_search_tree.Diameter_of_bianry_tree.TreeNode;

public class balanced_binary_tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public boolean isBalanced(TreeNode root) {
			if (root == null) {
				return true;
			}
			int leftheight = height(root.left);
			int rightheight = height(root.right);
			
			boolean selftbalanced = Math.abs(leftheight - rightheight) <= 1;
			boolean leftbalance = isBalanced(root.left);
			boolean rightbalance = isBalanced(root.right);
			
			return leftbalance && rightbalance && selftbalanced;

		}



	public int height(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftheight = height(root.left);
		int rightheight = height(root.right);
		return Math.max(leftheight, rightheight) + 1;

	}

	}
	//order of n^2
}
