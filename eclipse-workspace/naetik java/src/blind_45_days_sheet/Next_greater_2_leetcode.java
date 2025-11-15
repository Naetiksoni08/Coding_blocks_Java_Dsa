package blind_45_days_sheet;

import java.util.*;

public class Next_greater_2_leetcode {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 3 };
		int[] result = nextgreater(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

	public static int[] nextgreater(int[] arr) {
		int[] ans = new int[arr.length];
		Arrays.fill(ans, -1);
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < 2 * arr.length; i++) { // into 2 times we will loop on the same array
			int idx = i % arr.length; // basically for second round
			while (!st.isEmpty() && arr[idx] > arr[st.peek()]) {
				ans[st.pop()] = arr[idx];
			}

			if(i<arr.length) {
				st.push(idx);
			}
			
		}
		return ans;
	}

}

//we are running loop till 2 * n because it is posisble that for the first time we dont get the next greater for each no
