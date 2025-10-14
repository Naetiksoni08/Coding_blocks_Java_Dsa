package assignment_questions;

public class Quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 5, 1, 4, 3 };
		sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int idx = partition(arr, si, ei);
		sort(arr, si, idx - 1);
		sort(arr, idx + 1, ei);
	}

	public static int partition(int[] arr, int si, int ei) {
		int pivot = arr[ei]; // last element is the pivot
		int idx = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] < pivot) {
				int temp = arr[i]; //swap arr[i],arr[idx] 
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;

			}

		}
		int temp = arr[ei];//swap arr[ei],arr[idx] 
		arr[ei] = arr[idx];
		arr[idx] = temp;
		return idx;
	}

}
