package blind_45_days_sheet;

import java.util.Arrays;

public class Kth_smallest_product_of_two_sorted_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 5 };
		int[] arr2 = { 3, 4 };
		int k = 2;

	}

	public static long smallestproduct(int[] arr1, int[] arr2, int k) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		long low = Math.min(Math.min((long) arr1[0] * arr2[0], (long) arr1[0] * arr2[arr2.length - 1]),
				Math.min((long) arr1[arr1.length - 1] * arr2[0], (long) arr1[arr1.length - 1] * arr2[arr2.length - 1]));

		long high = Math.max(Math.max((long) arr1[0] * arr2[0], (long) arr1[0] * arr2[arr2.length - 1]),
				Math.max((long) arr1[arr1.length - 1] * arr2[0], (long) arr1[arr1.length - 1] * arr2[arr2.length - 1]));

		while (low <= high) {
			long mid = low + (high - low) / 2;
			if (count(arr1, arr2, mid) >= k) {
				high = mid;
			} else {
				low = mid + 1;
			}

		}
		return low;

	}

	public static int count(int[] arr1, int[] arr2, long mid) {

		return 0;
	}

}
