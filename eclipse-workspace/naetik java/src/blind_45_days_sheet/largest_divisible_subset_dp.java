package blind_45_days_sheet;

import java.util.*;

public class largest_divisible_subset_dp {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		Arrays.sort(arr);
		int[][] dp = new int[arr.length][arr.length + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(largest(arr, 0, -1, dp));

	}

	public static int largest(int[] arr, int i, int j, int[][] dp) {
		if (i == arr.length) {
			return 0;
		}
		if (dp[i][j + 1] != -1) {
			return dp[i][j + 1];
		}
		int inc = 0, exc = 0;
		if (j == -1 || arr[i] % arr[j] == 0) {
			inc = 1+largest(arr, i + 1, i, dp);

		}
		exc = largest(arr, i + 1, j, dp);
		return dp[i][j + 1] = Math.max(inc, exc);

	}

}
