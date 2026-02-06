package blind_45_days_sheet;

import java.util.Arrays;

public class Guess_number_higher_or_lower_2 {
	public static void main(String[] args) {
		int n = 4;
		int[][] dp = new int[n+1][n+1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(GuessNumber(1, n, dp));
	}

	public static int GuessNumber(int l, int r, int[][] dp) {
		if (l >= r) {
			return 0;
		}
		if (dp[l][r] != -1) {
			return dp[l][r];
		}
		int mincost = Integer.MAX_VALUE;
		for (int x = l; x <= r; x++) {
			int left = GuessNumber(l, x - 1, dp);
			int right = GuessNumber(x + 1, r, dp);
			int cost = x + Math.max(left, right);
			mincost = Math.min(mincost, cost);

		}
		return dp[l][r] = mincost;
	}

}
