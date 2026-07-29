package blind_45_days_sheet;

public class rotate_list_striver {

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
		public ListNode rotateRight(ListNode head, int k) {
			return rotateList(head, k);

		}

		private ListNode rotateList(ListNode head, int k) {
			if (head == null || head.next == null || k == 0) {
				return head;
			}
			ListNode curr = head;
			int n = 1;
			while (curr.next != null) {
				curr = curr.next;
				n++;
			}

			curr.next = head;

			k = k % n;
			ListNode newTail = head;
			for (int i = 0; i < n - k-1; i++) {
				newTail = newTail.next;
			}
			ListNode newHead = newTail.next;
			newTail.next = null;
			return newHead;
		}

	}

}
