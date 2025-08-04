package backtracking_recursion;

public class sudoku_solver {

	public static void main(String[] args) {
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		Print(grid, 0, 0);
		display(grid);
	}

	public static void display(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean Print(int[][] grid, int row, int col) {
		if (col == 9) {
			row++;
			col = 0;
		}
		if (row == 9) {
			return true;
		}
		if (grid[row][col] != 0) {
			return Print(grid, row, col + 1);
		} else {
			for (int val = 0; val <= 9; val++) {
				if (issafe(grid, row, col, val) == true) {
					grid[row][col] = val;
					boolean ans = Print(grid, row, col + 1);
					if (ans) {
						return ans;

					}
					grid[row][col] = 0;
				}
			}
		}
		return false;
	}

	public static boolean issafe(int[][] grid, int row, int col, int val) {
		// row me check karenge
		for (int c = 0; c < 9; c++) {
			if (grid[row][c] == val) {
				return false;
			}
		}
		// column me check karenge
		for (int r = 0; r < 9; r++) {
			if (grid[r][col] == val) {
				return false;
			}
		}
		// 3x3 matrix
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
//command shift f-formatting
