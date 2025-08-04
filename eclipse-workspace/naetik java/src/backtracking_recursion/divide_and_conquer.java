package backtracking_recursion;

import java.util.Arrays;

public class divide_and_conquer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// merge sort
		int[] arr = { 7, 3, 1, 5, 2 };
		int[] ans = sort(arr, 0, arr.length - 1); // this how you call a array function
		System.out.println(Arrays.toString(ans));
// for loop bhi laga sakta hai aur fir syso kardio
		// space complex = big o of n  coz we have taken a new array 
	}

	public static int[] sort(int[] arr, int si, int ei) {
		if (si == ei) {
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;

		}
		int mid = (si + ei) / 2;
		int[] arr1 = sort(arr, si, mid);
		int[] arr2 = sort(arr, mid + 1, ei);
		return Merge(arr1 , arr2); // 

	}

	public static int[] Merge(int[] arr1, int[] arr2) {
		int n = arr1.length, m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;

			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			ans[k] = arr1[i];
			i++;
			k++;

		}
		while (j < m) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}

}
