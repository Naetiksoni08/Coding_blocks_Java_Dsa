package oops;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIIDIDDD";
		System.out.println(Construct_Smallest(s));

	}

	public static String Construct_Smallest(String s) {
		int n = s.length();
		int[] ans = new int[n + 1];
		Stack<Integer> st = new Stack<>();
		int count = 1;
		for (int i = 0; i <= n; i++) {
			if (i == n || s.charAt(i) == 'I') { // s.charAt(i) == 'I'||i == n we can not interchange these conditions
												// because first it should check whether the index is within the range
												// or not if it is not in the range then it will not run because we are
												// using or operator
				ans[i] = count;
				count++;
				while (!st.isEmpty()) { // this will give false initially because it is not empty then the not operator
										// will reverse it in true
					ans[st.pop()] = count;
					count++;

				}

			} else {
				st.push(i);
			}
		}
		String str = "";
		for (int v : ans) { // this is another way to write a for loop it simply means that loop is starting
							// from a variable v that we have declared just inside the loop then it goes
							// till answer thats it
			str = str + v;
		}
		return str;

	}

}
