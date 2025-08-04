package binary_search_tree;

public class symmetric_tree {
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
		public boolean isSymmetric(TreeNode root) {
			return Symmetric(root.left, root.right);

		}

		public boolean Symmetric(TreeNode root1, TreeNode root2) {
			if (root1 == null && root2 == null) {
				return true;

			}
			if (root1 == null || root2 == null) {
				return false;

			}
			if (root1.val != root2.val) {
				return false;
			}
			boolean left = Symmetric(root1.left, root2.right);
			boolean right = Symmetric(root1.right, root2.left);
			return left && right;

		}

//		in this question we did 4 question phela if ek hi tree hai toh uss case mai bhi yehi karte hum left aur right mai usse divide kardete aur check karlete 
//		second ki agar 2 tree hai toh tree1 ie is roo1 and root2 ke throught check krlia 
//      3rd agar humara question hota ki kya 2 tree equal hai equal means content wise and structure wise toh hum kuch nai karte just jaha recursion ko call laga raje hai na vaha par rppt1.left ko compare karva dete with root2.left same root1.right compares to root2.right thats it 	
//		4th If the question was to check whether two trees are structurally equal, then the entire code would have remained the same — we would have just removed the root1.val != root2.val condition
//		aur content compare karne wala humne kar hi liya abhi just
//		aur joh yeh if if if ki nesting ki hai voh issi sequence mai honi chahiye otherwise the asnwer will be wrong
//		moreover the reason why we made a different menthod is here we were divding the tree into 2 trees so we had to make two roots thats why we made a different function/method...
	}
}
