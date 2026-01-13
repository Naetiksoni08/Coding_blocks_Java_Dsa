package blind_45_days_sheet;

import java.util.*;

public class Is_Graph_Bipartite {

	class Solution {
		public boolean isBipartite(int[][] graph) { // we will apply BFS here

			Queue<Is_Bipartite_pair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>(); // why map because hume distance ki bhi need thi so this int,int stores vertex,distance this was not possible in set thats why we took the map
			for (int key = 0; key < graph.length; key++) {
				if (visited.containsKey(key))
					continue;

				q.add(new Is_Bipartite_pair(key, 0)); // we will put key,0 in the queue and start with BFS
				while (!q.isEmpty()) {
					// remove
					Is_Bipartite_pair rv = q.poll();

					// ignore if already visited
					if (visited.containsKey(rv.vtx)) {
						if (visited.get(rv.vtx) != rv.dis) { // if joh remove kia hai aur visited hai uska distance joh
																// hai voh wala pair aur joh humnai abhi remove kia hai
																// uska distance if it is not equal then odd length ki
																// cycle hai thats it .
							return false; // odd length cycle 
						}
						continue; // even length ki cycle hai aage chalo

					}
					// mark visited
					visited.put(rv.vtx, rv.dis);

					// self work nothing here

					// add unvisited nbrs
					for (int nbrs : graph[rv.vtx]) { // from here i will get the address of 1D array this will give me
														// the index too
						if (!visited.containsKey(nbrs)) {
							q.add(new Is_Bipartite_pair(nbrs, rv.dis + 1));
						}

					}

				}
			}
			return true; // it is a bipartite

		}
	}

	class Is_Bipartite_pair {
		int vtx;
		int dis; // distance

		public Is_Bipartite_pair(int vtx, int dis) {
			this.vtx = vtx;
			this.dis = dis;
		}
	}

}
