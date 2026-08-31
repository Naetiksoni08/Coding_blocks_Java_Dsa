package blind_45_days_sheet;

import java.util.*;

public class find_the_minimum_and_maximum_number_of_nodes_between_critical_points {

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
		public int[] nodesBetweenCriticalPoints(ListNode head) {
			return CriticalPoints(head);

		}

		public int[] CriticalPoints(ListNode head) {
			ListNode prev = head;
			ListNode curr = head.next;
			int idx = 1;
			List<Integer> positions = new ArrayList<>();
			while (curr.next != null) {
				if (curr.val > prev.val && curr.val > curr.next.val
						|| curr.val < prev.val && curr.val < curr.next.val) { // local maxima || local minima
					positions.add(idx);
				}
				prev = curr;
				curr = curr.next;
				idx++;
			}

			if (positions.size() < 2) { 
				return new int[] { -1, -1 };
			}
			int maxdistance = positions.get(positions.size() - 1) - positions.get(0); // maxdistance will always be
																						// first and last element ka
																						// diff
			int mindistance = Integer.MAX_VALUE;
			for (int i = 1; i < positions.size(); i++) {
				mindistance = Math.min(mindistance, positions.get(i) - positions.get(i - 1));

			}

			return new int[] { mindistance, maxdistance };

		}

	}

}
