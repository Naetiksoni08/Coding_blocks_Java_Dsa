package assignment_questions;

public class Cycle_detection_and_removal_in_the_linked_list {
	class Node {
		public int data;
		public Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}


		public Node hasCycle(Node head) {
			Node slow = head;
			Node fast = head;
			while (fast != null && fast.next != null) { // the first condition is for even cycle length and the secone
														// is for odd cycle length
				slow = slow.next;
				fast = fast.next.next;
				if (slow == fast) {
					return slow; // if slow aur fast mil jaate hai then it means ki cycle hai
				} // meeting point return kardia bas

			}
			return null;

		}

		boolean floydCycleRemoval(Node head) {
			Node meetNode = hasCycle(head); // meeting node mangwa lia humnai
			if (meetNode == null) {
				return false;
			}
			Node fast = meetNode; // fast ko rakha meeting point par yani 5 par 1>2>3>4>5 is linked list so
									// meeting point is 5 and 5 is connected to 2
			Node slow = head; // aur slow ko rakha 1 par
			while (slow.next != fast.next) { // ab jab tk dono nai mil jaate address match hoga
				slow = slow.next; // dono ko chalao.. 1 ka next ka address == 5 ka next ke address sai toh fast ka
									// next ka address null kardo
				fast = fast.next;

			}
			fast.next = null;
			return true;

		}
	}

