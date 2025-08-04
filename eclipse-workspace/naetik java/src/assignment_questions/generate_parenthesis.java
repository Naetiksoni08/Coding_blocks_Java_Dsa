package assignment_questions;

import java.util.Scanner;

public class generate_parenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		generateparenthesis(n, 0, 0, "");

	}

	public static void generateparenthesis(int n, int open, int close, String ans) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;

		}
		if (close < open) {
			generateparenthesis(n, open, close + 1, ans + ")");
		}
		if (open < n) {
			generateparenthesis(n, open + 1, close, ans + "(");
		}

	}

}
