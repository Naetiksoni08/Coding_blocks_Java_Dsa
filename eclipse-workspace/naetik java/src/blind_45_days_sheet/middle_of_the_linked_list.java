package blind_45_days_sheet;

public class middle_of_the_linked_list {

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
	}// with counting the no of nodes

	class Solution {
		public ListNode middleNode(ListNode head) {
			int size = 0;
			ListNode temp = head;
			
			while (temp != null) {
				size++;
				temp = temp.next;
			}
			temp = head;
			for (int i = 0; i < size / 2; i++) {
				temp = temp.next;

				
			}
			return temp;

		}
	}
}
