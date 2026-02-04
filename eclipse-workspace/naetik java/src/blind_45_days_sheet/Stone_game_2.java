package blind_45_days_sheet;

import java.util.Arrays;

public class Stone_game_2 {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 9, 4, 4 };
		int[] suffixsum = new int[arr.length + 1];
		for (int i = arr.length - 1; i >= 0; i--) {
			suffixsum[i] = arr[i] + suffixsum[i + 1];

		}
		int[][] dp = new int[arr.length][arr.length + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(StoneGame(arr, 0, 1, suffixsum, dp));
	}

	public static int StoneGame(int[] arr, int i, int limit, int[] suffix, int[][] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (i + 2 * limit >= arr.length) {
			return suffix[i];
		}
		if (dp[i][limit] != -1) {
			return dp[i][limit];
		}
		int ans = 0;
		for (int x = 1; x <= 2 * limit; x++) {
			ans = Math.max(ans, suffix[i] - StoneGame(arr, i + x, Math.max(limit, x), suffix, dp));
		}
		return dp[i][limit] = ans;
	}

}
