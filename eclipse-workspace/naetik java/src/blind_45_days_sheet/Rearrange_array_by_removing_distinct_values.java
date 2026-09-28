package blind_45_days_sheet;

import java.util.*;

public class Rearrange_array_by_removing_distinct_values {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 3, 2, 1, 3 };
		int[] ans = new int[arr.length];
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int a : arr) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		int idx = 0;
		while (idx < arr.length) {
			for (int key : map.keySet()) {
				if (map.get(key) > 0) {
					ans[idx++] = key;
					map.put(key, map.get(key) - 1);
				}

			}
		}
		System.out.println(Arrays.toString(ans));

	}

}
