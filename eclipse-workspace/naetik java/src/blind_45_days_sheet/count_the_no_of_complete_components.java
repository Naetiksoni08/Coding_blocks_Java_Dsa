package blind_45_days_sheet;

import java.util.*;

class Solution {
	public int countCompleteComponents(int n, int[][] edges) {
		HashMap<Integer, HashSet<Integer>> map = new HashMap<>(); // cuz we dont need to store nbrs with weight so we
																	// store only nbrs
		for (int i = 0; i < n; i++) {
			map.put(i, new HashSet<>());
		}

		for (int[] e : edges) {
			map.get(e[0]).add(e[1]);
			map.get(e[1]).add(e[0]);
		}
		int completecount = 0;
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();

		for (int key = 0; key < n; key++) {
			if (visited.contains(key)) {
				continue;
			}
			ArrayList<Integer> component = new ArrayList<>();
			q.add(key);
			while (!q.isEmpty()) {
				int rv = q.poll();
				if (visited.contains(rv)) {
					continue;
				}
				visited.add(rv);
				component.add(rv);
				for (int nbrs : map.get(rv)) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}

			}
			int size = component.size();
			boolean iscomplete = true;
			for (int node : component) {
				if (map.get(node).size() != size - 1) {
					iscomplete = false;
					break;
				}

			}
			if (iscomplete) {
				completecount++; // this is the final count of component
			}

		}
		return completecount;

	}
}

//class Solution {
//    public int countCompleteComponents(int n, int[][] edges) {
//
//        // Build adjacency list
//        HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            graph.put(i, new HashSet<>());
//        }
//
//        for (int[] e : edges) {
//            graph.get(e[0]).add(e[1]);
//            graph.get(e[1]).add(e[0]);
//        }
//
//        HashSet<Integer> visited = new HashSet<>();
//        int completeCount = 0;
//
//        // Traverse all components
//        for (int i = 0; i < n; i++) {
//            if (visited.contains(i)) continue;
//
//            Queue<Integer> q = new LinkedList<>();
//            q.add(i);
//
//            int nodes = 0;
//            int degreeSum = 0;
//
//            // BFS
//            while (!q.isEmpty()) {
//                int rv = q.poll();
//                if (visited.contains(rv)) continue;
//
//                visited.add(rv);
//                nodes++;
//                degreeSum += graph.get(rv).size();
//
//                for (int nbr : graph.get(rv)) {
//                    if (!visited.contains(nbr)) {
//                        q.add(nbr);
//                    }
//                }
//            }
//
//            // Each edge counted twice
//            int edgesInComponent = degreeSum / 2;
//
//            // Complete component check
//            if (edgesInComponent == nodes * (nodes - 1) / 2) {
//                completeCount++;
//            }
//        }
//
//        return completeCount;
//    }
//}
