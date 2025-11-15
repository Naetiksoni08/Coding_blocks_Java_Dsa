package blind_45_days_sheet;

public class reverse_linked_list {

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
			return reverse(head, null);

		}

		public ListNode reverse(ListNode curr, ListNode prev) {
			if (curr == null) {
				return prev;

			}
			ListNode temp = reverse(curr.next, curr);// curr becomes curr.next and prev becomes curr
			curr.next = prev;
			return temp;

		}
	}

}
