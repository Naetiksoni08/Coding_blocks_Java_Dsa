package assignment_questions;

public class insertion_sorttt {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 6, 8, 2 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			insertlastelement(arr, i);

		}
	}

	public static void insertlastelement(int[] arr, int i) { // i is the index
		int item = arr[i];
		int j = i - 1;
		while (j >= 0 && arr[j] > item) {
			arr[j + 1] = arr[j];
			j--;

		}
		arr[j + 1] = item;
	}
	

}
