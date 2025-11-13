package assignment_questions;

import java.util.*;

public class construct_from_di_string {
	public static void main(String[] args) {
		String str = "IIIDIDDD";
		System.out.println(di(str));

	}

	public static String di(String str) {
		int n = str.length();
		int count = 1;
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[n + 1];
		
		for (int i = 0; i <= n; i++) {
			
			// when can we fill the count
			if (i == n || str.charAt(i) == 'I') {
				ans[i] = count;
				count++;

				// work for dth character
				while (!st.isEmpty()) {
					ans[st.pop()] = count;
					count++;
				}

			} else {
				st.push(i); // if dth character we found
			}

		}
		StringBuilder sb = new StringBuilder();
		for(int num : ans) {
			sb.append(num);
			
		}
		return sb.toString();

	}

}
