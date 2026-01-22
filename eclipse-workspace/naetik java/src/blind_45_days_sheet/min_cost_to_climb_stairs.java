package blind_45_days_sheet;

import java.util.Arrays;

public class min_cost_to_climb_stairs {
	public static void main(String[] args) {
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		int zeroth = climbingstairs(arr, 0, dp);
		int oneth = climbingstairs(arr, 1, dp);
		System.out.println(Math.min(zeroth, oneth));
	}

	public static int climbingstairs(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int f = climbingstairs(arr, i + 1, dp);
		int s = climbingstairs(arr, i + 2, dp);
		return dp[i] = Math.min(f, s) + arr[i];

	}

}
