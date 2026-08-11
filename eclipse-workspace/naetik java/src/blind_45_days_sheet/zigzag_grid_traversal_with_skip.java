package blind_45_days_sheet;

import java.util.*;

public class zigzag_grid_traversal_with_skip {

	public static void main(String[] args) {

		int[][] grid = { { 1, 2 }, { 3, 4 } };
		List<Integer> path = new ArrayList<>();
		int n = grid.length;
		int m = grid[0].length;
		for (int row = 0; row < n; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < m; col++) {
					path.add(grid[row][col]);

				}
			} else {
				for (int col = m - 1; col >= 0; col--) {
					path.add(grid[row][col]);

				}
			}
		}
		// now just keep one skip one
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < path.size(); i += 2) {
			result.add(path.get(i));

		}
//		return result;
	}
}
