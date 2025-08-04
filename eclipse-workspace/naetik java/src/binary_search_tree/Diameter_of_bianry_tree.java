package binary_search_tree;

public class Diameter_of_bianry_tree {
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
			return diameter(root);
		}
		public int diameter(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int leftdiameter = diameter(root.left);
			int rightdiameter = diameter(root.right);
			int selfdiameter = height(root.left) + height(root.right) + 2;
			return Math.max(selfdiameter, Math.max(leftdiameter, rightdiameter));

		}

		public int height(TreeNode root) {
			if (root == null) {
				return -1;
			}
			int leftheight = height(root.left);
			int rightheight = height(root.right);
			return Math.max(leftheight, rightheight) + 1;

		}

	}
	//time complexity will be order of n^2 but mujhe isse n mai krna hai
//	hum ek sath height ko bhi return kardenge diameter ke sath sath usse hum height ke call lagane sai bach jayenge 
//	toh hum iss ke liye ek class banayenge aur jaise s.height and s.diameter karke hum karlenge 

}
