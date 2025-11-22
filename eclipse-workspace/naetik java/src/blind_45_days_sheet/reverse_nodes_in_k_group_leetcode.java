package blind_45_days_sheet;

public class reverse_nodes_in_k_group_leetcode {

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
			public ListNode reverseKGroup(ListNode head, int k) {
				if (head == null) {
					return head;
				}
				ListNode temp = head;
				int count = 0;
				while (temp != null && count < k) {
					temp = temp.next;
					count++;
				}

				if (count < k) {
					return head;
				}

				ListNode newHead = reverse(head,null, k);

				head.next = reverseKGroup(temp, k);
				return newHead;

			}

			public ListNode reverse(ListNode curr, ListNode prev, int k) {
				if (k == 0 || curr == null) {
					return prev;
				}
				ListNode next = curr.next;
				curr.next = prev;
				return reverse(next, curr, k - 1);
			}

		}
	}

}
