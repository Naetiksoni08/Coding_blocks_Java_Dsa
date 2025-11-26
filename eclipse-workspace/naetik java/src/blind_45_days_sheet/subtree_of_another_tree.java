package blind_45_days_sheet;

public class subtree_of_another_tree {

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
		public boolean isSubtree(TreeNode root, TreeNode subRoot) {
			if (root == null) {
				return false;
			}

			if (subtree(root, subRoot)) {
				return true;
			}

			return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
		}

		public boolean subtree(TreeNode tree1, TreeNode tree2) {
			if (tree1 == null && tree2 == null) {
				return true;
			}
			if (tree1 == null || tree2 == null) {
				return false;
			}
			if (tree1.val != tree2.val) {
				return false;
			}
			boolean left = subtree(tree1.left, tree2.left);
			boolean right = subtree(tree1.right, tree2.right);
			return left && right;

		}

	}

}
