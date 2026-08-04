package blind_45_days_sheet;

public class N_QUEEN_2_LEETCODE {
	static int count = 0;

	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		queenproblem(board, n, 0);
		System.out.println(count);

	}

	public static void queenproblem(boolean[][] board, int tq, int row) {
		if (tq == 0) {
			count++;
			return;
		}
		for (int i = 0; i < board[0].length; i++) {
			if (IsSafe(board, row, i) == true) {
				board[row][i] = true;
				queenproblem(board, tq - 1, row + 1);
				board[row][i] = false; // backtrack

			}

		}

	}

	public static boolean IsSafe(boolean[][] board, int row, int col) {
		// up
		int r = row;
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}

		// left diagonal
		int c = col;
		r = row;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		// right diagonal
		c = col;
		r = row;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}

	return true;

	}

}
