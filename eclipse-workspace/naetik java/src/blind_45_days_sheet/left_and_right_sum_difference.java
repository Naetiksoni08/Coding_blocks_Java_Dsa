package blind_45_days_sheet;

public class left_and_right_sum_difference {

	public static void main(String[] args) {
		int[] arr = { 10, 4, 8, 3 };
		int n = arr.length;
		int[] result = new int[n];
		int[] leftsum = new int[n];
		int[] rightsum = new int[n];
		leftsum[0] = 0;
		for (int i = 1; i < n; i++) {
			leftsum[i] = leftsum[i - 1] + arr[i - 1];
		}

		rightsum[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--) {
			rightsum[i] = rightsum[i + 1] + arr[i + 1];
		}

		for (int i = 0; i < n; i++) {
			result[i] = Math.abs(leftsum[i] - rightsum[i]);
		}

		System.out.println(result);
	}

}


//nums = [10, 4, 8, 3]
//
//leftSum:
//  i=0 → 0
//  i=1 → leftSum[0] + nums[0] = 0+10 = 10
//  i=2 → leftSum[1] + nums[1] = 10+4 = 14
//  i=3 → leftSum[2] + nums[2] = 14+8 = 22
//  leftSum = [0, 10, 14, 22] ✓
//
//rightSum:
//  i=3 → 0
//  i=2 → rightSum[3] + nums[3] = 0+3  = 3
//  i=1 → rightSum[2] + nums[2] = 3+8  = 11
//  i=0 → rightSum[1] + nums[1] = 11+4 = 15
//  rightSum = [15, 11, 3, 0] ✓
//
//answer:
//  i=0 → |0  - 15| = 15
//  i=1 → |10 - 11| = 1
//  i=2 → |14 - 3|  = 11
//  i=3 → |22 - 0|  = 22
//  answer = [15, 1, 11, 22] ✓
