package blind_45_days_sheet;

import java.util.*;

import java.util.Arrays;

public class merge_interval {

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

		Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // sort on the basis of interval chota interval aage bada piche
														// jaise 1,4 4,7

		List<int[]> result = new ArrayList<>();
		int[] current = intervals[0];
		for (int i = 1; i < intervals.length; i++) {
			int[] next = intervals[i];
			if (next[0] <= current[1]) { // ex - 1,3(current) and 2,6(next) so kya 2<=3 if yes then merge
				current[1] = Math.max(next[1], current[1]); // 3,6 ka max current ke 1 par mtlb 1,6 final ban gaya
			} else { // if 2<=3
				result.add(current); // add 1,3 or 1,6
				current = next; // current bana 2,6
			}
		}
		result.add(current); // last jab aage compare karne ke liye koi nai hoga toh simply current ko add
								// kardo result mai current = [15,18] End: [15,18] save karo

//		 return result.toArray(new int[result.size()][]);

	} // sort ka O(n log n) fir loop ka n so n log n tc hui 
	// worst case mai sc hui o(n) // koi bhi interval merge nai hua tab 

}
