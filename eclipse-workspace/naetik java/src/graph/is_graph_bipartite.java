package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class is_graph_bipartite {
	class solution {
		public boolean isbipartite(int[][] graph) {
			Queue<bipartitepair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			for (int vtx = 0; vtx < graph.length; vtx++) {
				if (visited.containsKey(vtx)) {
					continue;
				}
				q.add(new bipartitepair(vtx, 0));
				while (!q.isEmpty()) {
					// remove
					bipartitepair rp = q.poll();
					// ignore
					if(visited.containsKey(rp.vtx)) {
						if(visited.get(rp.vtx)!= rp.des) {
							return false;
						}
						continue;
					}
					// marked visited
					visited.put(rp.vtx, rp.des);
					// add
					for (int nbrs : graph[rp.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new bipartitepair(nbrs, rp.des + 1));
						}
					}
				}
			}
			return true;
		}
	}

}

class bipartitepair {
	int vtx;
	int des;

	public bipartitepair(int vtx, int des) {
		this.vtx = vtx;
		this.des = des;

	}
}
