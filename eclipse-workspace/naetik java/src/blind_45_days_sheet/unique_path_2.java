package blind_45_days_sheet;

public class unique_path_2 {
	public static void main(String[] args) {
		int[][] grid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		System.out.println(uniquepath(grid, 0, 0));
	}

	public static int uniquepath(int[][] grid, int i, int j) {
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

		int right = uniquepath(grid, i, j + 1);
		int down = uniquepath(grid, i + 1, j);
		return right + down;

	}
	// The output is 2 which represents that there are exactly 2 valid paths from
	// the top-left to the bottom-right without stepping on the obstacle.
}
