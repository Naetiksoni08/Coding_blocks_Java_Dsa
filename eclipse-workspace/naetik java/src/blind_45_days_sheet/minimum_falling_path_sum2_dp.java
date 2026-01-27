package blind_45_days_sheet;

import java.util.Arrays;

public class minimum_falling_path_sum2_dp {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
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
		if (r == arr.length - 1) {
			return arr[r][c];
		}
		if (dp[r][c] != Integer.MAX_VALUE) {
			return dp[r][c];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			if (c != i) { // same cell par call nai jayega
				ans = Math.min(ans, minimum(arr, r + 1, i, dp));

			}
		}
		return dp[r][c] = ans + arr[r][c];

	}

}// no base case for col because col par loop chal raha hai
