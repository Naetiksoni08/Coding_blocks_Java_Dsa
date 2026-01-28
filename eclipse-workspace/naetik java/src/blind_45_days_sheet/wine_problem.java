package blind_45_days_sheet;

import java.util.Arrays;

public class wine_problem {
	public static void main(String[] args) {
		int[] wine = { 2, 3, 5, 1, 4 };
		int[][] dp = new int[wine.length][wine.length];
		for (int[] a : dp) {
			Arrays.fill(a,  -1);
		}
		System.out.println(wine(wine, 0, wine.length - 1, 1, dp));

	}

	public static int wine(int[] wine, int i, int j, int year, int[][] dp) {
		if (i > j) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int left = wine[i] * year + wine(wine, i + 1, j, year + 1, dp);
		int right = wine[j] * year + wine(wine, i, j - 1, year + 1, dp);
		return dp[i][j] = Math.max(left, right);
	}

}
