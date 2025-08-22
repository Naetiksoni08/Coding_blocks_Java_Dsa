package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Breadth_first_traversal_BFT {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Breadth_first_traversal_BFT(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i < v; i++) {
			map.put(i, new HashMap<>());
		}

	}

	public void Addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}


	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count = 0;
		for (int key : map.keySet()) { // we will get something liek this 1,2,3,4,5,6,7,8,9(and 3 components will be there of the graph that means 3 hisse of the graph 
			if (visited.contains(key)) { // before adding something to the queue we will check if already set mai that particular element is present or not 
				continue;
			}
			count++; // count component
			q.add(key); // firstly before starting bfs we need to add something to the queue
			while (!q.isEmpty()) { // from here till end it is bfs we have jut add some things and made it bft
				// 1. remove
				int rv = q.remove();

				// 2. ignore if removed one is already visited or present in the set
				if (visited.contains(rv)) {
					continue;
				}

				// 3. mark visited
				visited.add(rv);

				// 4. self work
				System.out.println(rv + " ");

				// 5. add unvisited neighbours
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
				System.out.println(count);
			}
		}
	}

}
