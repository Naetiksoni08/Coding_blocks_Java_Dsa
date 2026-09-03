package blind_45_days_sheet;

import java.util.*;

public class relative_rank {

	public static void main(String[] args) {
		int[] arr = { 10, 3, 8, 9, 4 };
		int[] score = arr.clone();
		Arrays.sort(score); // 3,4,8,9,10
		HashMap<Integer, String> map = new HashMap<>();
		int rank = 1;
		for (int i = score.length - 1; i >= 0; i--) {
			if (rank == 1) {
				map.put(score[i], "Gold Medal");
			} else if (rank == 2) {
				map.put(score[i], "Silver Medal");
			} else if (rank == 3) {
				map.put(score[i], "Bronze Medal");
			} else {
				map.put(score[i], String.valueOf(rank));
			}
			rank++;
		}
		String[] ans = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			ans[i] = map.get(arr[i]);
		}
		System.out.println(Arrays.toString(ans));

	}
}
