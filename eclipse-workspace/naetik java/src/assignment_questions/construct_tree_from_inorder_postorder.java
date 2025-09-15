package assignment_questions;

import java.util.*;


public class construct_tree_from_inorder_postorder {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		construct_tree_from_inorder_postorder m = new construct_tree_from_inorder_postorder();
		int[] post = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(post, in);
		bt.display();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;

			public Node(int val) {
				this.data = val;

			}
		}

		private Node root;
		private int size;
		
		public BinaryTree(int[] post, int[] in) {
			this.root = this.construct(post, 0, post.length - 1, in, 0, in.length - 1);
		}

		private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
			if(phi<plo || ilo>ihi){
				return null;	
			}
			Node nn = new Node(post[phi]);
			int idx = searchidx(in,ilo,ihi,post[phi]);
			
			int ne = idx - ilo;
			
			nn.left = construct(post, plo, plo+ne-1, in, ilo, idx-1);
			nn.right = construct(post, plo+ne, phi-1, in, idx+1, ihi);
			return nn;
		
		}

		public int searchidx(int[] in, int start, int end, int item) {
			for (int i = start; i <= end; i++) {
				if(in[i]==item)  {
					return i;
				}
				
			}
			return -1;
		}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

	}

}
	
