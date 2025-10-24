package blind_45_days_sheet;

import java.util.*;

public class palindrome_Partitioning_leetcode {

	public static void main(String[] args) {
		String ques = "nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		partition(ques, ll,ans);
		System.out.println(ans);
	}

	public static void partition(String ques, List<String> ll,List<List<String>> ans) {
		if (ques.length() == 0) {
//			System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) { // cut starts from 1
			String s = ques.substring(0, i); // string starts from 0 // ans mai add karenge yeh
			if (ispalindrome(s)) {
				ll.add(s);
				partition(ques.substring(i), ll,ans); // ques mai add karenge yeh 1st part
				ll.remove(ll.size()-1);
			}
		}
	}

	public static boolean ispalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;

		}
		return true;
	}

}
