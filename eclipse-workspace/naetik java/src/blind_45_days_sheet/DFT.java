package blind_45_days_sheet;

import java.util.*;

public class DFT {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public void DFT2(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}

	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void DFT_TRAVERSAL() {
		int count = 0;
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int key : map.keySet()) {
			if (visited.contains(key))
				continue;
			count++;
			s.push(key);
			while (!s.isEmpty()) {
				// remove
				int rv = s.pop();
				// ignor
				if (visited.contains(rv))
					continue;

				// visited mark
				visited.add(rv);
				// self work
				System.out.println(rv + " ");

				// Add unvisited nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}

			}
		}

	}

}
