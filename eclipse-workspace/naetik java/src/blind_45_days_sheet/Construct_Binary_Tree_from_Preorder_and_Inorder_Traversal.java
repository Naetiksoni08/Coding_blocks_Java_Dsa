package blind_45_days_sheet;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return CreateTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
		}

		public TreeNode CreateTree(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
			if (ilo > ihi || plo > phi) {
				return null;
			}
			TreeNode node = new TreeNode(pre[plo]); //// preorder 1st node is root node
			int idx = Search(in, ilo, ihi, pre[plo]); //// search that node in the inorder array which u have made the
			// root node just above this line
			int ne = idx - ilo;
			node.left = CreateTree(pre, plo + 1, ne + plo, in, ilo, ihi);
			node.right = CreateTree(pre, ne + plo + 1, phi, in, ilo, ihi);
			return node;
		}

		public int Search(int[] arr, int si, int ei, int item) {
			for (int i = si; i <= ei; i++) {
				if (arr[i] == item) {
					return i;
				}
			}
			return -1;

		}
		// we would have got a array and the ranges and the data we have to search
	}

}
