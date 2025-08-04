package recursion_backtracking_bitmasking_practice;

import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();		
		partioning(ques,ans,ll);
		System.out.println(ans);

	}

	public static void partioning(String ques, List<List<String>> ans,List<String> ll ) {
		if (ques.length() == 0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s1 = ques.substring(0, i);
			if(ispalindrome(s1)) {
				ll.add(s1);
				partioning(ques.substring(i),ans,ll);
				ll.remove(ll.size()-1);
		}
		}
	}

	private static boolean ispalindrome(String s1) {
		// TODO Auto-generated method stub
		int i =0;
		int j = s1.length()-1;
		while(i<j) {
			if(s1.charAt(i)!=s1.charAt(j)) {
				return false;
			}
			i++;
			j--;
			
		}
;		return true;
	}

}
