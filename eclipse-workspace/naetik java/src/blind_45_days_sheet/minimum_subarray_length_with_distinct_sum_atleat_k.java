package blind_45_days_sheet;

import java.util.*;

public class minimum_subarray_length_with_distinct_sum_atleat_k {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 1 };
		int k = 4;
		System.out.println(minimum(arr, k));
	}

	public static int minimum(int[] arr, int k) {
		int left = 0;
		int sum = 0;
		int right = 0;
		int ans = Integer.MAX_VALUE;
		HashMap<Integer, Integer> map = new HashMap<>();
		// grow
		for (right = 0; right < arr.length; right++) {
			int x = arr[right];

			if (!map.containsKey(x)) {
				map.put(x, 1);
			} else {
				map.put(x, map.get(x) + 1);
			}
			if (map.get(x) == 1) {
				sum += x;
			}

			while (sum >= k) {
				ans = Math.min(ans, right - left + 1);
				int remove = arr[left];
				map.put(remove, map.get(remove) - 1);

				if (map.get(remove) == 0) {
					sum -= remove;
				}
				left++;

			}
		}
//		if (ans == Integer.MAX_VALUE) {
//			return -1;
//		} else {
//			return ans;
//		} 
		return ans == Integer.MAX_VALUE ? -1 : ans;

	}
}
