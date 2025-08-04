package recursion_backtracking_bitmasking_practice;

public class single_num_bitmasking {

	public static void main(String[] args) {
		int[] nums = { 4, 1, 2, 1, 2 };
		System.out.println(number(nums));

	}

	public static int number(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result = result ^ nums[i];
		}
		return result;

	}
}
