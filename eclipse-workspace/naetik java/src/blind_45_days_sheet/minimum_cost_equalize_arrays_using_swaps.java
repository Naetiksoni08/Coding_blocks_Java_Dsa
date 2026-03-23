package blind_45_days_sheet;

import java.util.*;

public class minimum_cost_equalize_arrays_using_swaps {

	public static int main(String[] args) {
		int[] arr1 = { 10, 20 };
		int[] arr2 = { 20, 10 };
		int n = arr1.length;
		HashMap<Integer, Integer> totalfreq = new HashMap<>();
		HashMap<Integer, Integer> difffreq = new HashMap<>();
		for (int arr : arr1) {
			difffreq.put(arr, difffreq.getOrDefault(arr, 0) + 1);
			totalfreq.put(arr, totalfreq.getOrDefault(arr, 0) + 1);
		}
		for (int arr : arr2) {
			difffreq.put(arr, difffreq.getOrDefault(arr, 0) + 1);
			totalfreq.put(arr, totalfreq.getOrDefault(arr, 0) + 1);
		}

		for (int val : totalfreq.values()) {
			if (val % 2 != 0) {
				System.out.println(-1);
			}
		}
		int ans = 0;
		for (int val : difffreq.values()) {
			ans += Math.abs(val) / 2;
		}
		return ans/2;

	}

}
