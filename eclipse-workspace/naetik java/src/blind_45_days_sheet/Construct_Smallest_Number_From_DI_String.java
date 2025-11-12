package blind_45_days_sheet;

import java.util.*;

public class Construct_Smallest_Number_From_DI_String {
	public static void main(String[] args) {
		String str = "IIIDIDDD";
		System.out.println(smallestno(str));

	}

	public static String smallestno(String str) {
		int n = str.length();
		int count = 1;
		int[] ans = new int[ n + 1];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i <=n; i++) {
			if (i == n || str.charAt(i) == 'I') {
				ans[i] = count;
				count++;
				while (!st.isEmpty()) {
					ans[st.pop()] = count;
					count++;
				}
			

			} else {
				st.push(i);
			}
		}
		String s = "";
		for (int i = 0; i < ans.length; i++) {
			s += ans[i];
		}
		return s;
	}

}
