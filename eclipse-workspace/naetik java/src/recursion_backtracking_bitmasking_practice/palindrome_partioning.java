package recursion_backtracking_bitmasking_practice;
import java.util.*;

import javax.print.DocFlavor.STRING;

public class palindrome_partioning {

	public static void main(String[] args) {
		String ques = "nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		partioning(ques, ans,ll);
		System.out.print(ans);

	}

	public static void partioning(String ques,List<List<String>> ans  ,List<String> ll) {
		if (ques.length() == 0) {
//			System.out.println(ans);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			if (ispalindrome(s) == true) {
				ll.add(s);
				partioning(ques.substring(i),ans,ll);
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
