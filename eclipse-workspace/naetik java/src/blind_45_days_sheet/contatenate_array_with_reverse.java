package blind_45_days_sheet;

import java.util.*;

public class contatenate_array_with_reverse {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int n = arr.length;
		int[] ans = new int[2 * n];
		for (int i = 0; i < n; i++) {
			ans[i] = arr[i];
		}
		for (int i = 0; i < n; i++) {
			ans[i + n] = arr[n - i - 1];
		}
		 System.out.println(Arrays.toString(ans)); 
	}

}
