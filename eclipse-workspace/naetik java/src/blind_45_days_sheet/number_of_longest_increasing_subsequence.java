package blind_45_days_sheet;

import java.util.Arrays;

public class number_of_longest_increasing_subsequence {
	public static void main(String[] args) {
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println(longest(arr));

	}

	public static int longest(int[] arr) {
		int[] lis = new int[arr.length];
		Arrays.fill(lis, 1);
		for (int i = 1; i < lis.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					int l = lis[j];
					lis[i] = Math.max(lis[i], l + 1);

				}
			}
		}
		int max =lis[0];
		int count = 0;
		for (int i = 1; i < lis.length; i++) {
			max = Math.max(max, lis[i]);
			count++;
		}
		return count;
	}

}
