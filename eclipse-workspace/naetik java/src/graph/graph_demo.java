package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class graph_demo {
	// it is a finite set of edge and vertex
	// all tree are graph but not vice versa
	// root node is vertex and connecting lines are called edges
	// types of graph -- undirected and directed graph

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public graph_demo(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}

	}

	public void addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean containsedge(int v1, int v2) {
		return map.get(v1).containsKey(v2);

	}

	public boolean containsvertex(int v1) {
		return map.containsKey(v1);

	}

	public int noofedge() {
		int sum = 0;
		for (int vtx : map.keySet()) {
			sum += map.get(vtx).size();

		}
		return sum / 2;
	}

	public void removeedge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	public void removevertex(int v1) {
		for (int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}

	public void display() {
		for (int vtx : map.keySet()) {
			System.out.println(vtx + " " + map.get(vtx));
		}

	}

	public boolean haspath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = haspath(nbrs, des, visited);
				if (ans == true) {
					return ans;

				}

			}

		}
		return false;

	}

	public void printpath(int src, int des, HashSet<Integer> visited, String str) {
		if (src == des) {
			System.out.println(str + des);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				printpath(nbrs, des, visited, str + src);

			}

		}
		visited.remove(src);

	}

	public boolean BFS(int src, int des) { // breadth first search // time complexity will be v+e vertex+edges
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while (!q.isEmpty()) {
			// remove
			int rv = q.poll();
			// ignore
			if (visited.contains(rv)) {
				continue;
			}
			// visited
			visited.add(rv);
			// self work
			if (rv == des) {
				return true;
			}
			// add
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}

		}
		return false;
	}

	public void BFT() { // breadth first traversal
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);

			while (!q.isEmpty()) {
				// remove
				int rv = q.poll();
				// ignore
				if (visited.contains(rv)) {
					continue;
				}
				// visited
				visited.add(rv);
				// self work
				System.out.println(rv + " ");
				// add
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}

		}
		System.out.println();
	}

	public boolean DFS(int src, int des) {// depth first search guarantees the shortest path bfs do not guarantee this
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		st.add(src);
		while (!st.isEmpty()) {
			// remove
			int rv = st.pop();
			// ignore
			if (visited.contains(rv)) {
				continue;
			}
			// visited
			visited.add(rv);
			// self work
			if (rv == des) {
				return true;
			}
			// add
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}

		}
		return false;

		// remove
		// ignore
		// visited
		// self work
		// add node
		// unvisited//level order traversal is breadth first search

	}

}