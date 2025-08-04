package backtracking_recursion;

import java.util.Arrays;
import java.util.Random;

public class randomized_quick_sort {

	public static void main(String[] args) {

		int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	public static void sort(int[] arr, int si, int ei) {
		if (si >= ei) { // si greater than end point
			return;
		}

		int idx = partition(arr, si, ei);
		sort(arr, si, idx - 1);
		sort(arr, idx + 1, ei);
	}

	public static int partition(int[] arr, int si, int ei) {
		// generate random index
		Random rn = new Random(); 
		int li = rn.nextInt(ei-si)+si;
		int tt = arr[li];
		arr[li] = arr[ei];
		arr[ei] = tt;
		int val = arr[ei], idx = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] < val) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;
		return idx; // position of 4 index number
	}

}
