package assignment_questions;

import java.util.*;

public class Form_minimum_number_from_given_sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] patterns = new String[n];
		for (int i = 0; i < n; i++) {
			patterns[i] = sc.next();
		}

		for (String pattern : patterns) {
			System.out.println(getMinimumNumber(pattern));
		}
	}

	public static String getMinimumNumber(String pattern) {
		int n = pattern.length(); // n mai size store karva lia
		int[] ans = new int[n + 1]; // n+1 ka array bana dia
		Stack<Integer> st = new Stack<>(); // stack for storing the index of D strings
		int count = 1; // count initially 1

		for (int i = 0; i <= n; i++) { // loop till the end of the string
			if (i == n || pattern.charAt(i) == 'I') { // only 2 choice hai if ya toh str ka character i hai ya fir i joh hai voh length tk poch jaye
				ans[i] = count; // if i milta hai toh uspar apne current count ki value rakhdo
				count++; // aur count ++;
				
				while (!st.isEmpty()) { // jab tk stack empty nai ho jata tab tk chalega
					ans[st.pop()] = count++; // upar wali value ko pop karo aur uspar current count rakhdo
				} 
			} else { // 'D'
				st.push(i); // else d milta hai toh push kard stack mai uska index
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int num : ans) { // to convert arr to string
//			converting integer array into a single string
			sb.append(num);
		}

		return sb.toString();
	}
}
