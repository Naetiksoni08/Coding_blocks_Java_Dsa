package binary_search_tree;

public class Construct_Binary_Tree_from_Preorder_and_Inorder {
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
			TreeNode node = new TreeNode(pre[plo]); // preorder ke first number ko root bana dia
			int idx = search(in, pre[plo], ilo, ihi); // inorder ke array mai search karo preorder ka first root but
														// inorder ke low sai leke in order ke high ke beech mai
			int noofelement = idx - ilo; // idx yani 5th index - plo yani 0th index  = 4 no of elements ab ussi 4 no of elements ko add kardo inside the plp so we will get the 5th index and we wanted to go ther eonly ab 5+1 6th index sai entire phi tk will be our right portion 
			node.left = CreateTree(pre, plo + 1, plo + noofelement, in, ilo, idx - 1);
			node.right = CreateTree(pre, plo+noofelement + 1, phi, in, idx + 1, ihi);
			return node;
              
		}

		public int search(int[] in, int item, int si, int ei) {
			for (int i = si; i <= ei; i++) {
				if (in[i] == item) {
					return i;
				}
			}
			return 0;

		}
	}

}
