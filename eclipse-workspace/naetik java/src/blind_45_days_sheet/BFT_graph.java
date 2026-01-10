package blind_45_days_sheet;

import java.util.*;

public class BFT_graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public BFT_graph(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count = 0;
		for (int key : map.keySet()) {
			if (visited.contains(key)) {
				continue;
			}
			count++; // for counting the no of components in the graph
			q.add(key);
			while (!q.isEmpty()) {
				// remove
				int rv = q.poll();
				// ignore
				if (visited.contains(rv)) {
					continue;
				}

				// visited mark
				visited.add(rv);
				// self work
				System.out.println(rv + " ");
				// add unvisited nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}

				}

			}
		}
		System.out.println(count);

	}

}
