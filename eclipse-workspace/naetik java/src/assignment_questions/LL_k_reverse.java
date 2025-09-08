package assignment_questions;

import java.util.*;

public class LL_k_reverse {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public class KGroupReverse {
		
		 public static Node reverseKGroup(Node head, int k) {
			 
			 Node current = head;
			 Node prev = null;
			 Node next = null;
			 
			 Node temp = head;
			 int count = 0;
			  while (temp != null && count < k) {
				  temp = temp.next;
				  count++;
			  }
			  if (count < k) {
				  return head; 
			  }
			  count = 0;
			  current = head;
			  while (current != null && count < k) {
				  next = current.next;
				  current.next = prev;
				  prev = current;
		            current = next;
		            count++;
		        
				  
			  }
			  if (next != null) {
		            head.next = reverseKGroup(next, k);
		        }
			  return prev;

		 }
		 public static void printList(Node head) {
		        Node temp = head;
		        while (temp != null) {
		            System.out.print(temp.data + " ");
		            temp = temp.next;
		        }
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        int N = sc.nextInt();
		        int K = sc.nextInt();

		        if (N == 0) return;

		        Node head = new Node(sc.nextInt());
		        Node tail = head;
		        for (int i = 1; i < N; i++) {
		            tail.next = new Node(sc.nextInt());
		            tail = tail.next;
		        }

		        head = reverseKGroup(head, K);
		        printList(head);
		    }
		}
		
	}

