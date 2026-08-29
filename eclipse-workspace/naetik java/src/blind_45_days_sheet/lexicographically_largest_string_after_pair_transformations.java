package blind_45_days_sheet;

import java.util.Arrays;

public class lexicographically_largest_string_after_pair_transformations {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7 };
		int n = arr.length;
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			int x = arr[i];
			StringBuilder sb = new StringBuilder();

			int countz = x >> 25;
			for (int k = 0; k < countz; k++) {
				sb.append('z');
			}

			for (int j = 24; j >= 0; j--) {
				if ((x & (1 << j)) != 0) { // j is set
					sb.append((char) ('a' + j));
				}

			}
			result[i] = sb.toString();

		}
		System.out.println(Arrays.toString(result));

	}

}
