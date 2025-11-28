package blind_45_days_sheet;

import java.util.*;

public class tree_right_side_view {

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
		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			rightsideview(root, 1, ll);
			return ll;
		}

		int maxd = 0;

		public void rightsideview(TreeNode root, int cl, List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (maxd < cl) {
//				System.out.println(root.val + " ");
				ll.add(root.val);
				maxd = cl;
			}
			rightsideview(root.right, cl + 1, ll);
			rightsideview(root.left, cl + 1, ll);

		}

	}

}
