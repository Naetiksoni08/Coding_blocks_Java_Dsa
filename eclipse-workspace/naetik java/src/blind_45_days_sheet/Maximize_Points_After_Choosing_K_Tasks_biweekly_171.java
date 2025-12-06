package blind_45_days_sheet;

import java.util.Arrays;

public class Maximize_Points_After_Choosing_K_Tasks_biweekly_171 {

	class Solution {
		public long maxPoints(int[] technique1, int[] technique2, int k) {
			int[][] ans = new int[technique1.length][3];
			int n = technique1.length;
			for (int i = 0; i < n; i++) {
				ans[i][0] = technique1[i];
				ans[i][1] = technique2[i];
				ans[i][2] = technique1[i] - technique2[i];

			}
			Arrays.sort(ans, (a, b) -> b[2] - a[2]);

			long total = 0;

			for (int i = 0; i < k; i++) {
				total += ans[i][0];

			}
			for (int i = k; i < n; i++) {
	            if (ans[i][0] >= ans[i][1]) {
	                total += ans[i][0];
	            } else {
	                total += ans[i][1];
	            }
	        }
			return total;

		}
	}

}
