package graph;

import java.util.*;

public class Dijkstra_algorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}

	}

	public void Addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	class Dijkstrapair {
		int vtx;
		String path;
		int cost;

		public Dijkstrapair(int vtx, String path, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.path = path;
			this.cost = cost;

		}
		public String toString() {
			return this.vtx+" --> "+this.path +" @ "+this.cost;
		}
		
	}
	

	public void Dijkstra(int src) {
		PriorityQueue<Dijkstrapair> pq = new PriorityQueue<>(new Comparator<Dijkstrapair>() {

			@Override
			public int compare(Dijkstrapair o1, Dijkstrapair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
			
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new Dijkstrapair(src, ""+src, 0));
		while(!pq.isEmpty()) {
			//rmeove
			Dijkstrapair rv = pq.poll();
			//ignore
			if(visited.contains(rv.vtx)) {
				continue;
			}
			//visited
			visited.add(rv.vtx);
			//self work
			System.out.println(rv);
			//add unvisited nbrs
			for(int nbrs: map.get(rv.vtx).keySet()) { // from get rv.vtx you will get the address of the vertex and then u can do .keyset so u will get all the keysets
				if(!visited.contains(nbrs)) { // add only those nbrs which are not already into the visited set
					int cost = map.get(rv.vtx).get(nbrs); // say u removed 4 vtx so get rv.4 so u will get address 4k . get nbrs u will get its nbrs cost
					pq.add(new Dijkstrapair(nbrs, rv.path + nbrs, rv.cost+cost)); // say u wanted to concat 2 after 4 and 2 is the nbrs of 4 so 2 , 4+2, rv.cost mtlb 4 tk ka path + 2 ka apna path
				}
			}
		}
		

	}
	public static void main(String[] args) {
		Dijkstra_algorithm dj = new Dijkstra_algorithm(7);
			// TODO Auto-generated method stub
			dj.Addedge(1, 2, 3);
			dj.Addedge(1, 4, 7);
			dj.Addedge(2, 3, 1);
			dj.Addedge(3, 4, 6);
			dj.Addedge(5, 4, 2);
			dj.Addedge(5, 6, 4);
			dj.Addedge(5, 7, 3);
			dj.Addedge(6, 7, 1);
			dj.Dijkstra(1);
			


		
	}

}
// this algorithm is perfect but it will fail in one case 
// if ur graph contains a -ve edge then it will definately fail so to solve those types of problem we use bellman ford alogrithm 
// both dijkastra and bell man ford are ok with the directed or undirected graph but but the dijkstra has a problem with negative weight but bellman ford doesnt have any problem 
// but bell man has problem with negative weight cycle like 6+-10 = -4 there is not a single algorithm exists to solve the negative cycle problem 
// now we will do 2 question 
// 1st u will be given with negative weight find the shortest path sssp (single source shortest path we will find it with the help of bell man ford)
// 2st if graph has cycle then how to find that the cycle sum is negative 
