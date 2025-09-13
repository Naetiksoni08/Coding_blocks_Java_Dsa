package assignment_questions;

import java.util.*;

public class Remove_the_leaves {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Remove_the_leaves m = new Remove_the_leaves();
		BinaryTree bt = m.new BinaryTree();
		bt.removeLeaves();
		bt.display();
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

		public void removeLeaves() {
			this.removeLeaves(null, this.root, false);
		}

		private void removeLeaves(Node parent, Node child, boolean ilc) { 
			// here parent in parameters is current node par jaha hum khade hai uska parent 
			// child hai jis node par we are standing
			// ilc is is left child 
			if (child == null) { // agar jis node par khade hai voh null hai toh return karde chup chap
				return;
			}
			if (child.left == null && child.right == null) { // jist node par hade hai agar uska left aur right exist nai karta toh voh leaf hai remove kardo
				if (ilc) { // true hoga this tells ki ilc tells us 18 is left child of 12, so we correctly update 12.left = null.
					parent.left = null; // 
				} else {
					parent.right = null;

				}
			}
			removeLeaves(child, child.left, true);
			removeLeaves(child, child.right, false); // in our case, child is 12 yani parent of 18 12.left ek baar check kara aur ek baar right
//			so ok hume kyuki input paata tha isliye humai left wale mai true mark kia aur right mai false kyuki left mai child hai aur right mai nai

		}

	}

}
