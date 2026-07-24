package blind_45_days_sheet;

public class reverse_linked_list_striver {

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
		public ListNode reverseList(ListNode head) {
			return reverselist(head);
		}

		private ListNode reverselist(ListNode head) {
			ListNode prev = null;
			ListNode curr = head;
			while (curr != null) {
				ListNode next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			return prev;
		}
	}
}
