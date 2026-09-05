package blind_45_days_sheet;

import java.util.*;

public class count_integers_appearing_in_a_single_block {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 1 };
		HashMap<Integer, Integer> countmap = new HashMap<>();
		HashMap<Integer, Integer> firstmap = new HashMap<>();
		HashMap<Integer, Integer> lastmap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {

			// add the occurence
			countmap.put(arr[i], countmap.getOrDefault(arr[i], 0) + 1);
			if (!firstmap.containsKey(arr[i])) {
				firstmap.put(arr[i], i);
			}
			lastmap.put(arr[i], i);

		}
		int count = 0;
		for (int key : countmap.keySet()) {
			int countofkey = countmap.get(key);
			int span = lastmap.get(key) - firstmap.get(key) + 1;
			if (span == countofkey) {
				count++;
			}
		}
		System.out.println(count);

	}

}
