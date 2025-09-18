package assignment_questions;

import java.util.*;

public class Arraylist_of_levels_BT {

	public class Main4 {

		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			Main4 m = new Main4();
			BinaryTree bt1 = m.new BinaryTree();
			System.out.println(bt1.levelArrayList(bt1.root));
		}

		private class BinaryTree {
			private class Node {
				int data;
				Node left;
				Node right;
			}

			private Node root;
			private int size;

			public BinaryTree() {
				this.root = this.takeInput(null, false);
			}

			public Node takeInput(Node parent, boolean ilc) {

				int cdata = scn.nextInt();
				Node child = new Node();
				child.data = cdata;
				this.size++;

				// left
				boolean hlc = scn.nextBoolean();

				if (hlc) {
					child.left = this.takeInput(child, true);
				}

				// right
				boolean hrc = scn.nextBoolean();

				if (hrc) {
					child.right = this.takeInput(child, false);
				}

				// return
				return child;
			}

			public ArrayList<ArrayList<Integer>> levelArrayList(Node root) {
				ArrayList<ArrayList<Integer>> ll = new ArrayList<>();
				if (root == null) {
					return ll;
				}

				Queue<Node> q = new LinkedList<>();
				q.add(root);
				while (!q.isEmpty()) {
					int size = q.size();
					ArrayList<Integer> Newll = new ArrayList<>();
					for (int i = 0; i < size; i++) {
						Node rv = q.poll();

						Newll.add(rv.data);

						if (rv.left != null) {
							q.add(rv.left);
						}
						if (rv.right != null) {
							q.add(rv.right);
						}

					}
					ll.add(Newll);
				}
				return ll;

			}
		}
		// new ll is like a helper
//		data goes in queue then new ll and then ll

	}

}

//dry run 
//so mai krta hu phele 50 aya q mai size = 1 aur loop chala 0 sai 1tk newll bana remove kia queue mai
//sai 50aur new ll mai daal dia check kia 50 ka left aur right 12 aah gaya queue mai aur end mai new ll ke 
//element yani 50 goes into ll then 12 ke sath same aur fir 12 ka left aur right check hoga toh 18 and 13 sath 
//gaye aur size 2 ho jayegi toh poll hokar sath mai gaye in new ll if chalega nai cuz left aur right dono null hai
//aur bas at the end new ll ko copy krdia in ll
