package blind_45_days_sheet;

import java.util.*;

public class copy_list_with_random_pointers {

	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}

	class Solution {
		public Node copyRandomList(Node head) {
			if (head == null)
				return null;
			HashMap<Node, Node> map = new HashMap<>();
			Node curr = head;
			while (curr != null) {
				map.put(curr, new Node(curr.val));
				curr = curr.next;
			} // copy ban gai

			curr = head;
			while (curr != null) {
				Node copy = map.get(curr);
				copy.next = map.get(curr.next);
				copy.random = map.get(curr.random);
				curr = curr.next;
			}
			return map.get(head); 
		}
	}

}
