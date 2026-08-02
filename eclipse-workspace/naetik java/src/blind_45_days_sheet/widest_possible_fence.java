package blind_45_days_sheet;

import java.util.*;

public class widest_possible_fence {

	public static void main(String[] args) {
		int[] planks = { 1, 3, 2, 5, 7, 5, 4, 2, 1 };
		System.out.println(maxWidth(planks));
	}

	public static int maxWidth(int[] planks) {
		HashSet<Integer> candidates = new HashSet<>();
		for (int i = 0; i < planks.length; i++) {
			candidates.add(planks[i]);
			for (int j = i+1; j < planks.length; j++) {
				candidates.add(planks[i]+planks[j]);
			}
		}
		
		int maxWidth = 0;
		for (int H : candidates) { // 2 option hai ya toh mujhe directly H mil jaye planks mai ya fir mai pair
							// banau pair ke liye remaining lelia aur as it is ke liye countasitis
			int countasitis = 0;
			List<Integer> remaining = new ArrayList<>();
			for (int num : planks) {
				if (num == H) {
					countasitis++;
				} else {
					remaining.add(num);
				}
			}
			int countpair = CountPairs(remaining, H);
			int total = countasitis + countpair;
			maxWidth = Math.max(maxWidth, total);

		}
		return maxWidth;

	}

	public static int CountPairs(List<Integer> planks, int H) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int paircount = 0;
		for (int num : planks) {
			int remaining = H - num;
			if (map.containsKey(remaining) && map.get(remaining) > 0) {
				paircount++;
				map.put(remaining, map.get(remaining) - 1);
			} else {
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
		}
		return paircount;
	}

}
