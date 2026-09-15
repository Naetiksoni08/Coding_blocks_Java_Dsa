package blind_45_days_sheet;

import java.util.Arrays;

public class maximum_number_of_non_overlapping_palindrome_substring_DP {

	public static void main(String[] args) {
		String s = "abaccdbbd";
		int k = 3;
		int[] dp = new int[s.length()];
		Arrays.fill(dp, -1);
		System.out.println(solve(0, s, k, dp));

	}

	private static int solve(int i, String s, int k, int[] dp) {
		int n = s.length();
		if (i >= n) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		dp[i] = solve(i + 1, s, k, dp);
		for (int j = i + k - 1; j < n; j++) {
			if (isPalindrome(s, i, j)) {
				dp[i] = Math.max(dp[i], 1 + solve(j + 1, s, k, dp));

			}
		}
		return dp[i];
	}

	public static boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
