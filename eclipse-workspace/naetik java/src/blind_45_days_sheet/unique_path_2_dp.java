package blind_45_days_sheet;

import java.util.Arrays;

public class unique_path_2_dp {

	public static void main(String[] args) {
		int[][] grid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(uniquepath(grid, 0, 0, dp));
	}

	public static int uniquepath(int[][] grid, int i, int j, int[][] dp) {
		int m = grid.length; // i for row
		int n = grid[0].length; // j for col

		if (i >= m || j >= n) {
			return 0;
		}
		if (grid[i][j] == 1) {
			return 0; // starting par hi obstacle
		}
		if (i == m - 1 && j == n - 1) {
			return 1;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int right = uniquepath(grid, i, j + 1, dp);
		int down = uniquepath(grid, i + 1, j, dp);
		return dp[i][j] = right + down;
		// tc-m*n for dp array
	}
	// The output is 2 which represents that there are exactly 2 valid paths from
	// the top-left to the bottom-right without stepping on the obstacle.
}
