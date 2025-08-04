package binary_search_tree;

public class sum_root_to_leaf_numbers {
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
		public int sumNumbers(TreeNode root) {
			return Number(root,0);
	
		}

		public int Number(TreeNode root, int sum) {
			if(root == null) { // main root hi null hai toh 0
				return 0;
			}
			if(root.left== null && root.right == null) {
				return sum*10+root.val; // agar left aur right dono hi null hai toh leaf node hai bhai sum return karo 
			}
			int left  = Number(root.left,sum*10+root.val);
			int right  = Number(root.right,sum*10+root.val);
			return left+right;
		}
		
	}

}
