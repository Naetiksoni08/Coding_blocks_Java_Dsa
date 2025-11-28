package blind_45_days_sheet;

public class lowest_common_ancestor_leetcode {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
			// this is the 1st case if both p and q are in diff branch...// if p and q are
			// in diff branch then root is the ancestor
			if(root==null) {
				return null;
			}
			if (root == p || q == root) {
				return root;
			}
			TreeNode left = lowestCommonAncestor(root.left, p, q);
			TreeNode right = lowestCommonAncestor(root.right, p, q);
			if (right != null && left != null) {
				return root;
			} else if (left == null) {
				return right;
			} else {
				return left;
			}

		}
	}

}
