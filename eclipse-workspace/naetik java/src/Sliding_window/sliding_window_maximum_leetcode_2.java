package Sliding_window;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class sliding_window_maximum_leetcode_2 {

	public static void main(String[] args) {

		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		System.out.println(maxsliding(arr, k));

	}

	public static int[] maxsliding(int[] arr, int k) {
		int n = arr.length;
		int[] max_val = new int[n - k + 1];
		Deque<Integer> ll = new LinkedList<>();
		// first window
		for (int i = 0; i < k; i++) {
			while (!ll.isEmpty() && arr[ll.getLast()] < arr[i]) {
				ll.removeLast();
			}
			ll.add(i);

		}
		int j = 0;
		max_val[j++] = arr[ll.getFirst()];
		for (int i = k; i < arr.length; i++) {
			// grow
			while (!ll.isEmpty() && arr[ll.getLast()] < arr[i]) {
				ll.removeLast();
			}
			ll.add(i);

			// shrink
			if (ll.getFirst() == i - k) {
				ll.removeFirst();
			}
			// answer update
			max_val[j++] = arr[ll.getFirst()];

		}
		return max_val;

	}

}
