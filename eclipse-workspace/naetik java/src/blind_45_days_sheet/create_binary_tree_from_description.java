package blind_45_days_sheet;

import java.util.*;

public class create_binary_tree_from_description {

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
		public TreeNode createBinaryTree(int[][] descriptions) {
			return createBinary(descriptions);

		}

		public TreeNode createBinary(int[][] descriptions) {
			HashMap<Integer, TreeNode> map = new HashMap<>();
			HashSet<Integer> children = new HashSet<>();

			for (int[] d : descriptions) {
				int parent = d[0];
				int child = d[1];
				int isleft = d[2];
				map.putIfAbsent(parent, new TreeNode(parent));
				map.putIfAbsent(child, new TreeNode(child));

				if (isleft == 1) { // 20 15 1
					map.get(parent).left = map.get(child); // map.get(20).left = map.get(15) refernece milta hai 20 and
															// 15 ka
				} else { // 20 17 0
					map.get(parent).right = map.get(child); // map.get(20).right = map.get(17)
				}
				children.add(child);
			}
			for (int key : map.keySet()) {
				if (!children.contains(key)) {
					return map.get(key);
				}
			}
			return null;

		}
	}
}

//initally iss line ke baad 
//map.putIfAbsent(parent, new TreeNode(parent));
//map.putIfAbsent(child, new TreeNode(child));
//map dikehag aisa 

//HashMap<Integer, TreeNode>
//
//Key    →  Value
//----      -----
//20     →  TreeNode(20) [left=null, right=null]
//15     →  TreeNode(15) [left=null, right=null]
//17     →  TreeNode(17) [left=null, right=null]
//50     →  TreeNode(50) [left=null, right=null]
//80     →  TreeNode(80) [left=null, right=null]
//19     →  TreeNode(19) [left=null, right=null]

// fir lets say d = [20 ,15 ,1]
// left = 1 so map.get(20).left = map.get(15) refernece milta hai 20 and 15 ka 
// aur map update hota hai 
//Key    →  Value
//----      -----
//20     →  TreeNode(20) [left=Node(15), right=null]  ← update!
//15     →  TreeNode(15) [left=null, right=null]

// ab d = 20 17 0
//map.get(20).right = map.get(17)
//updated map
//Key    →  Value
//----      -----
//20     →  TreeNode(20) [left=Node(15), right=Node(17)]  ← update!
//15     →  TreeNode(15) [left=null, right=null]
//17     →  TreeNode(17) [left=null, right=null]

// also we were supposed to return root ka address so dekh root node ke bhot sare children ho sakte hai but root node khudh kisi ka child nai ho skata kyuki voh top level par hai so 
// we said ki keyset mangwao
//map keys = {15, 17, 20, 80, 19, 50} aah gaya ab ek ek key ko check karo children map mai agar present hai toh paaka voh child hai root nai agar nai hai present toh paaka root node hai
//children = {15, 17, 20, 80, 19} 50 present nai hai in chldren map.get(key) - 50 return kardo 
// that is why we were maintaining children map and we did children.add(child);