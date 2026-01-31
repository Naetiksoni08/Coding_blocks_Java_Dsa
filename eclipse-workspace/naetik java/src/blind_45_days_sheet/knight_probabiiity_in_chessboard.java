package blind_45_days_sheet;

public class knight_probabiiity_in_chessboard {
	public static void main(String[] args) {
		int n = 3;
		int k = 2;
		int row = 0;
		int col = 0;
		double[][][] dp = new double[k + 1][n][n];
		for (int i = 0; i <= k; i++) {
			for (int j = 0; j < n; j++) {
				for (int l = 0; l < n; l++) {
					dp[i][j][l] = -1.0;
				}
			}
		}

		System.out.println(knight(n, k, row, col, dp));

	}

	public static double knight(int n, int k, int r, int c, double[][][] dp) {
		//out of board
		if (r < 0 || c < 0 || r >= n || c >= n) {
			return 0.0;
		}
		//no moves left
		if (k == 0) {
			return 1.0;
		}
		if (dp[k][r][c] != -1.0) {
			return dp[k][r][c];
		}
		double probability = 0.0;
		int[] row = { -2, -1, 1, 2, -2, -1, 1, 2 };
		int[] col = { 1, 2, 2, 1, -1, -2, -2, -1 };

		for (int i = 0; i < 8; i++) {
			probability += knight(n, k - 1, r + row[i], c + col[i], dp);

		}
		dp[k][r][c] = probability / 8;
		return dp[k][r][c];
		

	}

}
