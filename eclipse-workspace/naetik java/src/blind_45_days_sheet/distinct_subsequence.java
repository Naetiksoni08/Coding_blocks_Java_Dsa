package blind_45_days_sheet;

import java.util.Arrays;

public class distinct_subsequence {
	public static void main(String[] args) {
		String s = "rabbbit";
		String t = "rabbit";
		int[][] dp = new int[s.length()][t.length()];
		for (int[] a : dp) {
           Arrays.fill(a, -1);
		}
		System.out.println(distinct(s, t, 0, 0, dp));
	}

// i -> s -> coin
// j -> t -> amount
	public static int distinct(String s, String t, int i, int j, int[][] dp) {
		if (j == t.length()) {
			return 1;
		}
		if (i == s.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = distinct(s, t, i + 1, j + 1, dp); // pick
		}
		exc = distinct(s, t, i + 1, j, dp); // nopick
		return dp[i][j] = inc + exc;
	}

}
