package blind_45_days_sheet;

import java.util.*;

public class count_values_with_equally_spaced_occurrences_2 {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 1, 5, 1, 5, 8, 5 };
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.computeIfAbsent(arr[i], key -> new ArrayList<>()).add(i);
		}

		int count = 0;
		for (List<Integer> ll : map.values()) {
			if (ll.size() >= 3 && isequallyspaced(ll)) {
				count++;
			}

		}
		System.out.println(count);

	}

	public static boolean isequallyspaced(List<Integer> ll) {
		int diff = ll.get(1) - ll.get(0);
		for (int idx = 2; idx < ll.size(); idx++) {
			if (ll.get(idx) - ll.get(idx - 1) != diff) {
				return false;
			}
		}
		return true;
	}

}
