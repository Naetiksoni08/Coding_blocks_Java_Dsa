package blind_45_days_sheet;

public class linked_list_cycle_2_striver {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode detectCycle(ListNode head) {
			return detectcycle(head);

		}

		private ListNode detectcycle(ListNode head) {
			if (head == null || head.next == null) {
				return null;
			} // if there is only 1 element or no element in the list 
			ListNode slow = head;
			ListNode fast = head;
			// first detect whether cycle is there or not
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;

				if (slow == fast) { // meeting point ie cycle detected
					break;
				}
			}
			// if no cycle
			if (fast == null || fast.next == null) {
				return null;
			}
			// If slow and fast are not the same, that means they haven't met at a meeting
			// point. Then simply check if fast is null or fast.next is null. If that is
			// true then simply return null. That means there is no cycle and if there is no
			// cycle there is no point in checking or finding the element or the node from
			// which the cycle was started

			// find cycle start
			slow = head;
			while (slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}

			return slow; // cycle starting node
		}
	}
}
