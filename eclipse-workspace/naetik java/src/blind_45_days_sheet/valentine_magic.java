package blind_45_days_sheet;

import java.util.Arrays;

public class valentine_magic {
	public static void main(String[] args) {
		int[] boys = { 2, 11, 3 };
		int[] girls = { 5, 7, 3, 2 };
		int[][] dp = new int[boys.length][girls.length];
		for(int[]a:dp) {
			Arrays.fill(a, -1);
		}
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(valentinemagic(boys, girls, 0, 0,dp));

	}

	public static int valentinemagic(int[] boys, int[] girls, int i, int j,int[][]dp) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 10000000;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int pair = Math.abs(boys[i] - girls[j]) + valentinemagic(boys, girls, i + 1, j + 1,dp);
		int nopair = valentinemagic(boys, girls, i, j + 1,dp);
		return dp[i][j]=Math.min(pair, nopair);

	}
}
