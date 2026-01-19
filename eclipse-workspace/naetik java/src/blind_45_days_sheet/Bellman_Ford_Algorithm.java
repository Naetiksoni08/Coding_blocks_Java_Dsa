package blind_45_days_sheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// single source shortest path algo - dijksha and bellman ford algo
public class Bellman_Ford_Algorithm {
	// why bellman ford because jaha tk graph mai negative cost ki baat aah gai waha
	// par dijksha fail hojata hai. dijksha joh hai usse negative cost sai problem
	// hai aur bellman ford ko negative weight ke cycle sai hai. there is no algo
	// joh negative weight ke cycle ke ques ko solve karde varna dono algo ko hum
	// directed undirected dono jagah lagah sakte hai

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Bellman_Ford_Algorithm(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost); // if we remove 1 line then the graph becomes directed
	}

	class Edgepair {
		int e1;
		int e2;
		int cost;

		public Edgepair(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;

		}

		public String toString() {
			return e1 + " -> " + e2 + " @ " + cost;
		}
	}

	public List<Edgepair> GetAllEdges() {
		List<Edgepair> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new Edgepair(e1, e2, cost));

			}
		}
		return ll;
	}

	public void Bellman_Ford() {
		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 2; i < dis.length; i++) {
			dis[i] = 999999999;
		}
		List<Edgepair> ll = GetAllEdges();
		for (int i = 1; i <= v; i++) {
			for (Edgepair e : ll) {
				if (i == v && dis[e.e2] > dis[e.e1] + e.cost) {
					System.out.println("bro negative weight ka cycle hai!");
					return;
				}
				if (dis[e.e2] > dis[e.e1] + e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}
			}

		}
		for (int i = 1; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}

	}

	public static void main(String[] args) {
		Bellman_Ford_Algorithm bf = new Bellman_Ford_Algorithm(5);
		bf.AddEdge(1, 2, 8);
		bf.AddEdge(2, 5, -2);
//		bf.AddEdge(2, 5, 2);
		bf.AddEdge(5, 2, 1);
		bf.AddEdge(4, 5, 4);
		bf.AddEdge(3, 4, -3);
		bf.AddEdge(1, 3, 4);
		bf.AddEdge(1, 4, 5);
		bf.Bellman_Ford();

	}
}
