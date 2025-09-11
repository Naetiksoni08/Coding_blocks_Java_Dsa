package assignment_questions;

import java.util.*;

public class Triplet_from_three_linked_lists_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); // 3
		int n2 = sc.nextInt();// 3
		int n3 = sc.nextInt();// 3
		Node head1 = null;
		Node temp1 = null;
		Node head2 = null;
		Node temp2 = null;
		Node head3 = null;
		Node temp3 = null;
		for (int i = 0; i < n1; i++) { // 3 tk loop chala
			int value = sc.nextInt(); // values enter kari
			Node newNode = new Node(value); // ek naya node banaya aur uske anadar values bhej di
			if (head1 == null) { // agar head hi null hai toh head bhi vohi node aur tail bhi vohi node
				head1 = newNode;
				temp1 = newNode;
			} else {
				temp1.next = newNode; // agar aisa nai hai toh temp ke next mai new node banai
				temp1 = newNode; // aur uss node par temp ko point kr va dia
			}

		}
		for (int i = 0; i < n2; i++) {
			int value = sc.nextInt();
			Node newNode = new Node(value);
			if (head2 == null) {
				head2 = newNode;
				temp2 = newNode;
			} else {
				temp2.next = newNode;
				temp2 = newNode;
			}

		}
		for (int i = 0; i < n3; i++) {
			int value = sc.nextInt();
			Node newNode = new Node(value);
			if (head3 == null) {
				head3 = newNode;
				temp3 = newNode;
			} else {
				temp3.next = newNode;
				temp3 = newNode;
			}

		}
		int target = sc.nextInt();
		int[] result = calculatesum(head1, head2, head3, target);
		if (result != null) {
			for (int a : result) {
				System.out.print(a + " ");
			}
		}
	}

	private static int[] calculatesum(Node head1, Node head2, Node head3, int target) {
		Node temp1 = head1;
		int[] finalarr = new int[3];
		while (temp1 != null) {
			Node temp2 = head2;
			while (temp2 != null) {
				Node temp3 = head3;
				while (temp3 != null) {
					if (temp1.value + temp2.value + temp3.value == target) {
						finalarr[0] = temp1.value;
						finalarr[1] = temp2.value;
						finalarr[2] = temp3.value;
						return finalarr;
					}
					temp3 = temp3.next;

				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
		return null;

	}

}

class Node {
	int value;
	Node next;

	public Node(int value) {
		this.value = value;
	}
}
