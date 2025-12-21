package blind_45_days_sheet;

public class minimum_deletion_cost_to_make_all_the_characters_equal {
	class Solution {
		public long minCost(String s, int[] cost) {
			long totalsum = 0;
			for (int x : cost) {
				totalsum += x;
			}
			long[] arr = new long[26];
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				arr[ch - 'a'] += cost[i];
			}
			long max = 0;
			for (int i = 0; i < 26; i++) {
				max = Math.max(max, arr[i]);

			}
			return totalsum - max;

		}
	}

}
