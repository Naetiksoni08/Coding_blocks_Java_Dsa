package blind_45_days_sheet;

import java.util.Arrays;

public class maximum_number_of_non_overlapping_palindrome_substring_Optimized {
	public static void main(String[] args) {
		String s = "abaccdbbd";
		int k = 3;
		int n = s.length();
		boolean[][] isPal = new boolean[n][n]; // precompute the palindrome table
		// level 1
		for (int i = 0; i < n; i++) {
			isPal[i][i] = true;
		}
		// level 2
		for (int i = 0; i < n - 1; i++) {
			isPal[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
		}
		// level 3 to n 
		for (int len = 3; len <= n; len++) {
			for (int i = 0; i + len - 1 < n; i++) {
				int j = i + len - 1;
				isPal[i][j] = (s.charAt(i) == s.charAt(j)) && isPal[i + 1][j - 1];
			}
		}
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		System.out.println(solve(0, s, k, dp, isPal));

	}

	private static int solve(int i, String s, int k, int[] dp, boolean[][] isPal) {
		int n = s.length();
		if (i >= n) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		dp[i] = solve(i + 1, s, k, dp, isPal); // skip

		for (int j = i + k - 1; j < n; j++) {
			if (isPal[i][j]) {
				dp[i] = Math.max(dp[i], 1 + solve(j + 1, s, k, dp, isPal));

			}
		}
		return dp[i];
	}

}