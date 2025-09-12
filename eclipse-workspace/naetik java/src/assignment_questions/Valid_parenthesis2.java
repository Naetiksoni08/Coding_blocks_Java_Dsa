package assignment_questions;

import java.util.*;


public class Valid_parenthesis2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // reads the whole string even if it contains spaces
		System.out.println(valid_parenthesis(str));
	}

	public static boolean valid_parenthesis(String str) {
		 if (str.length() == 0) {
	            return true; // An empty string is considered balanced
	        }
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') { // we dont need closing bracket without oepning ones
				if (stack.isEmpty()) { // no matching parenthesis are present
					return false;
				}
				char top = stack.pop();
				if (ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{') {
					return false;
				}

			}

		}
		 return stack.isEmpty();

	}

}
