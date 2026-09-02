package blind_45_days_sheet;

import java.util.Arrays;

public class maximum_element_after_decreasing_and_rearranging {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, 2, 1 };
		Arrays.sort(arr);
		int prev = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			prev = Math.min(arr[i], prev + 1);
		}
		System.out.println(prev);
	}

}
