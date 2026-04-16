package blind_45_days_sheet;

import java.util.*;

public class closest_equal_element_Queries {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 1, 4, 1, 3, 2 };
		int[] query = { 0, 3, 5 };
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.computeIfAbsent(arr[i], x -> new ArrayList<>()).add(i);
		}
		int[] answer = new int[query.length];
		int n = arr.length;
		for (int q = 0; q < query.length; q++) {
			int idx = query[q];
			int val = arr[idx];
			List<Integer> indices = map.get(val);

			if (indices.size() == 1) {
				answer[q] = -1;
				return;
			}
			int minDist = Integer.MAX_VALUE;
			for (int j : indices) {
				if (j == idx) {
					continue;
				}
				int direct = Math.abs(idx - j);
				int circular = n - direct;
				minDist = Math.min(minDist, Math.min(direct, circular));
			}
			answer[q] = minDist;
		}
		List<Integer> result = new ArrayList<>();
		for(int a : answer) result.add(a);
		System.out.println(result);

	}

}
