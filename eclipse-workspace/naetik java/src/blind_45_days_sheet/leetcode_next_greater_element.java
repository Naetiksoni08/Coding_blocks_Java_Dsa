package blind_45_days_sheet;

import java.util.*;

public class leetcode_next_greater_element {
	public static void main(String[] args) {
		int[] arr1 = { 4, 1, 2 };
		int[] arr2 = { 1, 3, 4, 2 };
		int[]result = nge(arr1, arr2);
		System.out.println(Arrays.toString(result));
	}

	public static int[] nge(int[] arr1, int[] arr2) {
		Stack<Integer> st = new Stack<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr2.length; i++) {
			while (!st.isEmpty() && arr2[i] > st.peek()) {
				map.put(st.pop(), arr2[i]);

			}
			st.push(arr2[i]);

		}
		while (!st.isEmpty()) {
			map.put(st.pop(), -1);
		}
		int[]ans= new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			ans[i] = map.get(arr1[i]);
		}
		return ans;

	}

}
