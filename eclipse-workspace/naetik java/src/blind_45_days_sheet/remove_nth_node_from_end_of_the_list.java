package blind_45_days_sheet;

public class remove_nth_node_from_end_of_the_list {
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

		class Solution {
			public ListNode removeNthFromEnd(ListNode head, int n) {
				ListNode dummy = new ListNode(0);
				dummy.next = head;

				ListNode slow = dummy;
				ListNode fast = dummy;

				for (int i = 0; i <= n; i++) {
					fast = fast.next;
				}

				while (fast != null) { // after moving fast n time ahead now move both parallely
					fast = fast.next;
					slow = slow.next;
				}
				slow.next = slow.next.next;
				return dummy.next;

			}

		}

	}
}