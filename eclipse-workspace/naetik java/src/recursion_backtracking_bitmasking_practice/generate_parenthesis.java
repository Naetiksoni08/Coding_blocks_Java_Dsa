package recursion_backtracking_bitmasking_practice;

import java.util.*;

public class generate_parenthesis {

	public static void main(String[] args) {
		int n = 3;
		List<String> ll = new ArrayList<>();
		generateparenthesis(n, 0, 0, "", ll);
		System.out.println(ll);

	}

	public static void generateparenthesis(int n, int open, int close, String ans, List<String> ll) {
		if (open == n && close == n) {
//			System.out.println(ans);
			ll.add(ans);
			return;

		}
		if (open < n) {
			generateparenthesis(n, open + 1, close, ans + "(",ll);
		}
		if (close < open) {
			generateparenthesis(n, open, close + 1, ans + ")",ll);
		}

	}

}

// we have two choices open and close so we will have two recursive calls