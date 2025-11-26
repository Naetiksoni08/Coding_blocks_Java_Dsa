package blind_45_days_sheet;

import java.util.*;

public class path_sum_2_leetcode {

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
		public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
			List<List<Integer>> result = new ArrayList<>();
			List<Integer> ll = new ArrayList<>();
			path(root, targetSum, result, ll);
			return result;

		}

		public void path(TreeNode root, int target, List<List<Integer>> result, List<Integer> ll) {
			if (root == null) {
				return;
			}

			ll.add(root.val);

			if (root.left == null && root.right == null && root.val == target) {
				result.add(new ArrayList<>(ll));
			}

			path(root.left, target - root.val, result, ll);
			path(root.right, target - root.val, result, ll);

			ll.remove(ll.size() - 1);

		}

	}

}
