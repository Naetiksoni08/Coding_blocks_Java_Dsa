package binary_search_tree;


public class Lowest_common_ancestor_LCA_2 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		private boolean foundp = false;
		private boolean foundq = false;
		
		public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
	        return lowestCommonAncestor(root, p, q);
	        
	    }
		public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
			
			if (root == null) {
				return null;
			}
			TreeNode left = lowestCommonAncestor(root.left, p, q); 
			TreeNode right = lowestCommonAncestor(root.right, p, q); 
			if(root == p) {
				foundp = true;
				return root;
			}
			if(root == q) {
				foundq = true;
				return root;
			}
			
			if (root == p || root == q) { 
				return root;
			}
			
			
			if (left != null && right != null) { 
				return root; 
				

			} else if (left == null) {
				return right;
			} else {
				return left;
			} 
		}
	}
//just check karlia ki agar p and q exists karta hia ya nai 
}
