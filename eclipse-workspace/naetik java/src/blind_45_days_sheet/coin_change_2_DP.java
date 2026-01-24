package blind_45_days_sheet;

import java.util.Arrays;

public class coin_change_2_DP {
	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[amount + 1][coins.length];
		for (int[] z : dp) {
			Arrays.fill(z, -1);
		}
		System.out.println(coinchangeTD(coins, amount, 0, dp));

	}
//recursion
	public static int coinchange(int[] coin, int amount, int idx) {
		if (amount == 0) {
			return 1;
		} 
		if (idx == coin.length) {
			return 0;

		}
		int inc = 0, exc = 0;
		if (coin[idx] <= amount) {
			inc = coinchange(coin, amount - coin[idx], idx);
		}
		exc = coinchange(coin, amount, idx + 1);
		return inc + exc;

	}

	public static int coinchangeTD(int[] coin, int amount, int idx, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (idx == coin.length) {
			return 0;
		}
		if (dp[amount][idx] != -1) {
			return dp[amount][idx];
		}

		int inc = 0, exc = 0;
		if (coin[idx] <= amount) {
			inc = coinchangeTD(coin, amount - coin[idx], idx, dp);
		}
		exc = coinchangeTD(coin, amount, idx + 1, dp);
		return dp[amount][idx] = inc + exc;

	}

}

//We create dp[amount+1][coins.length] because
//for every amount from 0 to 5 or amount,
//and for every coin index,
//we want to store the number of ways to form that amount using coins from that index onward. so basically amount tk ka banana padega 
