package blind_45_days_sheet;

import java.util.Arrays;

public class minimum_falling_path_sum_dp {
	public static void main(String[] args) {
		int[][] arr = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[arr.length][arr[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, Integer.MAX_VALUE);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			ans = Math.min(ans, minimum(arr, 0, i, dp));
		}
		System.out.println(ans);

	}

	public static int minimum(int[][] arr, int r, int c, int[][] dp) {
		if (c < 0 || c >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if (r == arr.length - 1) {
			return arr[r][c];
		}
		if (dp[r][c] != Integer.MAX_VALUE) {
			return dp[r][c];
		}
		int dl = minimum(arr, r + 1, c - 1, dp);
		int dr = minimum(arr, r + 1, c + 1, dp);
		int down = minimum(arr, r + 1, c, dp);
		return dp[r][c] = Math.min(dl, Math.min(dr, down)) + arr[r][c];

	}
}

//-1 and 0 valid answers ho sakte hain (kyunki matrix mein negative zero values allowed hain),
//but Integer.MAX_VALUE kabhi valid path sum nahi ho sakta,
//isliye hum dp ko Integer.MAX_VALUE se initialize karte hain.