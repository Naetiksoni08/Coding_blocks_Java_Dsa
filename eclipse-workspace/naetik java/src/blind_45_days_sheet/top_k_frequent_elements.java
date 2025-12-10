package blind_45_days_sheet;

import java.util.*;

public class top_k_frequent_elements {
	class Solution {
		public int[] topKFrequent(int[] arr, int k) {
			Map<Integer, Integer> map = new HashMap<>();
			for (int num : arr) {
				if (!map.containsKey(num)) {
					map.put(num, 1);
				} else {
					map.put(num, map.get(num) + 1);
				}
			}
			PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]); //sort by frequency

			for (int num : map.keySet()) {
				pq.offer(new int[] { num, map.get(num) }); // offer basically insert the specified value in the pq here we are storing the key as well as value 
				if (pq.size() > k) { 
					pq.poll();
				}
			}
			int[] result = new int[k];
			int i = 0;
			while (!pq.isEmpty()) {
				result[i] = pq.poll()[0]; // we only need to return or add the key in the result 
				i++;
			}
			return result;
		}

	}

}
