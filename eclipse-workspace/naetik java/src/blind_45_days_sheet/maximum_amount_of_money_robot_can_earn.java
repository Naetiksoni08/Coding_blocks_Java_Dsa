package blind_45_days_sheet;

import java.util.Arrays;

public class maximum_amount_of_money_robot_can_earn {
	static boolean[][][] visited;

	public static void main(String[] args) {
		int[][] coins = { { 0, 1, -1 }, { 1, -2, 3 }, { 2, -3, 4 } };
		int m = coins.length, n = coins[0].length;
		int[][][] dp = new int[m][n][3];
		visited = new boolean[m][n][3];
		for (int[][] a : dp) {
			for (int[] b : a) {
				Arrays.fill(b, -1);
			}
		}
		System.out.println(robot(coins, 0, 0, 2, dp));

	}

	public static int robot(int[][] coins, int i, int j, int k, int[][][] dp) {
		if (i >= coins.length || j >= coins[0].length) {
			return Integer.MIN_VALUE / 2;
		}
		if (i == coins.length - 1 && j == coins[0].length - 1) {
			return coins[i][j] < 0 && k > 0 ? 0 : coins[i][j];
		}
		if (visited[i][j][k])
			return dp[i][j][k];
		visited[i][j][k] = true;

		int right = robot(coins, i, j + 1, k, dp);
		int down = robot(coins, i + 1, j, k, dp);
		int best = Math.max(down, right);

		if (coins[i][j] < 0 && k > 0) {
			int rightN = robot(coins, i, j + 1, k - 1, dp);
			int downN = robot(coins, i + 1, j, k - 1, dp);
			return dp[i][j][k] = Math.max(coins[i][j] + best, Math.max(downN, rightN));
		}
		return dp[i][j][k] = coins[i][j] + best;

	}

}
