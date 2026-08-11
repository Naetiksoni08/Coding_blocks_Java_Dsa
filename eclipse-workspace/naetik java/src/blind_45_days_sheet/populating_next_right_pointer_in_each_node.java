package blind_45_days_sheet;

import java.util.*;

public class populating_next_right_pointer_in_each_node {

	class Node {
		public int val;
		public Node left;
		public Node right;
		public Node next;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, Node _left, Node _right, Node _next) {
			val = _val;
			left = _left;
			right = _right;
			next = _next;
		}
	};

	class Solution {
		public Node connect(Node root) {
			if (root == null) {
				return null;
			}
			Queue<Node> queue = new LinkedList<>();
			queue.add(root);
			while (!queue.isEmpty()) {
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					Node curr = queue.poll();
					if (i < size - 1) { // if true then that means that is the only node in that level for example for 1
										// size = 1 i = 0 0<1-1 = 0<0 no so 1.next = null
						// if u think ki 1.next = null yeh null kaha sai aya toh null by default aah
						// jayega
						curr.next = queue.peek();
					}
					if (curr.left != null)
						queue.add(curr.left);
					if (curr.right != null)
						queue.add(curr.right);
				}

			}
			return root;

		}
	} // space 0(n) and time 0(n) so now we need to do this question in 0(1) space 

}
