package blind_45_days_sheet;

import java.util.*;

public class Prims_Algorithm {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algorithm(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}

	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	class Primspair {
		int vtx;
		int acq; // this vertex is acquired by which vertex jaise 4 ke nbrs 1,3,5 so 1 is
					// acquired by 4 same for 3 and 5
		int cost;

		public Primspair(int vtx, int acq, int cost) {
			this.vtx = vtx;
			this.acq = acq;
			this.cost = cost;
		}

		public String toString() {
			return vtx + "-" + acq + " with cost " + cost;
		}
	}

	public int Prims() {
		PriorityQueue<Primspair> pq = new PriorityQueue<>(new Comparator<Primspair>() {

			@Override
			public int compare(Primspair o1, Primspair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new Primspair(1, 1, 0)); // 1 is the vtx it is acquired by 1 only with cost 0
		int sum = 0;
		while (!pq.isEmpty()) {
			// remove
			Primspair rv = pq.poll();
			// ignore
			if (visited.contains(rv.vtx)) {
				continue;
			}
			// mark visited
			visited.add(rv.vtx);
			// self work
			System.out.println(rv);
			sum += rv.cost;
			// add unvisited nbrs
			for (int nbrs : map.get(rv.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rv.vtx).get(nbrs); // this is how we will get the cost
					pq.add(new Primspair(nbrs, rv.vtx, cost));// rv.vtx becuase joh vertex hia ussi ke through we are
																// accquiring the vertex
				}
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no of vertices
		Prims_Algorithm ps = new Prims_Algorithm(n);
		int m = sc.nextInt(); // no of edges
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			ps.AddEdge(v1, v2, cost);
		}
		System.out.println(ps.Prims());

	}
}

//Yes, this code will NOT work correctly (or will throw an exception) unless you provide a comparator
//because Java has no idea how to compare Primspair objects, and
// Yes, the comparison must be done based on cost, because Prim’s Algorithm always picks the minimum edge cost.