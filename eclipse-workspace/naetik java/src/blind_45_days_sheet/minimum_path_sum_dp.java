package blind_45_days_sheet;

import java.util.Arrays;

public class minimum_path_sum_dp {
	public static void main(String[] args) {
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(path_sum(grid, 0, 0, dp));
	}

	public static int path_sum(int[][] grid, int r, int c, int[][] dp) {
		if (r == grid.length - 1 && c == grid[0].length - 1) {
			return grid[r][c]; // if r and c reaches last value in the grid
		}
		if (r >= grid.length || c >= grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if (dp[r][c] != -1) {
			return dp[r][c];
		}

		int right = path_sum(grid, r, c + 1, dp);
		int down = path_sum(grid, r + 1, c, dp);
		return dp[r][c] = Math.min(right, down) + grid[r][c];
	}

}
