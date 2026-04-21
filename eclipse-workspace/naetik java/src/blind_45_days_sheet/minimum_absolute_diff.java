package blind_45_days_sheet;

import java.util.*;

public class minimum_absolute_diff {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 3 };
		System.out.println(minimumAbsdiff(arr));

	}

	public static List<List<Integer>> minimumAbsdiff(int[] arr) {
		Arrays.sort(arr);

		int mindiff = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			mindiff = Math.min(mindiff, arr[i + 1] - arr[i]);
		}
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] == mindiff) {
				result.add(Arrays.asList(arr[i], arr[i + 1]));
			}
		}
		return result;
	} // n log n tc

//	O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(n³) < O(2^n)

}
