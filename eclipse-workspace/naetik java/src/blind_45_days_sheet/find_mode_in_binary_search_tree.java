package blind_45_days_sheet;

import java.util.*;

public class find_mode_in_binary_search_tree {

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
		Map<Integer, Integer> freqMap = new HashMap<>();

		public int[] findMode(TreeNode root) {
			traverse(root);
			int maxfreq = 0;
			for (int freq : freqMap.values()) {
				maxfreq = Math.max(freq, maxfreq);
			}
			List<Integer> result = new ArrayList<>();
			for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {

				if (entry.getValue() == maxfreq) {
					result.add(entry.getKey());
				}

			}
			int[] ans = new int[result.size()];
			for (int i = 0; i < ans.length; i++) {
				ans[i] = result.get(i);
			}
			return ans;
		}

		private void traverse(TreeNode root) {
			if (root == null)
				return;
			freqMap.put(root.val, freqMap.getOrDefault(root.val, 0) + 1);
			traverse(root.left);
			traverse(root.right);

		}

	}

}//What we did in the solution was this:
//1. We figured out the highest frequency.
//2. Based on the highest frequency we compared it with the actual value present inside the map.
//3. Based on the frequency we added the value.
//4. We basically got the element with the highest frequency and simply added that value into the result.
//5. We just converted the list into an integer array.
//Now the thing is that the follow-up was that we were supposed to do this solution in O(1), that is, constant space complexity not time complexity. This current approach has O(n) space complexity, that is, linear complexity, while the time complexity is also O(n) in this approach. We were supposed to do this question in O(1) constant space complexity.
//
//The solution that comes to my mind is that, as this question says, we are given a binary search tree. We know the property of a binary search tree: all the elements to the left of the root will be smaller than the root and all the elements to the right of the root will always be greater than the root.
//
//If we think about this, we know that if we find the in-order traversal of a binary search tree, we will get a sorted array in sorted fashion. Thinking about this solution, what we can do is find the in-order traversal. Then we can simply traverse that in-order traversal and take a variable named maybe `max_count`. We can also have a `current_count` and based on the element we can increase `current_count`. At the end we can finally store or update `max_count` if `max_count` is bigger than `current_count`.
//
//This is what we think and we will try to implement the solution of this question in the next session 
