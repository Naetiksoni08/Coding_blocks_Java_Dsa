package blind_45_days_sheet;

import java.util.*;

public class count_values_with_equality_spaced_occurences_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 8, 1, 5, 1, 5, 8, 5 };
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.computeIfAbsent(arr[i], key -> new ArrayList<>()).add(i);
		}
		int count = 0;
		for (List<Integer> ll : map.values()) {
			if (ll.size() == 3) {
				int i1 = ll.get(0);
				int i2 = ll.get(1);
				int i3 = ll.get(2);
				if (i2 - i1 == i3 - i2) {
					count++;
				}
			}

		}
		System.out.println(count);

	}

}
