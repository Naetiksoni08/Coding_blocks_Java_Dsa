package blind_45_days_sheet;

public class running_sum_of_1d_array {

	class Solution {
		public int[] runningSum(int[] nums) {
			int[] answer = new int[nums.length];
			int sum = 0;
			for (int i = 0; i < nums.length; i++) {
				sum = sum + nums[i];
				answer[i] = sum;
			}
			return answer;
		}
	}

}
