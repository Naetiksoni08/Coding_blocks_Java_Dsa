package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Depth_first_Traversal_DFT {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public  Depth_first_Traversal_DFT(int v) {
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
	public void DFT() {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for(int key:map.keySet()) {
			if(visited.contains(key)) {
				continue;
			}
			s.push(key);
		while(!s.isEmpty()) { // from here DFS start and goes till end 
			//1. remove
			int rv = s.pop();
			
			//2. ignore if removed one is already visited or present in the set 
			if(visited.contains(rv)) {
				continue; 
			}
			
			// 3. mark visited
			visited.add(rv);
			
			//4. self work
			System.out.println(rv+" ");
			
			//5. add unvisited neighbours
			for(int nbrs: map.get(rv).keySet()) { 
				if(!visited.contains(nbrs)) { 
					s.push(nbrs);
				}
			}
		}
		}
	}


}
