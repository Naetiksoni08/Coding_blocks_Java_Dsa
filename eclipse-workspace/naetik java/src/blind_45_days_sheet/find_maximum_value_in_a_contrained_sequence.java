package blind_45_days_sheet;

import java.util.*;

public class find_maximum_value_in_a_contrained_sequence {
	public static void main(String[] args) {
		int n = 10;
		int[][] restrictions = { { 3, 1 }, { 8, 1 } };
		int[] diff = { 2, 2, 3, 1, 4, 5, 1, 1, 2 };
		System.out.println(maxvalue(n, restrictions, diff));
	}

	public static int maxvalue(int n, int[][] restrictions, int[] diff) {
		int maxOverall = 0;
		int current = 0; // a[0] = 0
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int[] r : restrictions) {
			map.put(r[0], r[1]);
		}
		for (int i = 1; i < n; i++) {
			int maxpossible = current + diff[i - 1];

			if (map.containsKey(i)) {
				maxpossible = Math.min(maxpossible, map.get(i));
			}
			current = maxpossible;
			maxOverall = Math.max(maxOverall, current);

		}
		return maxOverall;

	}
 // this is the wrong solution
}
