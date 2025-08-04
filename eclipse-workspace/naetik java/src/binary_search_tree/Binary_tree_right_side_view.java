package binary_search_tree;

import java.util.ArrayList;
import java.util.List;

public class Binary_tree_right_side_view {
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
		public List<Integer> rightSideView(TreeNode root) {
         List<Integer> ll = new ArrayList<>();
         rightSide(root,1,ll);
         return ll;
		}
		int maxd = 0;
		public void rightSide(TreeNode root, int cl, List<Integer> ll ) {
			if (root == null) {
				return;
			}
			if (maxd < cl) { // maximum depth chota hai current level sai toh hi loop chalega  
				ll.add(root.val);
				maxd = cl; //agar maxd 5 tha aur current level 1 that toh jaise hi current level 6 hua toh max d ko bhi toh 6 karna padega na toh maxd = cl kardia jaise hi 6 hui value usko assign kardia in max depth 
			}

			rightSide(root.right, cl + 1,ll);
			rightSide(root.left, cl + 1,ll); // current level initially 1 par hoga idliye humne +1 karke bheja hai recursion mai 
		}
	}

}
