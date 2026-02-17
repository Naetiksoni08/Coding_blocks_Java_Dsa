package blind_45_days_sheet;

public class house_robber_4 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 9 };
		int k = 2;
		System.out.println(houserobber(arr, k));
	}

	public static int houserobber(int[] arr, int k) {
		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			low = Math.min(low, arr[i]); // We needed a range in order to perform or apply binary search so that's where
											// we found out low and high indexes Which will be nothing but the array's
											// minimum index will be the minimum value, will be the low, and the highest
											// value will be the high
			high = Math.max(high, arr[i]);
		}
		while (low <= high) {
			int mid = (low + high) / 2;
			if (check(arr, mid, k)) { // Is robber able to rob the array houses with this much capability, that is,
										// the mid, and is he able to rob at least k houses
				high = mid - 1;// If with this much capability robber is able to rob at least K houses, then we
								// have to find the minimum number of capability that he can rob at least K
								// houses. Decrease the high

			} else {
				low = mid + 1;
			}

		}
		return low;// Finally we return low because this low is the minimum capability a robber
					// needs to rob K houses
	}

	public static boolean check(int[] arr, int mid, int k) {
		int count = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] <= mid) {
				count++;
				i = i + 2;// Why I plus two because we are in the question. It was clearly stated that we
							// can't rob or the robber cannot rob adjacent houses. That's why if he is able
							// to rob the Ieth house with this much capability, let's say five, then simply
							// reach the count and now he will not be able to rob the next house
			} else {
				i = i + 1;
			}
		}
		return count >= k; // if true that means we can rob k houses using this capability so do high =
							// mid-1 else low = mid+1 increase the capability
	}
}
