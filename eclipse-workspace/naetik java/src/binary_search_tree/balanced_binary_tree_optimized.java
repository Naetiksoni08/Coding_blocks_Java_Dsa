package binary_search_tree;

import binary_search_tree.diameterofabinarytree_optimized.Solution.Diapair;

public class balanced_binary_tree_optimized {

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
		public boolean isBalanced(TreeNode root) {
			return isBalance(root).isBalanced;
			
			}
			public BalancedPair isBalance(TreeNode root) {
				if(root==null) {
					return new BalancedPair();
				}
				BalancedPair left = isBalance(root.left);
				BalancedPair right = isBalance(root.right);
				BalancedPair self = new BalancedPair();
				self.ht = Math.max(left.ht,right.ht)+1; // for height
				boolean selfpair = Math.abs(left.ht-right.ht) <=1;
				self.isBalanced = left.isBalanced && right.isBalanced && selfpair; //self piar was boolean already 
				return self;
				
			} 
			class BalancedPair{
				boolean isBalanced = true;
				int ht = -1;
				
				
			}
			

		}
	}

