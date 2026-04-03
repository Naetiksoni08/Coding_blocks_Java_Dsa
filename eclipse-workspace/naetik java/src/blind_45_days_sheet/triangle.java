package blind_45_days_sheet;

import java.util.*;

public class triangle {
	public static void main(String[] args) {
		int[][] triangle = { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } };
		System.out.println(minimumTotal(triangle));
	}

	public static int minimumTotal(int[][] triangle) {
		int n = triangle.length;
		int[] dp = new int[n];
		for (int j = 0; j < dp.length; j++) {
			dp[j] = triangle[n - 1][j];  // last wala row fill kia dp mai
		}
		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				dp[j] = triangle[i][j] + Math.min(dp[j], dp[j + 1]);
			}
		}
		return dp[0];

	}

}
