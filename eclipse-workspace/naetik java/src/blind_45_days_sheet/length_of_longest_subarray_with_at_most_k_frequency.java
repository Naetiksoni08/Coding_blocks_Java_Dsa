package blind_45_days_sheet;

import java.util.*;

public class length_of_longest_subarray_with_at_most_k_frequency {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 2, 3, 1, 2 };
		int k = 2;
		HashMap<Integer, Integer> freq = new HashMap<>();
		int left = 0;
		int maxlen = 0;
		for (int right = 0; right < arr.length; right++) {
			freq.put(arr[right], freq.getOrDefault(arr[right], 0) + 1);

			while (freq.get(arr[right]) > k) {
				freq.put(arr[left], freq.get(arr[left]) - 1);
				left++;
			}
			maxlen = Math.max(maxlen, right - left + 1);
		}
		System.out.println(maxlen);

	}

}
