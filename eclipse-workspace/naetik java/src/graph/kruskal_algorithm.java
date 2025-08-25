package graph;

import java.util.*;


public class kruskal_algorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public kruskal_algorithm(int v) {
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
	class Edgepair{
		int e1;
		int e2;
		int cost;
		public Edgepair(int e1,int e2,int cost) {
			// TODO Auto-generated constructor stub
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
			
		 
		}
		public String toString() {
			return e1+" -> "+e2+" @ " + cost;
		}
	}
	

	public List<Edgepair> getalltheedges() {
		List<Edgepair> ll = new ArrayList<>();
		for(int e1:map.keySet()) { // got all the edges
			for(int e2 : map.get(e1).keySet()) { // got all the nbrs of that edge 
				int cost = map.get(e1).get(e2);
				ll.add( new Edgepair(e1,e2,cost)); //this thing will also include cuplicate edges like 1-->2 so 2 --> 1 but we will handle that inside the kruskal code like ignore step mai it will automatically get ignore
				
			}
		}
		return ll;
	}
	public int kruskal() {
		List<Edgepair> ll = getalltheedges();
		Collections.sort(ll, new Comparator<Edgepair>() { 

			@Override
			public int compare(Edgepair o1, Edgepair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost; // increasing order 
			}
		});
		int sum = 0;
		 disjoint_set_union_dsu dsu = new  disjoint_set_union_dsu();
		 for(int v:map.keySet()) {
			 dsu.Createset(v);
		 }
		 for(Edgepair e : ll) {
			 int re1 = dsu.find(e.e1);
			 int re2 = dsu.find(e.e2);
			 if(re1 == re2) {
//				 do nothing cuz cycle ban rahi hogi
			 }
			 else {
				 dsu.union(e.e1, e.e2);
				 sum+=e.cost;
				 System.out.println(e);
			 }
		 }
		 return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		kruskal_algorithm ks = new kruskal_algorithm(n);
		int m = sc.nextInt();
		for (int i = 0; i <m; i++) {
			int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int cost = sc.nextInt();
		ks.Addedge(v1, v2, cost);
			
		}
	System.out.println(ks.kruskal());
		
		
	}
	

}
