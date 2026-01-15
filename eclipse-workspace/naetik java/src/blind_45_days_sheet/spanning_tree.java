package blind_45_days_sheet;

public class spanning_tree {

	// A spanning tree is the subset of a graph. which has all the vertices convered
	// with minimum possible no of edges. hence a spanning tree doesnt have cycles
	// and it cannot be disconnected.

	// properties of spanning tree

	// - a connected graph can have more than one spanning tree
	// - if a spanning tree has n vertices then no of edges would be n-1
	// - all possible spanning tree of a graph will have the same number of edges
	// and vertices
	// - the spanning tree does not have a cycle
	// - removing one edge from the spanning tree will make hte graph diconnected ie
	// the spanning tree is minimally connected..
	// - adding one edge to the spanning tree will create a circuit or loop ie the
	// spanning tree is maximally acyclic.
	// BUT WE HAVE TO STUDY MST(MINIMUM SPANNING TREE)
	// it is a type of a spanning tree in which all the weight of the edge or a tree
	// is minimum basically minimum weight ale spanning tree ko minimum spanning
	// tree bolte hai.
	// a graph must be connected then only it is possible to make spanning tree

	// 2 algos -kruskal and prims both are greedy algos(mere paas current mai kya
	// best options hai that is being greedy like rn 10 lakh or future mai 60 lakh
	// thats being greedy..

	// kruskal mai pure graph mai sab sai minimum wala edge lete hai and fir slowly
	// increase karte hai and we make sure that cycle na bane.

	// kruskal mai first we will make DSU disjoint set union. it will include 3
	// steps
	// --make set
	// --find the element
	// --union by rank that is the height
	// lastly path compression karte hai 

	// union by rank includes 2 things
	// if the rank is same then kisi bhi ek ka parent change kardo koi effect nai
	// ayega bas dusre wale(jiska parent change nai kia uski) ki rank +1 hojyegi
	// rank basically means height of the tree

	// if the rank is diff jaise 1 and 2 so jiski rank choti hai na uska parent
	// change kardo taki kisi aur node par effect na aaye sath ke sath code kam
	// likhna pade aur tc bache
	
	

}
