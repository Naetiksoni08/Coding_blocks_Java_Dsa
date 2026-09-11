package blind_45_days_sheet;

import java.util.*;

import java.util.Arrays;

public class find_a_safe_walk_through_a_grid {
	public static void main(String[] args) {
		List<List<Integer>> arr = Arrays.asList(Arrays.asList(0, 1, 0, 0, 0), Arrays.asList(0, 1, 0, 1, 0),
				Arrays.asList(0, 0, 0, 1, 0));
		int health = 1;
		int m = arr.size(); // row
		int n = arr.get(0).size(); // col // the arr or the grid was in list format so usko phele convert kara hai
									// into the 2d array
		int[][] grid = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = arr.get(i).get(j);
			}
		}
		int[][] maxhealth = new int[m][n];
		for (int[] a : maxhealth) {
			Arrays.fill(a, -1);
		}
		int starthealth = health - grid[0][0];
		if (starthealth <= 0) {
			System.out.println(false);
		}
		maxhealth[0][0] = starthealth;

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { 0, 0 });
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } }; // up,down,left,right
		while (!q.isEmpty()) {
			int[] curr = q.poll();
			int row = curr[0];
			int col = curr[1];
			int currhealth = maxhealth[row][col];

			for (int[] d : directions) {
				int nr = row + d[0]; // all four direction ek ek baar add hongi jaise nr first time hoga 0 +-1 = -1
										// mtlb up for row mtlb out of bounds and nc hoga 0+0 = 0 so final bana -1,0
				int nc = col + d[1];

				if (nr < 0 || nr >= m || nc < 0 || nc >= n) // check bounds
					continue;

				int newhealth = currhealth - grid[nr][nc];
				if (newhealth > 0 && newhealth > maxhealth[nr][nc]) {
					maxhealth[nr][nc] = newhealth;
					q.add(new int[] { nr, nc });
				}
			}

		}
		System.out.println(maxhealth[m - 1][n - 1] >= 1);

	}

}
