package blind_45_days_sheet;

public class diameter_of_binary_tree {

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
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root);
		}

		public int diameter(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int ld = diameter(root.left); // left diameter
			int rd = diameter(root.right); // right diameter
			int sd = height(root.left) + height(root.right) + 2; // self diameter
			return Math.max(sd, Math.max(ld, rd));

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
