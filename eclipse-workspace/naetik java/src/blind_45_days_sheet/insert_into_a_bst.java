package blind_45_days_sheet;

public class insert_into_a_bst {
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
		public TreeNode insertIntoBST(TreeNode root, int val) {
			if (root == null) {
				return new TreeNode(val); // if we reach the null then make a new node and set value into it and return 
			}
			if (root.val < val) { // if root ka data is smaller than our value then go in right say 15 is root an our data is 17 so go right
				root.right = insertIntoBST(root.right, val);
			} else {
				root.left = insertIntoBST(root.left, val); // else go left
			}
			return root;

		}

	}

}
