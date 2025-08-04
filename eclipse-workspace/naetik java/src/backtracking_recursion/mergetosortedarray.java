package backtracking_recursion;

import java.util.Arrays;

public class mergetosortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 3, 5, 7, 8 };
		int[] arr2 = { 1, 3, 5, 8, 9, 11, 13 };
		int[] ans  = Merge(arr1,arr2);
		System.out.println(Arrays.toString(ans));
//		for(int i=0; i<ans.length; i++) {
//			System.out.println(ans[i]+" ");
//		}

	}

	public static int[] Merge(int[] arr1, int[] arr2) {
		int n = arr1.length, m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0, j = 0, k = 0;
		while(i<n && j<m) {
			if(arr1[i] <arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
				
			}else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			ans[k] = arr1[i];
			i++;
			k++;
			
		}
		while(j<m) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}

}
// agar hum direct call kardenge toh address dega kyuki int []  likha h humne 
