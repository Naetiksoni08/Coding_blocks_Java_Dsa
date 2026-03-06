package blind_45_days_sheet;

import java.util.Arrays;

public class threesum_closest {
	public static int main(String[] args) {
		int[] arr = { -1, 2, 1, -4 };
		int target = 1;
		int closestSum = arr[0] + arr[1] + arr[2];
		Arrays.sort(arr); // n log n
		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			int left = i + 1;
			int right = arr.length - 1;
			while (left < right) {
				int sum = arr[i] + arr[left] + arr[right];
				if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
					closestSum = sum;
				}
				if (sum < target)
					left++;
				else if (sum > target)
					right--;
//					else return sum;

			}

		}
		return closestSum;
	}

}
