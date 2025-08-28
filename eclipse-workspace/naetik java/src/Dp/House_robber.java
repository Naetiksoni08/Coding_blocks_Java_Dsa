package Dp;

import java.util.Arrays;

public class House_robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 9, 3, 1 };
		int[] dp = new int[arr.length];
//		for (int i = 0; i < dp.length; i++) {
//			dp[i] = -1;
//
//		}
		Arrays.fill(dp, -1);

//		System.out.println(houserobber_recursion_from_front(arr, 0, dp));
//		System.out.println(houserobber_recursion_from_back(arr, arr.length - 1, dp));
System.out.println(houserobber_recursion_from_back_bottomup(arr  ));

	}

	public static int houserobber_recursion_from_front(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + houserobber_recursion_from_front(arr, i + 2, dp);
		int dont_rob = houserobber_recursion_from_front(arr, i + 1, dp);
		return dp[i] = Math.max(rob, dont_rob);
	}

	public static int houserobber_recursion_from_back(int[] arr, int i, int[] dp) {
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + houserobber_recursion_from_back(arr, i - 2, dp);
		int dont_rob = houserobber_recursion_from_back(arr, i - 1, dp);
		return dp[i] = Math.max(rob, dont_rob);
	}
	
	
	

	public static int houserobber_recursion_from_back_bottomup(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]); // manually filling the base case dp of 0 pr arr of 0 rakhdo aur dp1 pr arr of
											// 0 and arr of 1 ka maximum rakh do

		for (int i = 2; i < dp.length; i++) {

			int rob = arr[i] + dp[i - 2];
			int dont_rob = dp[i - 1];
		    dp[i] = Math.max(rob, dont_rob);
		}
		return dp[dp.length-1];
	}
}
