package blind_45_days_sheet;

public class sudoku_Solver_leetcode {

	public static void main(String[] args) {
		char[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		Sudoku_Solver(grid, 0, 0);
	}

	public static boolean Sudoku_Solver(char[][] grid, int row, int col) {
		if (col == 9) {
			col = 0;
			row++;
		}
		if (row == 9) {
			return true;
		}
		if (grid[row][col] != '.') {
			return Sudoku_Solver(grid, row, col + 1);
		}
		
		for (char val = '1'; val <= '9'; val++) {
			if (isitSafe(grid, row, col, val) == true) {
				grid[row][col] = val;
				if(Sudoku_Solver(grid, row, col + 1)) {
					return true;
				}
				grid[row][col] = '.';
			}
		}
		return false;
	}

	public static boolean isitSafe(char[][] grid, int row, int col, char val) {
		// row ke case mai col vary
		for (int i = 0; i < 9; i++) {
			if (grid[row][i] == val) {
				return false;
			}
		}
		// col ke case mai row vary
		for (int i = 0; i < 9; i++) {
			if (grid[i][col] == val) {
				return false;
			}
		}
		int r = row - row % 3;
		int c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (grid[i][j] == val) {
					return false;
				}
			}
		}

		return true;
	}

}
