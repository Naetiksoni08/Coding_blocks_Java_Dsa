package blind_45_days_sheet;

import java.util.*;

public class N_QUEEN_LEETCODE {
	static List<List<String>> result = new ArrayList<>();

	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		queenproblem(board, n, 0, result);
		System.out.println(result);

	}

	public static void queenproblem(boolean[][] board, int tq, int row, List<List<String>> result) {
		if (tq == 0) {
			result.add(construct(board));
			return;
		}
		for (int i = 0; i < board[0].length; i++) {
			if (IsSafe(board, row, i) == true) {
				board[row][i] = true;
				queenproblem(board, tq - 1, row + 1, result);
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

	private static List<String> construct(boolean[][] board) {
		List<String> res = new ArrayList<>();
		for (int i = 0; i < board.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < board.length; j++) {
				sb.append(board[i][j] ? 'Q' : '.');
			}
			res.add(sb.toString());
		}
		return res;
	}

}

////Same cheez lambi mein:
//if (board[i][j] == true) { true mtlb ki voh space is safe sai validated hai yani i,j is a safe place to place a queen 
// sb.append('Q');
//} else {
// sb.append('.'); // khali jagah 
//}