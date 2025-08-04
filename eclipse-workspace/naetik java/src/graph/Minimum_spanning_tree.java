package graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Minimum_spanning_tree {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Minimum_spanning_tree(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}

	}

	public void addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void prims() {
		PriorityQueue<primspair> pq = new PriorityQueue<>(new Comparator<primspair>() {
			@Override
			public int compare(primspair o1, primspair o2) {
				return o1.cost - o2.cost;
			}

		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new primspair(1, 1, 0));
		while (!pq.isEmpty()) {
			primspair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new primspair(nbrs, rp.vtx, cost));
					

				}
			}

		}
	}

	class primspair {
		int vtx;
		int acqvtx; // acquiring vertex
		int cost;

		public primspair(int vtx, int acqvtx, int cost) {
			this.vtx = vtx;
			this.acqvtx = acqvtx;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return vtx + " " + acqvtx + " @ " + cost;
		}
	}

	public static void main(String[] args) {
		Minimum_spanning_tree pa = new Minimum_spanning_tree(7);
		pa.addedge(1, 2, 2);
		pa.addedge(2, 3, 3);
		pa.addedge(1, 4, 10);
		pa.addedge(4, 5, 8);
		pa.addedge(3, 4, 1);
		pa.addedge(5, 6, 5);
		pa.addedge(5, 7, 6);
		pa.addedge(6, 7, 4);
		pa.prims();
	}
//single source shortest path algorithm
}
