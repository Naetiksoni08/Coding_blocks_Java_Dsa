package assignment_questions;
import java.util.Scanner;

public class cycle {
    
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Method to insert nodes in the linked list
    public ListNode createLinkedList(int n, Scanner scanner) {
        if (n == 0) return null;

      
        ListNode head = new ListNode(scanner.nextInt());
        ListNode temp = head;

        for (int i = 2; i <= n; i++) {
            ListNode newNode = new ListNode(scanner.nextInt());
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    // Method to display the linked list
    public void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.print(" -> ");
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cycle cycleDetection = new cycle();

        int n = scanner.nextInt();

        ListNode head = cycleDetection.createLinkedList(n, scanner);
        cycleDetection.display(head);

        scanner.close();
    }
}

