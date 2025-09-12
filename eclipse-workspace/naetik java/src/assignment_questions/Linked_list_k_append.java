package assignment_questions;

import java.util.Scanner;

public class Linked_list_k_append {

	static class Node {
		int data;
		Node next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 6
		Node head = null; // cuz list is empty
		Node tail = null;
		for (int i = 0; i < n; i++) { // n tk chalega loop
			Node nn = new Node(); // ek node banai
			nn.data = sc.nextInt(); // data enter karva lia
			if (head == null) { // agar head null hai toh tail bhi naya node aur head bhi naya node
				head = nn;
				tail = nn;

			} else {
				tail.next = nn; // other wise nn ko tail ke next mai rakh de aur nn ko tail par leh ja
				tail = nn;
			}

		}
		int k = sc.nextInt(); // k input karva 2
		k = k % n; // if the size of k is greater than that of n 6%2 = 0 so that means ki size of k is greater than n here 2%6 = 2 so if chalea niche wala

		if (k != 0) { // now u got it ki why we wrote this that if k is not equal to null then only call jaye 
			head = appendLastK(head, n, k); //agar k null nai hai toh niche aah
		}
		printlist(head);

	}

	public static Node appendLastK(Node head, int n, int k) {
		Node temp = head; // temp mai assign kia head
		for (int i = 1; i < n - k; i++) { // loop chalaya 6-2 = 4 so 4 value tk loop chala mtb 3rd index
			temp = temp.next; // aage badia temp ko

		}
		Node newhead = temp.next; // ek new head bana jsimai humnai temp yano 4.next yan 5k ka address save karvaya
		temp.next = null; // aur temp.next yani 4.next ko null kardia so ab break hogai linked list 1234 and 56

		Node tail = newhead; // now 5k ko assign kardia humnai ek tail naam ki node mai
		while (tail.next != null) { // aur 5 and 6 par tab tk loop lagaya jab tk tail.next yani 6.next null nai mila 
			tail = tail.next;

		}

		tail.next = head; // joh head tha yani 1 par joh tha usee tail.next par leh aao yani 6. next par 
		return newhead; // aur new head ko return kardo yani 5k

	}

	public static void printlist(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

}
