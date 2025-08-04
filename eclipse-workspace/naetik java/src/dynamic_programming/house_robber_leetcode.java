package dynamic_programming;

import java.util.Arrays;

public class house_robber_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 9, 3, 1 };

//		Arrays.fill(dp, -1); // we are filling -1 after making a n size array
//		System.out.println(house_robbertd(arr, 0,dp));
		System.out.println(house_robberbottomup(arr));

	}

	public static int house_robber(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}

		int rob = arr[i] + house_robber(arr, i + 2); // this is recursion approach
		int dont_rob = house_robber(arr, i + 1);
		return Math.max(rob, dont_rob);

	}

	public static int house_robbertd(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i]; // here we are applying the dp
		}

		int rob = arr[i] + house_robbertd(arr, i + 2, dp);
		int dont_rob = house_robbertd(arr, i + 1, dp);
		return dp[i] = Math.max(rob, dont_rob); // here we are storing the value in the array

	}

	public static int house_robberbottomup(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(dp[0], dp[1]);
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i - 2];
			int dont_rob = dp[i - 1];
			dp[i] = Math.max(rob, dont_rob);

		}
		return dp[dp.length - 1];

	}

}
