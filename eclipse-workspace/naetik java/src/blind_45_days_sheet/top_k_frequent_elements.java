package blind_45_days_sheet;

import java.util.*;

public class top_k_frequent_elements {
	class Solution {
		public int[] topKFrequent(int[] arr, int k) {
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < arr.length; i++) {
				if (!map.containsKey(arr[i])) {
					map.put(arr[i], 1);
				} else {
					int get = map.get(arr[i]);
					map.put(arr[i], get + 1);
				}
			}
		}
	}
}
