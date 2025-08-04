package Sliding_window;

import java.util.*;

public class sliding_window_maximum_leetcode {

	public static void main(String[] args) {
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		System.out.println(maxsliding(arr, k));

	}

	public static int[] maxsliding(int[] arr, int k) {
		int n = arr.length;
		int[] max_val = new int[n - k + 1];
		List<Integer> ll = new ArrayList<>();
		// first window
		for (int i = 0; i < k; i++) {
			while (!ll.isEmpty() && arr[ll.get(ll.size() - 1)] < arr[i]) {
				ll.remove(ll.size() - 1);
			}
			ll.add(i);

		}
		int j = 0;
		max_val[j++] = arr[ll.get(0)];
		for(int i = k; i<arr.length; i++) {
			//grow
			while (!ll.isEmpty() && arr[ll.get(ll.size() - 1)] < arr[i]) {
				ll.remove(ll.size() - 1);
			}
			ll.add(i);
			
			//shrink
			if(ll.get(0) == i-k) {
				ll.remove(0);
			}
			//answer update
			max_val[j++] = arr[ll.get(0)];
			
		
		}
		return max_val;

	}

}
