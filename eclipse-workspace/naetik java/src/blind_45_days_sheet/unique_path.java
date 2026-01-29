package blind_45_days_sheet;

import java.util.*;

public class unique_path {

	public static void main(String[] args) {
		int m = 3;
		int n = 7;
		int[][] dp = new int[m][n];
		for (int[] a : dp) {
			Arrays.fill(a, 0);
		}
		System.out.println(uniquepath(m, n, 0, 0, dp));

	}

	// m -- i // rows
	// n -- j // col
	public static int uniquepath(int m, int n, int i, int j, int[][] dp) {
		if (i >= m || j >= n) {
			return 0;
		}
		if (i == m - 1 && j == n - 1) {
			return 1;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int down = uniquepath(m, n, i + 1, j, dp);
		int right = uniquepath(m, n, i, j + 1, dp);
		return dp[i][j] = down + right;

	}
}
