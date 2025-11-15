package blind_45_days_sheet;

import java.util.*;

public class sliding_window_maximum_leetcode {
	public static void main(String[] args) {
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int[] result = sliding_window(arr, k);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

	public static int[] sliding_window(int[] arr, int k) {
		int n = arr.length;
		Deque<Integer> ll = new LinkedList<>();
		int[] maxval = new int[n - k + 1];
		
		
		// first window
		for (int i = 0; i < k; i++) {
			while (!ll.isEmpty() && arr[ll.getLast()] < arr[i]) {
				ll.removeLast();
			}
			ll.add(i);

		}
		
		int j = 0;
		maxval[j++] = arr[ll.getFirst()];
		
		//remaining windows
		for (int i = k; i < n; i++) {
			//remove window (shrink)
			if (ll.getFirst() == i - k) {
				ll.removeFirst();
			}
			
			while (!ll.isEmpty() && arr[ll.getLast()] < arr[i]) {
				ll.removeLast();
			}
			ll.add(i);

			// ans
			maxval[j++] = arr[ll.getFirst()];

		}
		return maxval;

	}

}
