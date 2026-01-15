package blind_45_days_sheet;

import java.util.*;

public class Disjoint_Union_Set_DSU {
	class Node {
		int rank;
		Node parent;
		int data;
	}

	private HashMap<Integer, Node> map = new HashMap<>();

	public void CreateSet(int v) { // order of 1 time for making each set
		Node nn = new Node();
		nn.rank = 0;
		nn.data = v;
		nn.parent = nn;
		map.put(v, nn);

	}

	public int Find(int v) { // return the representative element of the v vertex
		Node nn = map.get(v);
		return find(nn).data;

	}

	private Node find(Node nn) {
		if (nn.parent == nn) {
			return nn;
		}
		Node n = find(nn.parent); // 1k
		nn.parent = n; // 7 ko bhi 1 ke niche laga toh so 7k ka parent is also 1k so this is path
		return n;				// compression
	}

	public void union(int v1, int v2) { // if i found 2 vertex v1 and v2 then do union of both the vertex
		Node nn1 = map.get(v1);
		Node nn2 = map.get(v2);
		Node rn1 = find(nn1);
		Node rn2 = find(nn2); // rn is basically representative node basically representative element of 7
								// samjh le
		if (rn1.rank == rn2.rank) {
			rn1.parent = rn2;// rn1 ka parent is rn2 so ab rn2 ki rank ko ek sai bada do
			rn2.rank++;
		} else if (rn1.rank > rn2.rank) {
			rn2.parent = rn1; // now rn2 ka parent is rn1
		} else {
			rn1.parent = rn2;
		}

	} // due to the use of find method in union method the tc becomes somehting in log
		// n and find method ka bhi ja raha hai logn mai time complexity so isliye we
		// have a technique of path compression due to this average complexity will
		// become order of 1

}
// path compression mai hum kya karenge har ek node ko na uske parent ke sath attach kardenge isse joh hai find ki complexity kam ho jayegi but if u will say ki rank bhi toh change ho jayega so yes thats whynhum yeh assume karnege ki jab union leh rahe ho toh tree vaise ka vaisa hi hai koi path comppression nai hua hai but jab find ki baat ayegi toh representative element hum o(1) mai mil jayegi after sometime simple  
