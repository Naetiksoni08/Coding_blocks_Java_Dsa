package trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class topological_algo {

	private HashMap<Integer, List<Integer>> map;

	public topological_algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 0; i < v; i++) {
			map.put(i, new ArrayList<>());
		}
	}

	public void Addedge(int v1, int v2) {
		map.get(v1).add(v2);

	}

	public int[] indegree() {
		int[] in = new int[map.size()];
		for (int e1 : map.keySet()) {
			for (int nbrs : map.get(e1)) {
				in[nbrs]++;

			}
		}
		return in;
	}

	public void topologicalsort() {
		Queue<Integer> q  = new LinkedList<>();
		int [] in = indegree();
		for(int  i = 0 ; i < in.length; i++) {
			if(in[i] == 0) {
				q.add(i);
			}
 		}
		while(! q.isEmpty()) {
			int r = q.poll();
			System.out.print(r + " ");
			for(int nbrs: map.get(r)) {
				in[nbrs]--;
				if(in[nbrs]==0) {
					q.add(nbrs);
				}
			}
		}

	}
	public boolean iscycle() {
		Queue<Integer> q  = new LinkedList<>();
		int [] in = indegree();
		for(int  i = 0 ; i < in.length; i++) {
			if(in[i] == 0) {
				q.add(i);
			}
 		}
		int c = 0;
		while(! q.isEmpty()) {
			int r = q.poll();
			c++;
			System.out.print(r + " ");
			for(int nbrs: map.get(r)) {
				in[nbrs]--;
				if(in[nbrs]==0) {
					q.add(nbrs);
				}
			}
		}
		return c!= map.size();//count match nahi karega toh cycle hai true return hua toh cycle
		
	}

}
