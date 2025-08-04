package assignment_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dictionary_order_larger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		 ArrayList<String> result = new ArrayList<>();
		dictionary(str, "", str,result); // Pass original string for comparison
		Collections.sort(result);
		for(int i = 0 ;i<result.size(); i++) {
			System.out.println(result.get(i));
		}
		
		

	}

	public static void dictionary(String str, String ans, String original,ArrayList<String> result ) {
		if (str.length() == 0) {
			if (ans.compareTo(original) < 0) {
				result.add(ans);
			}
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String leftside = str.substring(0, i);
			String rightside = str.substring(i + 1);
			dictionary(leftside + rightside, ans + ch, original,result);
		}

	}
}
