package assignment_questions;

import java.util.*;

public class coin_change_2 {
	static final int MOD = 1_000_000_007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int amount = sc.nextInt();
		int[] coins = new int[n];
		int[][] dp = new int[amount + 1][coins.length]; // cuz agar amount ki value 5 hai toh hume 5th index ko access
														// karne ke liye usse 6 banana padega
		for (int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		for (int i = 0; i < coins.length; i++) {
			coins[i] = sc.nextInt();
		}
		long result = coins(coins, amount, 0, dp);
		System.out.println(result);

	}

	public static int coins(int[] coins, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 1; // amount 0 hota hai toh 1 return karenge
		}
		if (i == coins.length) {
			return 0;
		}
		if (dp[amount][i] != -1) {
			return dp[amount][i];
		}
		long pick = 0, no_pick = 0;
		if (coins[i] <= amount) { // agar amount is greater than equal to coin then only cal jayega else no call
			pick = coins(coins, amount - coins[i], i, dp);
		}
		no_pick = coins(coins, amount, i + 1, dp);
		return dp[amount][i] = (int) ((pick + no_pick)) % MOD;

	}

	public static int coins_bottom_up(int[] coins, int amount) {
		int[][] dp = new int[amount + 1][coins.length + 1];
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;
		}
		int pick = 0, no_pick = 0;
		for (int am= 1; am < dp.length; am++) { //for amount
			for (int i = 0; i < dp[0].length; i++) { // for coin
				if (am >= coins[i-1]) { // cuz of blank string so isliye ek index piche jakar pick karenge coin
					pick = dp[am-coins[i-1]][i]; // joh coin pick kia hai utna piche jaakar hum answer leke ayenge 
				}
				no_pick = dp[am][i-1]; // coin discarded aur amount same hi rahega 
				return dp[am][i] = pick+no_pick;
			}
		}
		return dp[dp.length-1][dp[0].length-1]; 
	}

}
