package assignment_questions;

import java.util.*;

public class construct_tree_preorder_and_inorder {
	  static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
    	construct_tree_preorder_and_inorder m = new construct_tree_preorder_and_inorder();
    	
        int n= scn.nextInt();
        int[] pre = takeInput(n);
        int[] in = takeInput(n);

        // Handling empty input case
        if (pre.length == 0 || in.length == 0) {
            System.out.println("Invalid input: Preorder and Inorder arrays cannot be empty.");
            return;
        }

        // Check if both arrays are of the same size
        if (pre.length != in.length) {
            System.out.println("Invalid input: Preorder and Inorder arrays must have the same length.");
            return;
        }

        BinaryTree bt = m.new BinaryTree(pre, in);
        bt.display();
    }
    


	private static int[] takeInput(int size) {
		 if (size <= 0) {  // Prevents invalid array access
	            return new int[0];
	        }

	        int[] rv = new int[size];
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
				left = null;
				right = null;

			}
		}

		private Node root;

		public BinaryTree(int[] pre, int[] in) {
			this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
		}

		private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
			if (plo > phi || ilo > ihi) {
				return null;
			}
			Node node = new Node(pre[plo]);
			int idx = searchidx(in, ilo, ihi, pre[plo]);
			 if (idx == -1) {
	                System.out.println("Error: Element " + pre[plo] + " not found in inorder array.");
	                return null;
	            }
			int ne = idx - ilo; // 12 mai sai 19 19 ko chodh kar
			node.left = construct(pre, plo + 1, plo + ne, in, ilo, idx - 1);
			node.right = construct(pre, plo + ne + 1, phi, in, idx + 1, ihi);
			return node;

		}

		private int searchidx(int[] in, int start, int end, int item) {
			for (int i = start; i <= end; i++) {
				if (in[i] == item) {
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

			Queue<Node> q = new LinkedList<>();

			q.add(node);

			while (!q.isEmpty()) {

				Node rv = q.remove();

				System.out.print(rv.data + " ");

				if (rv.left != null) {

					q.add(rv.left);
				}

				if (rv.right != null) {

					q.add(rv.right);

				}

			}
		}

	}

}
