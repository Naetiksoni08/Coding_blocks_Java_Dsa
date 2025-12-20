package blind_45_days_sheet;

import java.util.*;

public class find_if_path_exists_in_the_graph {

	class Solution {
		HashMap<Integer, HashMap<Integer, Integer>> map;

		public boolean validPath(int n, int[][] edges, int source, int destination) {
			map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new HashMap<>());
			}
			for (int[] e : edges) {
				int v1 = e[0];
				int v2 = e[1];
				map.get(v1).put(v2, 1);
				map.get(v2).put(v1, 1);
			}

			HashSet<Integer> visited = new HashSet<>();
			return haspath(source, destination, visited);
		}

		public boolean haspath(int src, int des, HashSet<Integer> visited) {
			if (src == des) {
				return true;
			}
			visited.add(src);
			for (int nbrs : map.get(src).keySet()) {
				if (!visited.contains(nbrs)) {
					if (haspath(nbrs, des, visited)) {
						return true;
					}
				}
			}
			return false;
		}
	}

}
