package blind_45_days_sheet;

import java.util.*;

public class binary_tree_level_order_2 {

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
		public List<List<Integer>> levelOrderBottom(TreeNode root) {
			List<List<Integer>> result = new ArrayList<>();
			if (root == null) {
				return result;
			}
			Queue<TreeNode> q = new LinkedList<>();
			q.add(root);
			while (!q.isEmpty()) {
				int size = q.size();
				List<Integer> ll = new ArrayList<>();
				for (int i = 0; i < size; i++) {
					TreeNode rv = q.remove();
					ll.add(rv.val);

					if (rv.left != null) {
						q.add(rv.left);
					}
					if (rv.right != null) {
						q.add(rv.right);
					}
				}
				result.add(ll);
				

			}
			Collections.reverse(result);
			return result;

		}
	}

}
