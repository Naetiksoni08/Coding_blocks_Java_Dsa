package blind_45_days_sheet;

public class palindrome_linked_list_striver {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public boolean isPalindrome(ListNode head) {
			return palindrome(head);

		}

		private boolean palindrome(ListNode head) {
			if (head == null || head.next == null) {
				return true;
			}
			// find middle point
			ListNode slow = head;
			ListNode fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}

			// slow hoga first half ke last element 2 par aur

			// reverse logic
			ListNode prev = null;
			ListNode curr = slow; // yani 2

			while (curr != null) {
				ListNode next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			// now compare first half and second half if both are equal then true it is a
			// palindrome
			ListNode first = head;
			ListNode second = prev;
			while (second != null) {
				if (first.val != second.val) {
					return false;
				}
				first = first.next;
				second = second.next;
			}
			return true;
		}
	}

}
