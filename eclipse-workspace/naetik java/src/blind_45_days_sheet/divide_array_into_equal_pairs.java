package blind_45_days_sheet;

import java.util.*;

public class divide_array_into_equal_pairs {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 3, 2, 2, 2 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (int freq : map.values()) {
			if (freq % 2 != 0) {
//				return false;
			}
		}
//		return true;

	}

}
