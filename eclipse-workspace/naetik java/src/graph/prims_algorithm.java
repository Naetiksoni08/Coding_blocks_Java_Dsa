package graph;

import java.util.*;

public class prims_algorithm {
	
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public prims_algorithm(int v) {
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
	class pair{
		int vtx;
		int accquire;
		int cost;

		public pair(int vtx,int accquire,int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.accquire = accquire;
			this.cost = cost;
			
		 
		}
		public String toString() {
			return vtx+" -> "+accquire+" @ " + cost;
		}
	}
	public int prims() {
	PriorityQueue<pair> pq = new PriorityQueue<>(new Comparator<pair>() {

		@Override
		public int compare(pair o1, pair o2) {
			// TODO Auto-generated method stub
			return o1.cost-o2.cost;
		}
		
	});
	
	HashSet<Integer> visited = new HashSet(); 
	pq.add(new pair(1,1,0));
	int sum = 0;
	while(!pq.isEmpty()) {
		//remove
		pair rv = pq.remove(); // u can also do poll
		//ignore
		if(visited.contains(rv.vtx)) {
			continue;
		}
		//visited
		visited.add(rv.vtx);
			
		//self work
		System.out.println(rv);
		sum+=rv.cost;
		//add unvisited nbrs
		for(int nbrs: map.get(rv.vtx).keySet()) {
			if(!visited.contains(nbrs)) {
				int cost = map.get(rv.vtx).get(nbrs);
				pq.add(new pair(nbrs,rv.vtx,cost)); // why not accquire becuase accquire voh kr raha hai jh removed hai like 4 rmeove kia toh 4 ke respect mai accquire karenge so 1 is accquired by 4 with cost something 
			}
		}
		
	}
	return sum;
	
	}
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			prims_algorithm ps =new prims_algorithm(n);
			int m = sc.nextInt();
			for (int i = 0; i <m; i++) {
				int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			ps.Addedge(v1, v2, cost);
				
			}
		System.out.println(ps.prims());
			
		
		
	}
}
