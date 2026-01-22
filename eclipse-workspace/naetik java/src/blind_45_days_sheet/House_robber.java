package blind_45_days_sheet;

import java.util.Arrays;

public class House_robber {
	public static void main(String[] args) {
		int[] arr = { 7, 5, 3, 13, 1 };
		int[] dp = new int[arr.length];
		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp, -1);
		}
		//System.out.println(houserobber(arr, 0, dp));
		System.out.println(houserobber2(arr, arr.length - 1, dp));

	}

	public static int houserobber(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}

		int rob = arr[i] + houserobber(arr, i + 2, dp);
		int norob = houserobber(arr, i + 1, dp);
		return dp[i] = Math.max(rob, norob);

	}

	public static int houserobber2(int[] arr, int i, int[] dp) { // piche sai recursion chalega toh dp table aage sai										// fill hoga
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + houserobber2(arr, i - 2, dp);
		int norob = houserobber2(arr, i - 1, dp);
		return dp[i] = Math.max(rob, norob);

	}
	// jab recursion piche sai chalega toh dp table aage sai fill hoga  jaise house robber
	// jab recursion aage sai chalega toh dp table piche sai fill hogi jaise fibo
}
