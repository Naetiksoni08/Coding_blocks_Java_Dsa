package blind_45_days_sheet;

import java.util.*;

public class pacific_atlantic_water_flow {
	class Solution {
		public List<List<Integer>> pacificAtlantic(int[][] heights) {
			int m = heights.length;
			int n = heights[0].length;

			Queue<int[]> pq = new LinkedList<>();
			Queue<int[]> aq = new LinkedList<>();

			HashSet<String> pacific = new HashSet<>();
			HashSet<String> atlantic = new HashSet<>();

			int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

			// pacific ocean queue contains this now 0,0), (0,1), (0,2), (0,0), (1,0), (2,0)
			for (int j = 0; j < n; j++) {
				pq.add(new int[] { 0, j }); // top row //(0,0), (0,1), (0,2)
			}
			for (int i = 0; i < m; i++) {
				pq.add(new int[] { i, 0 }); // left col //(0,0), (1,0), (2,0)
			}
			// atlantic ocean contains this now (2,0), (2,1), (2,2), (0,2), (1,2), (2,2)
			for (int j = 0; j < n; j++) {
				aq.add(new int[] { m - 1, j }); // bottom row //(2,0), (2,1), (2,2)
			}
			for (int i = 0; i < m; i++) {
				aq.add(new int[] { i, n - 1 }); // right col //(0,2), (1,2), (2,2)
			} // these 4 loops tc is (m+n)*(m+n) = 2*(m+n) so finally (m+n)

			bfs(pq, pacific, heights, directions); // m*n

			bfs(aq, atlantic, heights, directions); // m*n

			List<List<Integer>> result = new ArrayList<>();
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					String key = i + "," + j;
					if (pacific.contains(key) && atlantic.contains(key)) {
						result.add(Arrays.asList(i, j));
					}
				}
			}
			return result; // finally m*n + m+n = m*n because it is dominant more than m+n so final m*n

		}

		public void bfs(Queue<int[]> q, HashSet<String> visited, int[][] heights, int[][] directions) {
			int m = heights.length;
			int n = heights[0].length;
			while (!q.isEmpty()) {
				// remove
				int[] rv = q.poll();
				int r = rv[0];
				int c = rv[1];
				String key = r + "," + c;

				// ignore
				if (r < 0 || c < 0 || r >= m || c >= n || visited.contains(key)) {
					continue;
				}
				// visited
				visited.add(key);

				// self work
				// nothing here

				// addunvisited nbrs
				for (int[] dir : directions) {
					int nr = r + dir[0];
					int nc = c + dir[1];
					if (nr < 0 || nc < 0 || nr >= m || nc >= n)
						continue;

					if (heights[nr][nc] >= heights[r][c]) { // kya new nr , nc ki height rmeoved r,c ki height sai badi
															// kya equal hai
						q.add(new int[] { nr, nc });
					}
				}

			}
		}
	}
}

//	heights = [
//	           [1, 2, 2],
//	           [3, 2, 3],
//	           [2, 4, 5]
//	         ]
//

//“We use two visited structures and BFS queues, all of which can store up to m × n cells in the worst case, so space complexity is O(m × n).”
