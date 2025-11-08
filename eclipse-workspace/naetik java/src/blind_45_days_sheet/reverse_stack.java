package blind_45_days_sheet;

import java.util.*;

public class reverse_stack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);

		System.out.println("Original Stack: " + st);
		reverse(st);
		System.out.println("Reversed Stack: " + st);

	}

	public static void insertatbottom(Stack<Integer> st, int val) {
		if (st.isEmpty()) {
			st.push(val);
			return;
		}
		int rv = st.pop();
		insertatbottom(st, val);
		st.push(rv);

	}

	public static void reverse(Stack<Integer> st) {
		if (st.isEmpty()) {
			return;
		}
		int rv = st.pop();
		reverse(st); // pop out all the element
		insertatbottom(st, rv);

	}

}
