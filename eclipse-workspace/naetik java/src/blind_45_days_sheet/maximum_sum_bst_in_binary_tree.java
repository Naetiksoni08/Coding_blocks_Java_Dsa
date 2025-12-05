package blind_45_days_sheet;

public class maximum_sum_bst_in_binary_tree {

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
		public int maxSumBST(TreeNode root) {
			return sumBST(root).ans;

		}

		public bstpair sumBST(TreeNode root) {
			if (root == null) {
				return new bstpair();
			}
			bstpair lbp = sumBST(root.left);
			bstpair rbp = sumBST(root.right);
			bstpair sbp = new bstpair();
			sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
			sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
			sbp.sum = lbp.sum + rbp.sum + root.val;
			sbp.isbst = lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min>root.val;
			if(sbp.isbst == true) {
				sbp.ans = Math.max(sbp.sum, Math.max(lbp.ans, rbp.ans));
			}else {
				sbp.ans = Math.max(lbp.ans, rbp.ans);
			}
			return sbp;
		}
		

	}

	class bstpair {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		boolean isbst = true;
		int sum = 0;
		int ans = 0;
	}
}

//so basically sum joh hai voh current subtree ka sum nikal ta hai aur ans pure tree ka max sum rakhta hai
