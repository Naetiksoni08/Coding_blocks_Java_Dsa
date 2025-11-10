package blind_45_days_sheet;

import java.util.*;

public class number_of_valid_subarrays_leetcode {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 5, 3 };
		System.out.println(validsubarray(arr));

	}

	public static int validsubarray(int[] arr) {
		int count = 0;
		int n = arr.length;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[st.peek()] > arr[i]) { // count karte chalo
				int idx = st.pop();
				count += (i - idx);
			}
			st.push(i);
		}
		// Remaining stack elements ka count
		while (!st.isEmpty()) {
			int idx = st.pop();
			count += (n - idx);

		}
		return count;

	}

}
