package assignment_questions;

import java.util.*;

public class valid_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // reads the whole string even if it contains spaces
		System.out.println(valid_parenthesis(str));
	}

	public static boolean valid_parenthesis(String str) {
		Stack<Character> st = new Stack<>();
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			} else {
				if (st.isEmpty()) {
					return false; // no matching parenthesis are present
				}
				char top = st.pop();
				if (ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{') {
					return false; // basically if humara character ) yeh hai and agar top ka character is not
									// equal to ( yeh mai hai top ka character yeh nai hai yoh return false
//					Agar closing bracket ) mila hai aur stack ka top '(' nahi hai, false.
				}
			}
		}
		return st.isEmpty(); // if stack empty hai toh that means ki string valid hai there is nothing to match 

	}

}
