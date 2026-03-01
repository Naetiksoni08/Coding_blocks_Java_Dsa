package blind_45_days_sheet;

import java.util.*;

public class Smallest_pair_with_diff_frequency {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 4 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
			} else {
				map.put(num, map.get(num) + 1);
			}
			List<Integer> keys = new ArrayList<>(map.keySet());
			Collections.sort(keys);

			for (int i = 0; i < keys.size(); i++) {
				for (int j = i + 1; j < keys.size(); j++) {
					int x = keys.get(i);
					int y = keys.get(j);
					if (map.get(x) != map.get(y)) {
						// return new int[] {x,y};

					}
				}
			}
			// return new int[] {-1,-1};

		}

	}

}
