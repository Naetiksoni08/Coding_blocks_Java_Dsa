package assignment_questions;

import java.util.Scanner;

import assignment_questions.Is_Balanced.Node;

public class Is_balanced_optimized {

	class Node {
		int value;
		Node left;
		Node right;
//		ek simple Node banaya jisme value, left, right hain.
	}

	private class Balancedpair {
		boolean isbalance = true; // Balanced = true by default because ek empty subtree is always balanced.
		int height = -1; 
//		Jab node == null hota hai, toh uska height mathematically -1...Example: agar leaf node 40 hai, toh 40.left and 40.right dono null honge. Unka height = -1 return karega.
	}

	public Node CreateTree(Scanner sc) {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.value = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree(sc);
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree(sc);
		}
		return nn;
	}

	public Balancedpair isbalanced(Node nn) {
		if (nn == null) {
			return new Balancedpair(); 
//			agar nn yani node hi null ex 40 or 50 hai toh return true so ek new balanced pair banakar return kia jismai by fault -1 aur true hoga

		}
		Balancedpair lbp = isbalanced(nn.left); 
		Balancedpair rbp = isbalanced(nn.right);
		//Pehle left aur right ka BalancedPair mangwa liya (lbp, rbp).

		Balancedpair sbp = new Balancedpair();
		//Apna ek naya pair (sbp) banaya for current node. for 20

		sbp.height = Math.max(lbp.height, rbp.height) + 1; // 20 wale node ki height find karli left aur right ka max +1 voh self node ki height hogi

		boolean sb = Math.abs(lbp.height - rbp.height) <= 1; // check karlenge ki left aur right ki height ka dffierence is <= 1 true false save karva lia sb mai 

		sbp.isbalance = lbp.isbalance && rbp.isbalance && sb; // aur left ki right ki aur sb teeno ka and leke sbp mai store karva dia aur return kardia

		return sbp;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Is_balanced_optimized ibo = new Is_balanced_optimized(); // made instance or object so that i can access the inner methods in this class or in this program
		Node root = ibo.CreateTree(sc); // tree banaya
		Balancedpair result = ibo.isbalanced(root); 
		System.out.println(result.isbalance);
	}

}
