package blind_45_days_sheet;

import java.util.*;

public class first_element_with_unique_frequency {

	public static void main(String[] args) {
		int[] arr = { 20, 10, 30, 30 };
		System.out.println(firstelement(arr));
	}

	public static int firstelement(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> freqmap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		for (int key : map.keySet()) {
			if (!freqmap.containsKey(map.get(key))) {
				freqmap.put(map.get(key), 1);
			} else {
				freqmap.put(map.get(key), freqmap.get(map.get(key)) + 1);

			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (freqmap.get(map.get(arr[i])) == 1) {
				return arr[i];
			}
		}
		return -1;
	}
}
