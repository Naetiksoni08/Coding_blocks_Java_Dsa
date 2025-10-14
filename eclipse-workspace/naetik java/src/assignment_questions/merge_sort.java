package assignment_questions;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 5, 1, 4, 3 };
		int[] result = sort(arr, 0, arr.length - 1);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

	public static int[] sort(int[] arr, int si, int ei) {
		// if si and ei gets equal then eventually there will be only 1 element left and
		// and single element is always sorted so if si == ei then make a new array of
		// size 1 and then 0th index par uss new array ke si or ei put kardo and then
		// return the array
		if (si == ei) {
			int[] newarray = new int[1];
			newarray[0] = arr[si]; // or arr[ei]
			return newarray;
		}

		int mid = (si + ei) / 2;
		int[] firstarr = sort(arr, si, mid);
		int[] secondarr = sort(arr, mid + 1, ei);
		return Merge(firstarr, secondarr);

	}

	public static int[] Merge(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] finalarr = new int[n + m];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				finalarr[k] = arr1[i];
				i++;
				k++;
			} else {
				finalarr[k] = arr2[j];
				j++;
				k++;
			}

		} // copy the remaining element that are left in either of arrays
		while (i < n) {
			finalarr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < m) {
			finalarr[k] = arr2[j];
			j++;
			k++;
		}
		return finalarr;
	}

}
