package blind_45_days_sheet;

import java.util.PriorityQueue;

public class kth_largest_element_in_the_array {

	class Solution {
		public void kthlarget(int []nums,int k) {
			PriorityQueue<Integer> pq = new PriorityQueue<>(); // we used min heap to find the kth largest tc n*logk
			for (int i = 0; i < k; i++) {
				pq.add(nums[i]);
			}
			for (int i = k; i < nums.length; i++) {
				if (pq.peek() < nums[i]) {
					pq.remove();
					pq.add(nums[i]);
				}
			}
			System.out.println(pq.peek());

		}
	}

}
