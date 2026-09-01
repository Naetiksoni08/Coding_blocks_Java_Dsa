package blind_45_days_sheet;

import java.util.*;

public class increasing_order_search_tree {

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
		public TreeNode increasingBST(TreeNode root) {
			return increasingbst(root);

		}

		private TreeNode increasingbst(TreeNode root) {
			List<TreeNode> ll = new ArrayList<>();
			inorder(root, ll);

			for (int i = 0; i < ll.size(); i++) {
				ll.get(i).left = null;
				if (i + 1 < ll.size()) {
					ll.get(i).right = ll.get(i + 1);
				} else {
					ll.get(i).right = null;
				}

			}
			return ll.get(0);
		}

		private void inorder(TreeNode node, List<TreeNode> ll) {
			if (node == null) {
				return;
			}
			inorder(node.left, ll); // left
			ll.add(node); // root
			inorder(node.right, ll); // right
		}
	}

}
