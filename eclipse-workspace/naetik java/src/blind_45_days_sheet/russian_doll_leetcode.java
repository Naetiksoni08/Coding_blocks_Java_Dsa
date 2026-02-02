package blind_45_days_sheet;

import java.util.*;

public class russian_doll_leetcode {
	public static void main(String[] args) {
		int[][] envelops = { { 5, 4 }, { 6, 4 }, { 6, 7 }, { 2, 3 } };
		int[][] dp = new int[envelops.length][envelops.length + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		Arrays.sort(envelops, new Comparator<>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) { // if width is same then height will be sorted in descending order
					return o2[1] - o1[1];
				}
				return o1[0] - o2[0]; // otherwise width in ascending order
			}
		});
		System.out.println(russian(envelops, 0, -1, dp));

	}

	public static int russian(int[][] envelops, int idx, int previdx, int[][] dp) {
		if (idx == envelops.length) {
			return 0;
		}
		if (dp[idx][previdx + 1] != -1) {
			return dp[idx][previdx + 1];
		}

		int nopick = russian(envelops, idx + 1, previdx, dp);
		int pick = 0;
		if (previdx == -1 || envelops[idx][1] > envelops[previdx][1]) { // if height of current idx is greater than
																		// height of previdx
			pick = 1 + russian(envelops, idx + 1, idx, dp);

		}
		return dp[idx][previdx + 1] = Math.max(pick, nopick);

	}
// tc O(n log n) + O(2ⁿ)
//	≈ O(2ⁿ)   n log n for sortinga and O(2n) --> 2 calls pick or no pick and n for heights 
}

//Ek envelope doosre ke andar tabhi jayega jab: w1 < w2  AND  h1 < h2 Width ko ASCENDING kyun sort kiya?
//Soch real life me envelopes line me rakh rahe ho.
//Agar bada width wala pehle aa gaya:
//	[10,10], [2,3], [5,4]
//	Toh jo chhote envelopes baad me hain
//	wo andar ja hi nahi sakte.
//	Isliye hum bolte hain:
// chhote width pehle, bade width baad me
//
