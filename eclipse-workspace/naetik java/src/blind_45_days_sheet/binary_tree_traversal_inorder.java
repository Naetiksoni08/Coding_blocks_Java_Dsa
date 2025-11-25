package blind_45_days_sheet;

import java.util.*;

public class binary_tree_traversal_inorder {

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
		public List<Integer> inorderTraversal(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			Inorder(root, ll);
			return ll;

		}

		private void Inorder(TreeNode root, List<Integer> ll) {
			if (root == null) {
				return;
			}
			Inorder(root.left, ll);
			ll.add(root.val);
			Inorder(root.right, ll);

		}
	}

}
