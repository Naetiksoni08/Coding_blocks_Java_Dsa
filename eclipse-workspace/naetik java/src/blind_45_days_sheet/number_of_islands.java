package blind_45_days_sheet;

import java.util.*;

public class number_of_islands {
	class Solution {
		public int numIslands(char[][] grid) {
			int m = grid.length; // row
			int n = grid[0].length; // col
			int noofisland = 0;
			Queue<int[]> q = new LinkedList<>();
			HashSet<String> visited = new HashSet<>();
			int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } }; // From current cell (r, c) Hum 4
																				// direction mein jaa sakte hain

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (grid[i][j] == '1' && !visited.contains(i + "," + j)) { // i was earlier only checking grid[i][j]
																				// == '1' and not checking whether (i,
																				// j) was already visited.
						q.add(new int[] { i, j });
						noofisland++;
						while (!q.isEmpty()) {
							// remove
							int[] rv = q.poll();
							int r = rv[0]; // row
							int c = rv[1];
							String key = r + "," + c;
							// visited
							if (r < 0 || c < 0 || r >= m || c >= n || visited.contains(key) || grid[r][c] == '0') {
								continue;
							}
							// visited
							visited.add(key);
							// add unvisited nbrs
							for (int[] dir : directions) {
								int nr = r + dir[0]; // new row
								int nc = c + dir[1]; // new col
								String nkey = nr + "," + nc;

								if (nr < 0 || nc < 0 || nr >= m || nc >= n)
									continue;
								if (visited.contains(nkey))
									continue;
								if (grid[nr][nc] == '0')
									continue;

								q.add(new int[] { nr, nc });

							}

						}

					}
				}
			}
			return noofisland;

		}
	}

}

//Earlier, we could have simply added all 4 neighbors (up, down, left, right) blindly, and then later let the ignore step filter out:
//out-of-bounds
//already visited
//water cells
//But instead, we are preventing those invalid cells from ever entering the queue by checking:
//bounds
//visited
//water
//before adding them to the queue.
