package blind_45_days_sheet;

import java.util.*;

public class Absolute_Difference_Between_Maximum_and_Minimum_K_Elements {

	class Solution {
		public int absDifference(int[] arr, int k) {
			Arrays.sort(arr);
			int maxsum = 0;
			int minsum = 0;
			int n = arr.length;
			for (int i = 0; i < k; i++) {
				minsum += arr[i];
				maxsum += arr[n - 1 - i];
			}
			return Math.abs(maxsum - minsum);

		}
	} 

} // n log n for sorting and n for the loop so we have nlogn+n = nlogn cuz we keep the dominant term 
