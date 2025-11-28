package blind_45_days_sheet;

import java.util.*;

public class tree_left_side_view {

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
		public List<Integer> leftside(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			leftsideview(root, 1, ll);
			return ll;

		}

		int maxd = 0;

		public void leftsideview(TreeNode root, int cl, List<Integer> ll) {
			if (root == null) {
				return;

			}
			if (maxd < cl) {
				ll.add(root.val);
				maxd = cl;
			}
			leftsideview(root.left, cl + 1, ll);
			leftsideview(root.right, cl + 1, ll);
		}
	}

}
