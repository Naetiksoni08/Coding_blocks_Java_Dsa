package blind_45_days_sheet;
	
import java.util.*;

public class Main {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Main(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	class Edgepair {
		int e1;
		int e2;
		int cost;

		public Edgepair(int e1, int e2, int cost) {
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
		}

		public String toString() {
			return e1 + "-" + e2 + " with cost " + cost;
		}
	}

	public List<Edgepair> GetAllEdge() {
		List<Edgepair> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new Edgepair(e1, e2, cost));
			}
		}
		return ll;

	}

	public int Kruskal() {
		List<Edgepair> ll = GetAllEdge();
		Collections.sort(ll, new Comparator<Edgepair>() {

			@Override
			public int compare(Edgepair o1, Edgepair o2) {

				return o1.cost - o2.cost; // increasing order
			}
		});
		int sum = 0;
		Disjoint_Union_Set_DSU dsu = new Disjoint_Union_Set_DSU();
		for (int v : map.keySet()) {
			dsu.CreateSet(v);
		}
		for (Edgepair e : ll) {
			int re1 = dsu.Find(e.e1);
			int re2 = dsu.Find(e.e2);
			if (re1 == re2) {
				// nothing if same hai toh cycle hai
			} else {
				dsu.union(re1, re2);
				sum += e.cost;
				//System.out.println(e);
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no of vertices
		Main ks = new Main(n);
		int m = sc.nextInt(); // no of edges
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			ks.AddEdge(v1, v2, cost);
		}
		System.out.println(ks.Kruskal());

	}
}

class Disjoint_Union_Set_DSU {
	class Node {
		int rank;
		Node parent;
		int data;
	}

	private HashMap<Integer, Node> map = new HashMap<>();

	public void CreateSet(int v) { // order of 1 time for making each set
		Node nn = new Node();
		nn.rank = 0;
		nn.data = v;
		nn.parent = nn;
		map.put(v, nn);

	}

	public int Find(int v) { // return the representative element of the v vertex
		Node nn = map.get(v);
		return find(nn).data;

	}

	private Node find(Node nn) {
		if (nn.parent == nn) {
			return nn;
		}
		Node n = find(nn.parent); // 1k
		nn.parent = n; // 7 ko bhi 1 ke niche laga toh so 7k ka parent is also 1k so this is path
		return n;				// compression
	}

	public void union(int v1, int v2) { // if i found 2 vertex v1 and v2 then do union of both the vertex
		Node nn1 = map.get(v1);
		Node nn2 = map.get(v2);
		Node rn1 = find(nn1);
		Node rn2 = find(nn2); // rn is basically representative node basically representative element of 7
								// samjh le
		if (rn1.rank == rn2.rank) {
			rn1.parent = rn2;// rn1 ka parent is rn2 so ab rn2 ki rank ko ek sai bada do
			rn2.rank++;
		} else if (rn1.rank > rn2.rank) {
			rn2.parent = rn1; // now rn2 ka parent is rn1
		} else {
			rn1.parent = rn2;
		}

	} 
}



