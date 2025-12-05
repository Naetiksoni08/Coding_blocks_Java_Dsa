package blind_45_days_sheet;

public class Validate_Binary_Search_Tree {

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
		public boolean isValidBST(TreeNode root) {
			return ValidBST(root).isbst;
		}

		public bstpair ValidBST(TreeNode root) {
			if (root == null) {
				return new bstpair();
			}
			bstpair lbp = ValidBST(root.left);
			bstpair rbp = ValidBST(root.right);
			bstpair sbp = new bstpair();
			sbp.max = Math.max(lbp.max, Math.max(rbp.max, sbp.max));
			sbp.min = Math.min(lbp.min, Math.min(rbp.min, sbp.min));
			sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
			return sbp;

		}

	}

	class bstpair {
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		boolean isbst = true;

	}

}
