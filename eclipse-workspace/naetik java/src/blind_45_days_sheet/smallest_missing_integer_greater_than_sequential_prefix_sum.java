package blind_45_days_sheet;

import java.util.*;

public class smallest_missing_integer_greater_than_sequential_prefix_sum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 5 };
		int n = arr.length;
		int endofprefix = 0;
		for (int i = 1; i < n; i++) { // Kya current element, previous element se exactly 1 bada hai?
			if (arr[i] == arr[i - 1] + 1) { // i = 1 = arr[1] = 2 == arr[1-1] = arr[0] = 1+1 = 2==1+1 if yes then
											// current element 2 can be the part of sequential prefix sequential prefix
											// ka simple meaning yeh hai ki joh current element hai voh previous sai ek
											// bada hona chhaiye mtlb 1 2 3 is cool
				endofprefix = i;
			} else {
				break;
			}

		}
		// sum of prefix from 0 to end of the prefix
		int sum = 0;
		for (int i = 0; i <= endofprefix; i++) {
			sum += arr[i];
		}

		HashSet<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}

		int num = sum;
		while (set.contains(num)) {
			num++;
		}
		System.out.println(num);

	}

}
