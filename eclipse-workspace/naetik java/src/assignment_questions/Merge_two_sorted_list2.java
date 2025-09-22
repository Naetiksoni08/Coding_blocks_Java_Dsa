package assignment_questions;

import java.util.*;

public class Merge_two_sorted_list2 {
	static class Node {
		int value;
		Node next;

		public Node(int data) {
			this.value = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		List<Node> ll = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			Node head = null;
			Node temp = null;
			for (int j = 0; j < n; j++) {
				int item = sc.nextInt();
				Node currentNode = new Node(item);
				if (head == null) {
					head = currentNode;
					temp = currentNode;

				} else {
					temp.next = currentNode;
					temp = currentNode;
				}

			}
			ll.add(head);

		}
		Node temphead = mergeelist(ll);
		Node temp = temphead;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;

		}
	}

	public static Node mergeelist(List<Node> ll) {
		PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> {
			return a.value - b.value;
		});
		for (Node n : ll) {
			if (n != null) {
				pq.add(n);
			}
		}
		Node dummy = new Node(0);
		Node temp = dummy;
		while (!pq.isEmpty()) {
			Node rv = pq.remove();
			temp.next = rv;
			temp = temp.next;
			if (rv.next != null) {
				pq.add(rv.next);
			}

		}
		return dummy.next;

	}
}