package blind_45_days_sheet;

import java.util.Arrays;

public class house_robber_5 {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 5 };
		int[] color = { 1, 1, 2, 2 };
		long[] dp = new long[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(houserobber(arr, color, 0, dp));
	}

	public static long houserobber(int[] arr, int[] color, int i, long[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		long rob = 0, norob = 0;
		int next = (i + 1 < color.length && color[i] == color[i + 1]) ? i + 2 : i + 1;
		rob = arr[i] + houserobber(arr, color, next, dp);
		norob = houserobber(arr, color, i + 1, dp);
		return dp[i] = Math.max(rob, norob);
	}

}
