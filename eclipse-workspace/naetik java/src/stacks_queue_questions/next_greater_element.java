package stacks_queue_questions;

import java.util.Stack;

public class next_greater_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 11, 9, 7, 13, 5 };
		nextgreater(arr);

	}

	public static void nextgreater(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + "-->" + ans[i]);
		}

	}

}
