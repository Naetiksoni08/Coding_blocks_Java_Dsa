package blind_45_days_sheet;

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
			return Balanced(root);
		}

		public boolean Balanced(TreeNode root) {
			if (root == null) {
				return true;
			}

			boolean lb = Balanced(root.left);
			boolean rb = Balanced(root.right);
			
			boolean sb = Math.abs(height(root.left) - height(root.right)) <= 1;
			boolean ans = lb && rb && sb;
			return ans;

		}

		public int height(TreeNode root) {
			if (root == null) {
				return -1;
			}
			int left = height(root.left);
			int right = height(root.right);
			return Math.max(left, right) + 1;
		}
	}

}
