package blind_45_days_sheet;

public class count_routes_to_climb_a_rectangular_grid {
	static Integer[][][] dp;

	public static void main(String[] args) {
		String[] grid = { "..", "#." };
		int d = 1;
		System.out.println(climbGrid(grid, d));
	}

	// Main function jo bottom row se start kare
	public static int climbGrid(String[] grid, int d) {
		int n = grid.length;
		int m = grid[0].length();
		long totalRoutes = 0;

		dp = new Integer[n][m][2];

		// Bottom row se har cell try karo
		for (int c = 0; c < m; c++) {
			if (grid[n - 1].charAt(c) == '.') {
				totalRoutes += countroutes(n - 1, c, 0, grid, d);
				totalRoutes %= 1000000007;
			}
		}
		return (int) totalRoutes;
	}

	// Recursive function
	public static int countroutes(int r, int c, int lastHorizontal, String[] grid, int d) {
		long count = 0;
		if (r == 0)
			count = 1;
		int n = grid.length;
		int m = grid[0].length();

		if (dp[r][c][lastHorizontal] != null) {
			return dp[r][c][lastHorizontal];
		}
		for (int nextR = r - 1; nextR <= r; nextR++) {
			if (nextR < 0)
				continue; // bounds check

			for (int nextC = 0; nextC < m; nextC++) {
				if (grid[nextR].charAt(nextC) == '#')
					continue;
				if (nextR == r && nextC == c)
					continue;

				double dist = Math.sqrt((r - nextR) * (r - nextR) + (c - nextC) * (c - nextC));
				if (dist > d)
					continue;

				int isHorizontal = (nextR == r) ? 1 : 0;
				if (lastHorizontal == 1 && isHorizontal == 1)
					continue;

				count += countroutes(nextR, nextC, isHorizontal, grid, d);
				count %= 1000000007;
			}
		}
		dp[r][c][lastHorizontal] = (int) count;
		return (int) count;
	}
}