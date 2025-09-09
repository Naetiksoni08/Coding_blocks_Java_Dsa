package assignment_questions;

import java.util.*;

public class kth_element_from_the_last_of_the_list {

	static class Node {
		int data;
		Node next;

		Node(int item) {
			data = item;
			next = null;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		Node tail = null;
		while (true) {
			int item = sc.nextInt();
			if (item == -1) {
				break;
			}
			Node nn = new Node(item);
			nn.data = item;
			if (head == null) {
				head = nn;
				tail = nn;
			} else {
				tail.next = nn;
				tail = nn;
			}
		}
		int k = sc.nextInt();
		System.out.println(getKthFromLast(head, k));
	}

	public static int getKthFromLast(Node head, int k) {
		Node fast = head;
		Node slow = head;
		for (int i = 0; i < k; i++) {
			if (fast != null)
				fast = fast.next;
		}
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;

		}

		return slow.data;

	}

}
