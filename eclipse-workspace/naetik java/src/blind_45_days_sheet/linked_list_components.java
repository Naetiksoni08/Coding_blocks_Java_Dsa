package blind_45_days_sheet;

import java.util.*;

public class linked_list_components {
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
			public int numComponents(ListNode head, int[] nums) {
				Set<Integer> s = new HashSet<>();
				for (int n : nums) {
					s.add(n);
				}
				int count = 0;
				ListNode temp = head;
				while (temp != null) {
					if (s.contains(temp.val)) {
						if (temp.next == null || !s.contains(temp.next.val)) {
							count++;
						}
					}
					temp = temp.next;
				}
				return count;

			}
		}
	}

}
