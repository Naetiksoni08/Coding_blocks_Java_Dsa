package blind_45_days_sheet;

import java.util.*;

public class minimum_distance_between_3_equal_elements_2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 3 };
		int ans = Integer.MAX_VALUE;
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		for (int k = 0; k < arr.length; k++) {
			map.computeIfAbsent(arr[k], x -> new ArrayList<>()).add(k);

			List<Integer> indices = map.get(arr[k]);
			if (indices.size() > 3) {
				int i = indices.get(indices.size() - 3);
				int j = indices.get(indices.size() - 2);
				int dist = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
				ans = Math.min(ans, dist);
			}

		}
		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
	}

}
