package blind_45_days_sheet;

public class count_nodes_equal_to_average_of_subtree {
	int count = 0;

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
		public int averageOfSubtree(TreeNode root) {
			findcountandsum(root);
			return count;
		}

		public int[] findcountandsum(TreeNode root) {
			if (root == null) {
				return new int[] { 0, 0 };
			} // sum , count

			int[] left = findcountandsum(root.left);
			int[] right = findcountandsum(root.right);

			int totalsum = root.val + left[0] + right[0];
			int totalcount = left[1] + right[1] + 1;

			if (root.val == totalsum / totalcount) {
				count++;
			}
			return new int[] { totalsum, totalcount };

		}

	}

}
