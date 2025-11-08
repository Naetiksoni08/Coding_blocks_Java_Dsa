package blind_45_days_sheet;

import java.util.*;

public class previous_next_element {
	public static void main(String[] args) {
		int[] arr = { 5, 11, 9, 7, 13, 3 };
		pne(arr);

	}

	public static void pne(int[] arr) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && st.peek() >= arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				System.out.print("-1 ");

			} else {
				System.out.print(st.peek() + " ");
			}
			st.push(arr[i]);
		}
		
	}

}




