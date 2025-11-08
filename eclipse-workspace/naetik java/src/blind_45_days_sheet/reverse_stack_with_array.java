package blind_45_days_sheet;

import java.util.*;

public class reverse_stack_with_array {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		reverse(arr);

	}

	public static void reverse(int[] arr) {
		Stack<Integer> st = new Stack<>();
		for (int i = arr.length-1; i >= 0; i--) {
			st.push(arr[i]);
		}
		while (!st.isEmpty()) {
			System.out.print(st.pop()+" ");

		}
	}

}
