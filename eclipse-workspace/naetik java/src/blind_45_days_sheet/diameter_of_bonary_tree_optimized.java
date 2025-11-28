package blind_45_days_sheet;

public class diameter_of_bonary_tree_optimized {

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
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).diameter;
		}

		public Diapair diameter(TreeNode root) {
			if (root == null) {
				return new Diapair();
			}
			Diapair ldp = diameter(root.left); // heigt and diameter mila hoga hume
			Diapair rdp = diameter(root.right);
			Diapair sdp = new Diapair(); // ek new pair banayenge apne liye and uske andar we will set 2 things
			sdp.height = Math.max(ldp.height, rdp.height) + 1;
			int sd = ldp.height + rdp.height + 2;
			sdp.diameter = Math.max(sd, Math.max(ldp.diameter, rdp.diameter));
			return sdp;
		}

		class Diapair { // we make class when we want tor eturn more than 1 thing in tree questions
			int diameter = 0;
			int height = -1;

		}
		//// we have set the defualt value because when we will reach the leaf node we
		//// will return the defualt value of that leaf node as 0,-1

	}

}
