package blind_45_days_sheet;

import java.util.*;

public class house_robber_3 {

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
		public int rob(TreeNode root) {
			HashMap<TreeNode, Integer> map = new HashMap<>();
			return houserobber(root, map);
		}

		public static int houserobber(TreeNode root, HashMap<TreeNode, Integer> map) {
			if (root == null) {
				return 0;
			}
			if (map.containsKey(root)) {
				return map.get(root);
			}

			int rob = root.val + houserobber(root.left != null ? root.left.left : null, map)
					+ houserobber(root.left != null ? root.left.right : null, map)
					+ houserobber(root.right != null ? root.right.left : null, map)
					+ houserobber(root.right != null ? root.right.right : null, map);
			int norob = houserobber(root.left, map) + houserobber(root.right, map);
			int result = Math.max(rob, norob);
			map.put(root, result);
			return result;
			
		}
	}

}

//Here in this question we can't apply dep using arrays because in trees we don't have an index for each node. We have a proper object for each tree node; that's why we are going to use a hash map for this 
//Array se nahi kar sakte kyunki TreeNode ko index se access nahi kar sakte!
