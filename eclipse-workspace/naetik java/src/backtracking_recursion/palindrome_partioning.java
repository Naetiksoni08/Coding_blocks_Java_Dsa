package backtracking_recursion;

import java.util.ArrayList;
import java.util.List;

public class palindrome_partioning {

	public static void main(String[] args) {
		String s ="nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		partition(s,ll,ans);
		System.out.println(ans);
		

	}
	public static void partition(String ques ,List<String> ll,List<List<String>> ans  ) {
		if(ques.length()==0) {
			ans.add(new ArrayList<>(ll));//copy the 1d list otherwise nothing will come 
			//System.out.println(ll);
			return;
		}
		for(int cut = 1; cut<=ques.length(); cut++) {
			String s = ques.substring(0,cut);
		  if(ispalindrome(s)) {
			ll.add(s);
			  partition(ques.substring(cut), ll,ans);
			  ll.remove(ll.size()-1); // backtracking
		  }
		}
	

	}
	public static boolean ispalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i<=j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
		}
		i++;
		j--;
	}
	return true;


   }
}
 // combination sum just like coin combination 