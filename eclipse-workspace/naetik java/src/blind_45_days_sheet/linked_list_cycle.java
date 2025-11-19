package blind_45_days_sheet;

public class linked_list_cycle {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public boolean hasCycle(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while(fast!=null && fast.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
				if(slow==fast) {
					return true;
				}
			}
			return false;

		}
		//if the last node is null then the linked list is singly 
	} // if last node address is in the first node address then the linked list is circular
	//if the last node address is in any node then that means the linked list has cycle 
	

}
