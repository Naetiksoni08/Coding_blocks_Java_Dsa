package blind_45_days_sheet;

import java.util.*;

public class vertical_order_traversal_of_a_binary_tree {

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

		class Pair {
			TreeNode node;
			int row;
			int col;

			Pair(TreeNode n, int r, int c) {
				node = n;
				row = r;
				col = c;

			}
		}

		public List<List<Integer>> verticalTraversal(TreeNode root) {
			TreeMap<Integer, List<int[]>> map = new TreeMap<>(); // col ke against ek list of int arr
			Queue<Pair> q = new LinkedList<>();
			q.add(new Pair(root, 0, 0)); // q = [(3, row=0, col=0)]
			while (!q.isEmpty()) {
				Pair p = q.poll(); // 3,0,0
				TreeNode node = p.node; // 3
				int row = p.row; // 0
				int col = p.col; // 0

				map.putIfAbsent(col, new ArrayList<>()); // map = {0: []}
				map.get(col).add(new int[] { row, node.val }); // map = {0: [[0,3]]}

				if (node.left != null) { // 9 exists
					q.add(new Pair(node.left, row + 1, col - 1)); // 9 exists → q.add(new Pair(9, 1, -1))

				}
				if (node.right != null) { // 20 exists
					q.add(new Pair(node.right, row + 1, col + 1)); // 20 exists → q.add(new Pair(20, 1, 1))
				}
//                                   FINAL MAP
//				{-1: [[1,9]], 0: [[0,3],[2,15]], 1: [[1,20]], 2: [[2,7]]}
			}
			// The reason we took treemap was because the keys in treemap are by default in
			// ascending order. We don't need to sort the column and the column, which is
			// the keys, will always be in left-to-right motion in ascending order
			List<List<Integer>> result = new ArrayList<>(); 
			for (List<int[]> list : map.values()) { // -1 , 0, 1, 2 so we will get col = -1, list = [[1,9]]
				Collections.sort(list, (a, b) -> { //  a will be 1,9 but b hai nai another example  // Compare [0,3] vs [2,15]
					if (a[0] != b[0]) {// if row are different  a[0]=0, b[0]=2 → 0 != 2 → return 0-2 = -2 (negative)
						return a[0] - b[0]; // toh row chota ayega phele  // So [0,3] comes before [2,15] ✓
					}
					return a[1] - b[1]; // same row hai toh fir choti value phele
				});

				List<Integer> colValues = new ArrayList<>();
				for (int[] arr : list) { //list = [[1,9]] or Sorted list: [[0,3], [2,15]] (already sorted by row)
					colValues.add(arr[1]); // 9 add ho jayega  or colValues: add 3, then 15 → [3, 15]
				}
				result.add(colValues); // result: [[9], [3,15]]

			}
			return result;

		}
	}

}

//
//      3(0,0)
//     /      \
//9(1,-1)   20(1,1)
//         /      \
//    15(2,0)     7(2,2)
