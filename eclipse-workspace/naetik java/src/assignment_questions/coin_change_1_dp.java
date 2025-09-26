package assignment_questions;

import java.util.Arrays;

public class coin_change_1_dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 1, 2, 5 };
		int amount = 11;
		int[][] dp = new int[amount + 1][coins.length];
		for (int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		int ans = coin_change_1(coins, amount, 0, dp);
		System.out.println(ans >= Integer.MAX_VALUE / 2 ? -1 : ans);
	}

	public static int coin_change_1(int[] coins, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 0;
		}
		if (i == coins.length) {
			return Integer.MAX_VALUE / 2;
		}
		if (dp[amount][i] != -1) {
			return dp[amount][i];
		}
		int pick = Integer.MAX_VALUE / 2, no_pick = 0;
		if (coins[i] <= amount) {
			pick = 1 + coin_change_1(coins, amount - coins[i], i, dp);
		}
		no_pick = coin_change_1(coins, amount, i + 1, dp);
		return dp[amount][i] = Math.min(pick, no_pick);
	}

}
