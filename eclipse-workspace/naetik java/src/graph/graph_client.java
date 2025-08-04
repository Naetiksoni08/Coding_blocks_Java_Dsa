package graph;
import java.util.*;

public class graph_client {

	public static void main(String[] args) {
		graph_demo g = new graph_demo(7);
		// TODO Auto-generated method stub
		g.addedge(1, 2, 3);
		g.addedge(1, 4, 7);
		g.addedge(2, 3, 1);
		g.addedge(3, 4, 6);
		g.addedge(5, 4, 2);
		g.addedge(5, 6, 4);
		g.addedge(5, 7, 3);
		g.addedge(6, 7, 1);
		g.display();
		System.out.println(g.haspath(1, 6,new HashSet()));
		g.printpath(1, 6,new HashSet(),"");

	}

}
