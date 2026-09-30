package blind_45_days_sheet;

public class Maximum_twin_sum_of_linked_list {

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
		public int pairSum(ListNode head) {
			return sum(head);
		}

		private int sum(ListNode head) {
			// find middle index
			ListNode slow = head;
			ListNode fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			ListNode prev = null, curr = slow; // curr = 2 prev = null // 2->1
			while (curr != null) {
				ListNode next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			int max = 0;
			ListNode p1 = head, p2 = prev; // 5 and 1
			while (p2 != null) {
				max = Math.max(max, p1.val + p2.val);
				p1 = p1.next;
				p2 = p2.next;
			}

			return max;
		}
	}

}
