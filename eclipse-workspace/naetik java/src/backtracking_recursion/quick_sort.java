package backtracking_recursion;

import java.util.Arrays;

public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
// arrays . sort  = n log n 
// best case and average case of quick sort is n log n and worst is the n^2 kab hota hai worst case?
// agar hum last data ko solve kar rahe hai partition mai toh aagr sara data left ya right mai chale jaye toh worst case agar  theek karana ho toh we will use randomized quick sort 
// merge sort ki average best and worst is n log n and teeno mai space complexity order of n 
