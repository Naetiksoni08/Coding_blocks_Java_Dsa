package graph;

import java.util.*;

public class graph_implementation {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public graph_implementation(int v) {
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

	public boolean constainsedge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public boolean constainsvertex(int v1, int v2) {
		return map.containsKey(v2);
	}

	public int noofedge() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum += map.get(key).size();
		}
		return sum / 2;
	}

	public void addvertex(int v) {
		map.put(v, new HashMap<>());
	}

	public void removeedge(int v1, int v2, int cost) {
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
		for (int key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

	// we will be given with a source and destination and we have to tell whether
	// path exist between those two or not like from 1 we have to to 6 so tell if we
	// can go is there exists any path or not
	public boolean haspath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true; // found the path
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) { // say 1,6 ka path check karna tha toh humne get kia 1 ko toh uska
													// address mila hoga aur address ke corresponding map hota toh unki
													// key nikal li nbrs aah gaye
			if (!visited.contains(nbrs)) {
				boolean ans = haspath(nbrs, des, visited);// mtlb 1 nbrs kon kon 2,4 so call lagega 2,6 ka and so on
				if (ans) {
					return ans;
				}
			}
		}
		return false;

	}
	//now the question is same but we have to print all the paths like 1,4,5,6 1,2,3,4,5,6 etc
	public void printallpath(int src, int des, HashSet<Integer> visited,String ans) {
		if (src == des) {
			System.out.println(ans+des);
			return ; // found the path
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) { // say 1,6 ka path check karna tha toh humne get kia 1 ko toh uska
													// address mila hoga aur address ke corresponding map hota toh unki
													// key nikal li nbrs aah gaye
			if (!visited.contains(nbrs)) {
			   printallpath(nbrs, des, visited,ans+src);// mtlb 1 nbrs kon kon 2,4 so call lagega 2,6 ka and so on
			}
		
		} 
		visited.remove(src); // backtracking

	}

}
