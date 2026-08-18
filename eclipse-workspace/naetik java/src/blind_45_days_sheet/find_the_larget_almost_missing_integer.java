package blind_45_days_sheet;

import java.util.*;

public class find_the_larget_almost_missing_integer {
	public static void main(String[] args) {
		int k = 3;
		int[] arr = { 3, 9, 2, 1, 7 };

		HashMap<Integer, Integer> windowcount = new HashMap<>();
		int n = arr.length;
		for (int i = 0; i <= n - k; i++) { // sliding window 5-3 = 2 so 1 window is 0,1,2
			HashSet<Integer> hasSeen = new HashSet<>();
			for (int j = i; j < i + k; j++) {
				hasSeen.add(arr[j]);
			}

			for (int num : hasSeen) {
				windowcount.put(num, windowcount.getOrDefault(num, 0) + 1);
			}

		}
		int ans = -1;
		for (int key : windowcount.keySet()) { // 3,9,2,1,7 it will return keys not the values so i need to access the
												// values using that key
			if (windowcount.get(key) == 1) {
				ans = Math.max(ans, key);
			}
		}
		System.out.println(ans);
	}

}
