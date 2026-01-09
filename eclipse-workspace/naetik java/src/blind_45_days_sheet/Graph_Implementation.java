package blind_45_days_sheet;

import java.util.*;

public class Graph_Implementation {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph_Implementation(int v) {
		map = new HashMap<>(); // 11k
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>()); // 1k,2k,3k,4k,5k sab ke samnai ek hashmap
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void AddVertex(int v) {
		map.put(v, new HashMap<>());
	}

	public boolean ContainsKey(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public boolean ContainsVertex(int v1) {
		return map.containsKey(v1);
	}

	public int noofEdge() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum += map.get(key).size();
		}
		return sum / 2;
	}

	public void RemoveEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	public void removeVertex(int v1) { // v1 = 4
		for (int nbrs : map.get(v1).keySet()) { // 1,3,5 all 4 nbrs
			map.get(nbrs).remove(v1); // 1 ke map ko get karo aur remove 4 sae for 3 and 5
		}
		map.remove(v1); // at the end delete 4 from the main map
	}

	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + " " + map.get(key));

		}
	}

	public boolean haspath(int src, int des, HashSet<Integer> visited) { // 1 sai 6 ke beech mai path hai ya nai hai //
																			// tell
		if (src == des) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) { // if voh vertex contain nai karta set mai tabhi call jaye
				boolean ans = haspath(nbrs, des, visited);

				if (ans) {
					return ans;
				}
			}
		}
		return false;

	}

	public void printallpath(int src, int des, HashSet<Integer> visited, String ans) {
		if (src == des) {
			System.out.println(ans + des);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				printallpath(nbrs, des, visited, ans + src);
			}
		}
		visited.remove(src);
	}

	public Boolean BFS(int src, int des) {// BFS is just like graphs level order traversal so we will be using queue
											// data structure
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		HashSet<Integer> visited = new HashSet<>();
		while (!q.isEmpty()) {
			// remove
			int rv = q.remove();
			// ignore
			if (visited.contains(rv)) {
				continue;
			}
			// mark visited
			visited.add(rv);
			// self work
			if (rv == des) {
				return true;
			}
			// add unvisited nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;
	}

	public Boolean DFS(int src, int des) {// DFS is just like recursion from iterative approach so we will be using stack data structure
		Stack<Integer> s = new Stack<>();
		s.push(src);
		HashSet<Integer> visited = new HashSet<>();
		while (!s.isEmpty()) {
			// remove
			int rv = s.pop();
			// ignore
			if (visited.contains(rv)) {
				continue;
			}
			// mark visited
			visited.add(rv);
			// self work
			if (rv == des) {
				return true;
			}
			// add unvisited nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					s.push(nbrs);
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Graph_Implementation gp = new Graph_Implementation(7);
		gp.AddEdge(1, 4, 6);
		gp.AddEdge(1, 2, 10);
		gp.AddEdge(2, 3, 7);
		gp.AddEdge(3, 4, 5);
		gp.AddEdge(4, 5, 1);
		gp.AddEdge(5, 6, 4);
		gp.AddEdge(7, 5, 2);
		gp.AddEdge(6, 7, 3);
//		gp.removeVertex(4);
		gp.display();
		System.out.println(gp.BFS(1, 6));
		System.out.println(gp.DFS(1, 6));
	}
}
