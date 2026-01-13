package blind_45_days_sheet;

import java.util.*;

public class IsGraphValid {
	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int v1 = edges[i][0];
				int v2 = edges[i][1];
				map.get(v1).add(v2);
				map.get(v2).add(v1);
			}
			Stack<Integer> s = new Stack<>();
			HashSet<Integer> visited = new HashSet<>();
			int count = 0;
			for (int key : map.keySet()) {
				if (visited.contains(key))
					continue;
				count++;
				s.push(key);
				while (!s.isEmpty()) {
					// remove
					int rv = s.pop();

					// ignore
					if (visited.contains(rv)) {
						return false; // that means cycle hai so tree should be acyclic
					}
					// visited mark karo
					visited.add(rv);
					// no self work here

					// add univisited nbrs
					for (int nbrs : map.get(rv)) {
						if (!visited.contains(nbrs)) {
							s.push(nbrs);
						}
					}
				}
			}
			return count == 1;
			// if we have to prove whether a graph is a tree then it should be connected
			// right and it can only be connected if the graph has a single component rather
			// than multiple component if it has multiple component then the graph is
			// disconnected bruhh

		}

	}

}
