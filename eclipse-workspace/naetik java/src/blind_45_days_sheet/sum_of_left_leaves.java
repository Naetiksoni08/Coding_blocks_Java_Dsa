package blind_45_days_sheet;

public class sum_of_left_leaves {

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
		public int sumOfLeftLeaves(TreeNode root) {
			return solve(root, false);

		}

		public int solve(TreeNode root, boolean isleft) {
			if (root == null)
				return 0;

			if (root.left == null && root.right == null) {
				return isleft ? root.val : 0;
			}
			return solve(root.left, true) + solve(root.right, false);

		}
	}
}
