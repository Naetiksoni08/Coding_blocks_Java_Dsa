package blind_45_days_sheet;

import java.util.Arrays;

public class dungeon_game {
	public static void main(String[] args) {
		int[][] dungeon = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
		int[][] dp = new int[dungeon.length][dungeon[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(dungeon(dungeon, 0, 0, dp));

	}

	public static int dungeon(int[][] arr, int i, int j, int[][] dp) {
		if (i >= arr.length || j >= arr[0].length) { // knight out of bounds na chale jaye
			return Integer.MAX_VALUE;
		}
		if (i == arr.length - 1 && j == arr[0].length - 1) { // if reached till princess
			return Math.max(1, 1 - arr[i][j]); // knight ki health kabhi bhi 1 sai kam nai ho sakti hai aur princess
												// wale cell mai aate hi health kam hogi bas 1 sai greater than equal to
												// ho
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int right = dungeon(arr, i, j + 1, dp); // simple 2 calls
		int down = dungeon(arr, i + 1, j, dp);

		int whichpath = Math.min(right, down); // knight minimum health loose karna chahta hai toh voh down aur right
												// jis path sai sabsai kam health loose hogi us ko choose karega

		int deductpathprice = whichpath - arr[i][j]; // joh bhi usnai path choose kia hoga uss cell par jane ka effect
														// minus hoga

		return dp[i][j] = Math.max(1, deductpathprice); // health 0 ya negative na ho minimum 1 honi chahiye 
	}

}

//Math.max(1, X) ka matlab hai:
//“chahe jo ho jaaye, knight ko kam se kam 1 health ke saath is cell me enter karna hi padega.”

