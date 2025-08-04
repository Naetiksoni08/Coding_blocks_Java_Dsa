package binary_search_tree;

public class Flip_equivalent_binary_tree {
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
//order of n cuz and lia hai humne operator ko dekh 
	class Solution {
		public boolean flipEquiv(TreeNode root1, TreeNode root2) {
			if (root1 == null && root2 == null) {
				return true;

			}
			if (root1 == null || root2 == null) {
				return false;

			}
			if (root1.val != root2.val) {
				return false;
			}
			boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right , root2.left);
			boolean noflip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right , root2.right);
			return flip || noflip;
			
			

		}
		//yaha 2 tree ke roots already given hai so no need to make a different method
//		2 hi call lagegi har node par ya toh voh flip ho gaya ya nai flip wala code is smiliar to the mirror image thing the one we did in last question symmetric thing and no flip wale mai ki flip tabhi hoga jab dono ke content same honge if ek 4 hai dusra 40 tohnai hhoga flip bhai 
	}

}
