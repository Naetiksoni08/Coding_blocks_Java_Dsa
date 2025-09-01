package Dp;

import java.util.Arrays;

public class Wine_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine = { 2, 3, 5, 1, 4 };
		int[][] dp = new int[wine.length][wine.length];
		System.out.println(wine(wine, 0, wine.length - 1, 1, dp));
		System.out.println(winebottomup(wine));

	}

	public static int wine(int[] wine, int i, int j, int year, int[][] dp) {
		if (i > j) {
			return 0;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int left = wine[i] * year + wine(wine, i + 1, j, year + 1, dp);
		int right = wine[j] * year + wine(wine, i, j - 1, year + 1, dp);
		return dp[i][j] = Math.max(left, right);

	}

	public static int winebottomup(int[] wine) {
		int[][] dp = new int[wine.length][wine.length];
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = wine[i] * wine.length; // 5th year ka kaam

		}
		int year = wine.length - 1; // now the year will start from 4
		for (int d = 1; d < wine.length; d++) { // 4 diagonal ke liye hume kaam karna hai
			for (int j = d; j < dp.length; j++) {
				int i = j - d;
				int left = wine[i] * year + dp[i + 1][j];
				int right = wine[j] * year + dp[i][j - 1];
				dp[i][j] = Math.max(left, right);

			}
			year--;

		}
		return dp[0][dp[0].length - 1]; // 0th row pr last column pr

	}
	// in this type of question na like bottom up approach mai kabhi if u get stuck
	// then na tu table print karke check karlia kr ki kya problem hai mtlb 2d arry
	// print karlia kar

}
