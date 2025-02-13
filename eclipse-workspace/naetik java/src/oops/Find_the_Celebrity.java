package oops;

import java.util.Stack;

public class Find_the_Celebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
		System.out.println(Celebrity(arr));

	}

	public static int Celebrity(int[][] arr) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			st.push(i); // making everyone celebrity

		}
		while (st.size() > 1) {
			int a = st.pop();
			int b = st.pop();
			if (arr[a][b] == 1) {
				st.push(b); // if a knows b then a gets eliminate because he does not full fill the
							// definition of celebrity and push b back in the stack
			} else {
				st.push(a);
			}
		}
		int candidate = st.pop(); // joh bacha hua number hai or candidate hai we will check for him if he is a
									// celebrity by searching his rows and columns if row mai kahi bhi 1 mila then
									// nai hoga otherwise hoga
		for (int i = 0; i < arr.length; i++) {
			if (i == candidate) { // if it is equal to 0
				continue; // skip

			}
			if (arr[candidate][i] == 1) { // kahi bhi 1 mila in row then he is not a celebrity
				return -1;
			}
			if (arr[i][candidate] == 0) { // column
				return 1;
			}
		}
		return candidate;
	}

}
