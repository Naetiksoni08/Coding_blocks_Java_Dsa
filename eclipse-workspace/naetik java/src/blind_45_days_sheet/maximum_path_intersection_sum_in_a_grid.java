package blind_45_days_sheet;

import java.util.Arrays;

public class maximum_path_intersection_sum_in_a_grid {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 0, -3 }, { 1, -2, 1, 0 }, { -4, 2, -1, 3 }, { 3, -3, 3, -2 }, { -1, -5, 0, 1 } };
		int m = arr.length - 1;
		int n = arr[0].length - 1;
		int[][][][] dp = new int[m + 1][n + 1][m + 1][n + 1];
		for (int[][][] a : dp)
			for (int[][] b : a)
				for (int[] c : b)
					Arrays.fill(c, Integer.MIN_VALUE);
		System.out.println(solve(arr, 0, 0, m, 0, dp));
	}

	public static int solve(int[][] arr, int r1, int c1, int r2, int c2, int[][][][] dp) {
		if (r1 >= arr.length || c1 >= arr[0].length || r2 < 0 || c2 >= arr[0].length) {
			return (int) -1e9;
		}
		int m = arr.length - 1;
		int n = arr[0].length - 1;

		if (dp[r1][c1][r2][c2] != Integer.MIN_VALUE) {
			return dp[r1][c1][r2][c2];
		}

		if (r1 == m && c1 == n && r2 == 0 && c2 == n) {
			if (r1 == r2 && c1 == c2)
				dp[r1][c1][r2][c2] = arr[r1][c1];
			else
				dp[r1][c1][r2][c2] = arr[r1][c1] + arr[r2][c2];
			return dp[r1][c1][r2][c2];
		}
		int current = 0;
		if (r1 == r2 && c1 == c2) {
			current = arr[r1][c1];
		} else {
			current = arr[r1][c1] + arr[r2][c2];
		}

		int next = Math.max(Math.max(solve(arr, r1, c1 + 1, r2, c2 + 1, dp), solve(arr, r1, c1 + 1, r2 - 1, c2, dp)),
				Math.max(solve(arr, r1 + 1, c1, r2, c2 + 1, dp), solve(arr, r1 + 1, c1, r2 - 1, c2, dp)));

		dp[r1][c1][r2][c2] = current + next;
		return dp[r1][c1][r2][c2];
	}
}
