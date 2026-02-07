package blind_45_days_sheet;

import java.util.Arrays;

public class Stone_game_7 {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 1, 4, 2 };
		int n = arr.length;
		int[][] dp = new int[n][n];
		for (int[] x : dp) {
			Arrays.fill(x, -1);
		}
		int[] prefixsum = new int[n + 1];
		for (int i = 0; i < n; i++) {
			prefixsum[i + 1] = prefixsum[i] + arr[i];
		}
		System.out.println(Stone(0, n - 1, prefixsum, dp));

	}

	public static int Stone(int l, int r, int[] prefix, int[][] dp) {
		if (l == r) {
			return 0;
		}
		if (dp[l][r] != -1) {
			return dp[l][r];
		}
		int removeleft = (prefix[r + 1] - prefix[l + 1]) - Stone(l + 1, r, prefix, dp);
		int removeright = (prefix[r] - prefix[l]) - Stone(l, r - 1, prefix, dp);
		int max = Math.max(removeleft, removeright);
		return dp[l][r] = max;

	}

}
