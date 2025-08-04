package binary_search_tree;

public class valid_binary_search_tree {

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
		public boolean isValidBST(TreeNode root) {
			return ValidBST(root).isbst;

		}

		public bstpair ValidBST(TreeNode root) {
			if(root == null) {
				return new bstpair();
			}
			bstpair left = ValidBST(root.left);
			bstpair right = ValidBST(root.right);
			bstpair selfwork = new bstpair();
			selfwork.max = Math.max(left.max, Math.max(right.max,root.val));
			selfwork.min = Math.min(left.min, Math.max(right.min,root.val));
			selfwork.isbst = left.isbst && right.isbst &&  left.max < root.val && right.min > root.val;
			return selfwork;
		}
	

	class bstpair {
		long min = Integer.MAX_VALUE;
		long max = Integer.MIN_VALUE;
		boolean isbst = true;
	}
}
}
