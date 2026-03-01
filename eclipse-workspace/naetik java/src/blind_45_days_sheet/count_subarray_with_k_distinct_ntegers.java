package blind_45_days_sheet;

import java.util.*;

public class count_subarray_with_k_distinct_ntegers {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 2, 2 };
		int k = 2;
		int m = 2;
		System.out.println(count(arr, k, m) - count(arr, k - 1, m));

	}

	public static long count(int[] arr, int k, int m) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int left = 0;
		int qualifiedDistinct = 0;
		long count = 0;
		for (int right = 0; right < arr.length; right++) {
			map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
			if (map.get(arr[right]) == m) {
				qualifiedDistinct++;
			}

			while (qualifiedDistinct > k) {
				map.put(arr[left], map.get(arr[left]) - 1);
				if (map.get(arr[left]) == m - 1) { // m se neeche gaya!
					qualifiedDistinct--;
				}
				left++;
			}
			count += right - left + 1;

		}
		return count;

	}
}
