package blind_45_days_sheet;

import java.util.*;

public class maximum_sum_of_3_digit_divisible_by_three {

	class Solution {
		public int maximumSum(int[] nums) {
			int[] arr = nums;

			ArrayList<Integer> r0 = new ArrayList<>();
			ArrayList<Integer> r1 = new ArrayList<>();
			ArrayList<Integer> r2 = new ArrayList<>();

			for (int x : arr) {
				if (x % 3 == 0) {
					r0.add(x);
				} else if (x % 3 == 1) {
					r1.add(x);
				} else {
					r2.add(x);
				}

			}
			Collections.sort(r0, Collections.reverseOrder());
			Collections.sort(r1, Collections.reverseOrder());
			Collections.sort(r2, Collections.reverseOrder());

			int ans = 0;
			if (r0.size() >= 3) {
				ans = Math.max(ans, r0.get(0) + r1.get(1) + r2.get(2));
			}
			if (r1.size() >= 3) {
				ans = Math.max(ans, r0.get(0) + r1.get(1) + r2.get(2));
			}
			if (r2.size() >= 3) {
				ans = Math.max(ans, r0.get(0) + r1.get(1) + r2.get(2));
			}
			if (r0.size() >= 1 && r1.size() >= 1 && r2.size() >= 1)
				ans = Math.max(ans, r0.get(0) + r1.get(0) + r2.get(0));
			
			return ans;
		}

	}

}
