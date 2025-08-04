package binary_search_tree;

public class diameterofabinarytree_optimized {

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
			return diameter(root).dia;//mai .ht bhi kr sakta hu ab kyuki uske pass dono info hai 
		}
		public Diapair diameter(TreeNode root) {
			if(root==null) {
				return new Diapair();
			}
			Diapair leftdiameter = diameter(root.left);
			Diapair rightdiameter = diameter(root.right);
			Diapair selftdiameterpair = new Diapair();
			selftdiameterpair.ht = Math.max(leftdiameter.ht,rightdiameter.ht)+1;
			int selfdiameter = leftdiameter.ht+rightdiameter.ht+2;
			selftdiameterpair.dia = Math.max(selfdiameter, Math.max(leftdiameter.dia, rightdiameter.dia));
			return selftdiameterpair;
			
		}
		
		class Diapair{
			int dia=0;
			int ht=-1;//taki agar null ho left aur right toh by defualt 0,-1 return ho kyuki humne null ke case mai pichle wale mai bhi agar null hai root toh -1 kia tha toh just aise hum intialize kardia
		}

	}

}
