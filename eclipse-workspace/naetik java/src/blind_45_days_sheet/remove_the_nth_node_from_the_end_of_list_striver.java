package blind_45_days_sheet;

public class remove_the_nth_node_from_the_end_of_list_striver {

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
		public ListNode removeNthFromEnd(ListNode head, int n) {
			return removenth(head, n);
		}

		private ListNode removenth(ListNode head, int n) {
			ListNode dummy = new ListNode();
			dummy.next = head;
			ListNode slow = dummy;
			ListNode fast = dummy;

			for (int i = 0; i <= n; i++) {
				fast = fast.next;
			}
			while (fast != null) {
				fast = fast.next;
				slow = slow.next;
			}
			slow.next = slow.next.next;
			return dummy.next;
		}
	}

}

//
//WITHOUT DUMMY (head delete karna hai):
//
//	  1 → 2 → 3 → null
//	  ↑
//	 head (delete!)
//
//	 head = head.next? → head = 2 ✅
//	 But what if we need to return from a function?
//	 We lost reference to 1! ❌
//
//
//	WITH DUMMY:
//
//	  dummy → 1 → 2 → 3 → null
//	  ↑       ↑
//	 dummy   head
//
//	  // Delete 1:
//	  dummy.next = dummy.next.next
//	  // dummy.next = 2
//
//	  dummy → 2 → 3 → null
//	  ↑
//	 dummy
//
//	  return dummy.next → 2 ✅
//	  Reference saved! 
// dummy laga hu hai head sai phele so agar mai dummy.next karunga toh head yano 1 ka address milega 

//
//dummy → 1 → 2 → 3 → 4 → 5 → null
//↑       ↑
//dummy  head (same node 1)
//
//// dummy.next = head (yaani 1 ka address)
//// dummy.next.next = 2 ka address
//// dummy.value = 0 (kuch bhi, doesn't matter)