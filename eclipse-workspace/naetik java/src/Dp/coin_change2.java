package Dp;

import java.util.*;

public class coin_change2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[amount + 1][coins.length]; // becuase hume amount 5 bhi chhaiye isliye +1
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
//		System.out.println(coinchage(coins, amount, 0)); 
//		System.out.println(coinchagetopdown(coins, amount, 0, dp));
		System.out.println(coinchagebottomup(coins, amount));

	}

	public static int coinchage(int[] coins, int amount, int idx) {
		if (amount == 0) {
			return 1;
		}
		if (idx == coins.length) {
			return 0;
		}
		int inc = 0, exc = 0;
		if (coins[idx] <= amount) { // if coin of idx is smaller than the amount
			inc = coinchage(coins, amount - coins[idx], idx);
		}
		exc = coinchage(coins, amount, idx + 1);
		return inc + exc;

	}

	public static int coinchagetopdown(int[] coins, int amount, int idx, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (idx == coins.length) {
			return 0;
		}
		if (dp[amount][idx] != -1) {
			return dp[amount][idx];
		}
		int inc = 0, exc = 0;
		if (coins[idx] <= amount) { // if coin of idx is smaller than the amount
			inc = coinchagetopdown(coins, amount - coins[idx], idx, dp);
		}
		exc = coinchagetopdown(coins, amount, idx + 1, dp);
		return dp[amount][idx] = inc + exc;

	}

	public static int coinchagebottomup(int[] coins, int amount) {
		int[][] dp = new int[amount + 1][coins.length + 1];
		for (int i = 0; i < dp[0].length; i++) { // we filled 1 on the column 
			dp[0][i] = 1;
		}
		for (int am = 1; am < dp.length; am++) { // row is for amount
			for (int i = 1; i < dp[0].length; i++) { // column is for coin
				int inc = 0, exc = 0;
				if (coins[i - 1] <= am) { // if coin of idx is smaller than the amount
					inc = dp[am - coins[i - 1]][i];
				}
				exc = dp[am][i - 1];
			    dp[am][i] = inc + exc;

			}

		}
		return dp[dp.length - 1][dp[0].length - 1];

	}

}
