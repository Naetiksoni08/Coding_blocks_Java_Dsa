package blind_45_days_sheet;

public class binary_tree_maximum_path_sum {

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
		int maxsum = Integer.MIN_VALUE;

		public int maxPathSum(TreeNode root) {
			dfs(root);
			return maxsum;

		}

		public int dfs(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int left = Math.max(0, dfs(root.left)); // negative no ko ignore kardo
			int right = Math.max(0, dfs(root.right));

			int fullpath = root.val + left + right;
			
			//update the global path 
			maxsum = Math.max(maxsum, fullpath);
			
			// return the best single-branch path to parent (cannot include both sides)
			return root.val+Math.max(left, right);			
			
		}
	}

}
