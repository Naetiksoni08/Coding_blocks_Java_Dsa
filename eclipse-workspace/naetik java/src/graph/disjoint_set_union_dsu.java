package graph;

import java.util.HashMap;
import java.util.HashSet;

public class disjoint_set_union_dsu {
	class Node{
		int data;
		Node parent; // cuz address rakhna hai hume 
		int rank; 
	}
	
	
	private HashMap<Integer,Node> map = new HashMap();  // so basically ek map leh rahe hai which will say that the vertex ki value and its address which will come from set
//	look we just need to write 3 methods
	//create set 
	//find element
	//union soo
	
	public void Createset(int v) {
		Node nn = new Node();
		nn.data = v; // vertex aah gaya inside data
		nn.rank = 0;
		nn.parent = nn;
		map.put(v, nn); //vertex ke corresponding ek address basically ek node
		
		
		
	}
	
	public int find(int v) {
		Node nn = map.get(v); // say i want to get 4 like i want to find that 4 belongs to which set so maine map sai 4 get karlia basically node mila hoga 
		return findNode(nn).data; // we are saying ki joh bhi findnode parent dhudh ke layega uska hum .data kr lenge toh hume nn ka data miljayega
		
		
	}
	private Node findNode(Node nn) {
		if(nn.parent == nn) { // basically what if voh khudh ka hi arent ho toh simply return nn only mtlb 1 ka parent is 1 so return 1
			return nn;
		}
		Node n =  findNode(nn.parent); // if nai mila toh simply hum bolenge ki find node bhai jao aur nn ka parent dhudh ke aao
		nn.parent = n; //path compression now the average time complexity becomes order of 1 after sometime 
		return n;
	} 
	public void union (int v1,int v2) { // say mujhe 4 sai 5 ke beech mai edge milli 
		Node node1 = map.get(v1); // 4 ka address from map 4k
		Node node2 = map.get(v2);// 5 ka address from map 5k
		Node representativeEle1 = findNode(node1); // 4 ka parent ya represented element ka node ka address mangwa lia 
		Node representativeEle2 = findNode(node2); // 5 ka parent ya represented element ka node ka address mangwa lia  
		if(representativeEle1.rank == representativeEle2.rank) { // ab agar dono ki rank equal hai toh 
			representativeEle1.parent = representativeEle2; // dono mai kisi bhi ek ko parent bana do aur usse dusre tree mai jodh do
			representativeEle2.rank++;
			 
		}
		else if(representativeEle1.rank > representativeEle2.rank) { // if re1 bada hai 2 sai toh
			representativeEle2.parent = representativeEle1; // toh re 2 ke parent ko re 1 bana do toh re 1 is the parent of re 2 
		}
		else {
			representativeEle1.parent = representativeEle2;// otherwise re 1 ke parent ko re 2 bana do toh re 2 is the parent of re 1 
		}
		
		
		 
	}

}
