package blind_45_days_sheet;

import java.util.Arrays;

public class find_first_and_last_position_of_the_element_in_the_sorted_array {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] result = new int[] { firstOccurrence(arr, target), lastOccurrence(arr, target) };
		System.out.println(Arrays.toString(result));

	}

	public static int firstOccurrence(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				ans = mid;
				high = mid - 1;

			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	public static int lastOccurrence(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				ans = mid;
				low = mid + 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}
	// tc will be 2 * log n = O(log n)
	
}
