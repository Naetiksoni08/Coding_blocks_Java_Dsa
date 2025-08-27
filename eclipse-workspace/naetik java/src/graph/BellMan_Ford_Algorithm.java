package graph;

import java.util.*;

public class BellMan_Ford_Algorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellMan_Ford_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}

	}

	public void Addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
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

	public List<Edgepair> getalltheedges() {
		List<Edgepair> ll = new ArrayList<>();
		for (int e1 : map.keySet()) { // got all the edges
			for (int e2 : map.get(e1).keySet()) { // got all the nbrs of that edge
				int cost = map.get(e1).get(e2);
				ll.add(new Edgepair(e1, e2, cost)); // this thing will also include cuplicate edges like 1-->2 so 2 -->
													// 1 but we will handle that inside the kruskal code like ignore
													// step mai it will automatically get ignore

			}
		}
		return ll;
	}

	public void BellMan_Ford() {
		int v = map.size(); // we got the size of the map
		int dis[] = new int[v + 1]; // but we will start from 1th index in the array cuz 0th index is of no use to
									// us
		for (int i = 2; i < dis.length; i++) { // put + infinity from 2nd index
			dis[i] = 9999999;
		}
		List<Edgepair> ll = getalltheedges();
		for (int i = 1; i <= v; i++) { // v-1 times we will relax
			for (Edgepair e : ll) {
				if (i == v && dis[e.e2] > dis[e.e1] + e.cost) {// relax
					System.out.println("negative weight cycle");
					return;
				}
				if (dis[e.e2] > dis[e.e1] + e.cost) {// relax
					dis[e.e2] = dis[e.e1] + e.cost;
				}
			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}
	}

	public static void main(String[] args) {
		BellMan_Ford_Algorithm bf = new BellMan_Ford_Algorithm(5);
		bf.Addedge(1, 2, 8);
		bf.Addedge(2, 5, 2);
//		bf.Addedge(2, 5, -2); // for negative weight cycle 
		bf.Addedge(5, 2, 1);
		bf.Addedge(4, 5, 4);
		bf.Addedge(3, 4, -3);
		bf.Addedge(1, 3, 4);
		bf.Addedge(1, 4, 5);
		bf.BellMan_Ford();
	}

	// why v-1 times relax karnvaya
}
