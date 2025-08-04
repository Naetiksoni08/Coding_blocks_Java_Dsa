package graph;

import java.util.*;

public class graph_valid_tree {

	class solution {
		public boolean validtree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i <= n; i++) {
				map.put(i, new ArrayList<>());

			}
			for (int i = 0; i < edges.length; i++) {
				int v1 = edges[i][0];
				int v2 = edges[i][i];
				map.get(v1).add(v2);
				map.get(v2).add(v1);
			}
			return BFT(map);
		}

		public boolean BFT(HashMap<Integer, List<Integer>> map ) { // breadth first traversal
			Queue<Integer> q = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();
			int c = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				c++;
				q.add(src);

				while (!q.isEmpty()) {
					// remove
					int rv = q.poll();
					// ignore
					if (visited.contains(rv)) {
						return false;
					}
					// visited
					visited.add(rv);
					// self work
					// add
					for (int nbrs : map.get(rv)) {
						if (!visited.contains(nbrs)) {
							q.add(nbrs);
						}
					}
				}

			}
			
			return c==1;
		}
	}
}
