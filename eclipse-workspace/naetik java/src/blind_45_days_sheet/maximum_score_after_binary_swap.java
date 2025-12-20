package blind_45_days_sheet;

import java.util.*;

//public class maximum_score_after_binary_swap {
//	class Solution {
//		public long maximumScore(int[] arr, String s) {
//
//			int one = 0;
//			for (int x : s.toCharArray()) {
//				if (x == '1')
//					one++;
//			}
//
//			PriorityQueue<Integer> pq = new PriorityQueue<>();
//			for (int i = 0; i < arr.length; i++) {
//				if (s.charAt(i) == '1') {
//					pq.add(arr[i]);
//				} else {
//				    if (pq.size() < one) {
//	                    pq.add(arr[i]);
//	                } 
//				    else if (!pq.isEmpty() && pq.peek() < arr[i]) {
//						pq.poll();
//						pq.add(arr[i]);
//					}
//
//				}
//			}
//			long score = 0;
//			while (!pq.isEmpty()) {
//				score += pq.poll();
//			}
//			return score;
//
//		}
//	}
//}
//optimized
class Solution {
	public long maximumScore(int[] arr, String s) {
		int n = arr.length;
		long score = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		int onecount = 0;
		int currentmax = 0;
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
			if (s.charAt(i) == '1') {
				score += pq.poll();
			}
		}
		return score;
	}
}
