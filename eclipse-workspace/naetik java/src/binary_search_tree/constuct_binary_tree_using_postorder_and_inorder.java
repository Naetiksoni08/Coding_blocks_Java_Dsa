package binary_search_tree;

public class constuct_binary_tree_using_postorder_and_inorder {
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
		public TreeNode buildTree(int[] inorder, int[] postorder) {
			return Create(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1);

		}

		public TreeNode Create(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
			if(plo>phi || ilo>ihi) {
				return null;
			}
			TreeNode node = new TreeNode(post[phi]);
			int idx = search(in, post[phi], ilo, ihi);
			int noofelements = idx-ilo;
			node.left = Create(post, plo,plo+noofelements-1, in, ilo, idx);
			node.right = Create(post, plo+noofelements,phi-1, in, idx+1, ihi);
			return node;

		}
		
		public int search(int[]in,int item,int si,int ei) {
			for(int i = si;i<=ei; i++) {
				if(in[i]==item) {
					return i;
				}
			}
			return 0;
		}

	}
}