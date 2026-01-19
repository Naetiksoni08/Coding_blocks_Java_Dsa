package blind_45_days_sheet;

import java.util.*;

public class Dijksha_Algorithm {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijksha_Algorithm(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	class Dijkshapair {
		int vtx;
		String path;
		int cost;

		public Dijkshapair(int vtx, String path, int cost) {
			this.path = path;
			this.cost = cost;
			this.vtx = vtx;
		}

		public String toString() {
			return this.vtx + " -" + this.path + " path, with cost " + this.cost;
		}
	}

	public void Dijksha(int src) {
		PriorityQueue<Dijkshapair> pq = new PriorityQueue<>(new Comparator<Dijkshapair>() {

			@Override
			public int compare(Dijkshapair o1, Dijkshapair o2) {

				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new Dijkshapair(src, " " + src, 0));
		while (!pq.isEmpty()) {
			// remove
			Dijkshapair rv = pq.poll();
			// ignore
			if (visited.contains(rv.vtx)) {
				continue;
			}
			// visited
			visited.add(rv.vtx);
			// self work
			System.out.println(rv);
			// add unvisited nbrs
			for (int nbrs : map.get(rv.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rv.vtx).get(nbrs);
					pq.add(new Dijkshapair(nbrs, rv.path + nbrs, rv.cost + cost));

				}
			}
		}
	}

//	Find a minimum cost to reach the dynamic destination from a source like 1-2 ,1-3,1-4,1-5,1-6,1-7,1-8
	//mtlb minimum cost kya hoga 1 sai 2 par jane ka and we are also printing the path 
	public static void main(String[] args) {
		Dijksha_Algorithm da = new Dijksha_Algorithm(7);
		da.AddEdge(1, 4, 6);
		da.AddEdge(1, 2, 10);
		da.AddEdge(2, 3, 7);
		da.AddEdge(3, 4, 5);
		da.AddEdge(4, 5, 1);
		da.AddEdge(5, 6, 4);
		da.AddEdge(7, 5, 2);
		da.AddEdge(6, 7, 3);
		da.Dijksha(1);

	}

}
