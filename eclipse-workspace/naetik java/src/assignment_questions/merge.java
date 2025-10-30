package assignment_questions;

public class merge {
	public static void main(String[] args) {
		int[] arr = { 7, 5, 1, 4, 3 };
		int []result = sort(arr, 0, arr.length - 1);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] sort(int[] arr, int si, int ei) {
		if (si == ei) {
			int[] newarr = new int[1];
			newarr[0] = arr[si];
			return newarr;
		}
		int mid = (si + ei) / 2;
		int[] firstarr = sort(arr, si, mid);
		int[] secondarr = sort(arr, mid + 1, ei);
		return merge(firstarr, secondarr);
	}

	public static int[] merge(int[] arr1, int[] arr2) {
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
		
		}
		
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
