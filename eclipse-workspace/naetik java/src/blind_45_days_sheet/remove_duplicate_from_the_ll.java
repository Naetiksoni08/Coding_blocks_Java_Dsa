package blind_45_days_sheet;

public class remove_duplicate_from_the_ll {

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
		public ListNode deleteDuplicates(ListNode head) {
			ListNode temp = head;
			while (temp != null) {
				if (temp.next != null && temp.val == temp.next.val) {
					temp.next = temp.next.next;
				}else {
					temp = temp.next;
				}

			}
			return head;

		}

	}

}
