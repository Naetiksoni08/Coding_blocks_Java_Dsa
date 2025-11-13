package blind_45_days_sheet;

import java.util.*;

public class maximum_score_of_a_good_subarray {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 7, 4, 5 };
		int k = 3;
		System.out.println(maximum_socre(arr, k));

	}

	public static int maximum_socre(int[] arr, int k) {
		int n = arr.length;
		Stack<Integer> st = new Stack<>();
		int[] nse = new int[n];
		int[] pse = new int[n];
		for (int i = 0; i < n; i++) {
			while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
				st.pop();

			}
			if (st.isEmpty()) {
				pse[i] = -1;
			} else {
				pse[i] = st.peek();
			}

			st.push(i);
		}
		st.clear();
		Arrays.fill(nse, n);
		for (int i = 0; i < n; i++) {
			while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
				nse[st.pop()] = i;
			}
			st.push(i);

		}
		int score = 0;
		for (int i = 0; i < n; i++) {
			int left = pse[i] + 1;
			int right = nse[i] - 1;

			if (left <= k && k <= right) {
				int len = right - left + 1;
				score = Math.max(score, arr[i] * len);
			}

		}
		return score;

	}

}
