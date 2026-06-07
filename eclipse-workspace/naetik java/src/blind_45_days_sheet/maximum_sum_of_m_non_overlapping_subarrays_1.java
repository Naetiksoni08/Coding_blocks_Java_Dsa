package blind_45_days_sheet;

import java.util.Arrays;

public class maximum_sum_of_m_non_overlapping_subarrays_1 {

	public static void main(String[] args) {
		int[] arr = { 4, 1, -5, 2 };
		int m = 2;
		int l = 1;
		int r = 3;
		int n = arr.length;
		long[][] dp = new long[n + 1][m + 1];
		for (long[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(maximumsum(arr, 0, 0, m, l, r, n, dp));
	}

	public static long maximumsum(int[] arr, int i, int count, int m, int l, int r, int n, long[][] dp) {
		if (count == m)
			return 0; // m subarray bana liye
		if (i >= n)
			return 0; // array khatam
		if (dp[i][count] != -1) {
			return dp[i][count];
		}
		long best = 0;
		best = Math.max(best, maximumsum(arr, i + 1, count, m, l, r, n,dp));// skip current index
		long sum = 0;
		for (int j = 1; j <= r; j++) {
			int end = i + j - 1;
			if (end >= n)
				break;
			sum += arr[end];
			if (j >= l) {
				long pick = sum + maximumsum(arr, i + 1, count + 1, m, l, r, n,dp);
				best = Math.max(best, pick);
			}
		}
		dp[i][count] = best;
		return dp[i][count];

	}

}
