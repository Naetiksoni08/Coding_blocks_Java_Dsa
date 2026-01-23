package blind_45_days_sheet;

import java.util.Arrays;

public class longest_common_subsequence {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "ace";
		int[][] dp = new int[s1.length()][s2.length()];
		for(int [] a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(lcsTD(s1, s2, 0, 0, dp));
	}

	public static int lcsTD(String s1, String s2, int i, int j, int[][] dp) {
		if (i == s1.length() || j == s2.length()) {
			return 0;
		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = 1 + lcsTD(s1, s2, i + 1, j + 1, dp);
		} else {
			int f = lcsTD(s1, s2, i + 1, j, dp);
			int s = lcsTD(s1, s2, i, j + 1, dp);
			ans = Math.max(f, s);
		}
		return dp[i][j] = ans;

	}

}
