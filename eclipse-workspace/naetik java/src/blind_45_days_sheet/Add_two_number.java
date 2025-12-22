package blind_45_days_sheet;

public class Add_two_number {

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
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			int carry = 0;
			ListNode dummy = new ListNode(0);
			ListNode curr = dummy;
			while (l1 != null || l2 != null || carry != 0) {
				int sum = carry;
				if (l1 != null) {
					sum += l1.val;
					l1 = l1.next;
				}
				if (l2 != null) {
					sum += l2.val;
					l2 = l2.next;
				}
				carry = sum / 10; // Agar sum 10 ya zyada → carry = 1 Agar sum < 10 → carry = 0 this is the
									// qoutient
				curr.next = new ListNode(sum % 10); // 7 % 10 = 7 this n
				curr = curr.next;

			}
			return dummy.next;

		}
	}

}
