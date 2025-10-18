package blind_45_days_sheet;

import java.util.*;

public class Generate_parenthesis_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
//		Generate_parenthesis(n, 0, 0, "");
		List<String> ll = new ArrayList<>();
		Generate_parenthesis1(n, 0, 0, "",ll);
		System.out.println(ll);

	}

	public static void Generate_parenthesis(int n, int open, int close, String ans) {
		if (open == n && close == n) {
			System.out.print(ans + " ");

		}
		if (open < n) {
			Generate_parenthesis(n, open + 1, close, ans + '(');
		}
		if (close < open) {
			Generate_parenthesis(n, open, close + 1, ans + ')');
		}
	}

	public static void Generate_parenthesis1(int n, int open, int close, String ans,List<String> ll) {
		if (open == n && close == n) {
			ll.add(ans);

		}
		if (open < n) {
			Generate_parenthesis1(n, open + 1, close, ans + '(',ll);
		}
		if (close < open) {
			Generate_parenthesis1(n, open, close + 1, ans + ')',ll);
		}
	}

}
