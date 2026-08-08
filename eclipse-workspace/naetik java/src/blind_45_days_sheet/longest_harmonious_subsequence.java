package blind_45_days_sheet;

import java.util.*;

public class longest_harmonious_subsequence {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 2, 5, 2, 3, 7 };
		HashMap<Integer, Integer> freq = new HashMap<>();
		for (int n : arr) {
			freq.put(n, freq.getOrDefault(n, 0) + 1);
		}
		int maxlen = 0;
		for (int key : freq.keySet()) {
			if (freq.containsKey(key + 1)) {
				int len = freq.get(key) + freq.get(key + 1);
				maxlen = Math.max(maxlen, len);
			}
		}
		System.out.println(maxlen);
	}

}


//Time: O(n) — ek pass for counting, ek pass for checking keys
//Space: O(n) — HashMap
