package blind_45_days_sheet;

public class lowest_common_ancestor_2_leetcode {

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
			
			if(!exist(root,p) || !exist(root,q)) { // if or q doesnt exist then null
				return null;
			}
			if (root == null) {
				return null;
			}
			if (root == p || root == q) {
				return root;
			}

			TreeNode left = lowestCommonAncestor(root.left, p, q);
			TreeNode right = lowestCommonAncestor(root.right, p, q);
			if (left != null && right != null) {
				return root;
			} else if (left == null) {
				return right;
			} else {
				return left;
			}
		}

		private boolean exist(TreeNode root, TreeNode target) {
			if(root==null ) {
				return false;
			}
			
             if(root==target) {
            	 return true;
             }
             return exist(root.left, target) || exist(root.right, target);
		}

	}

}
