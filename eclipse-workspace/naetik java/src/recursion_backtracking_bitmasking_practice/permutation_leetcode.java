package recursion_backtracking_bitmasking_practice;

import java.util.*;

public class permutation_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "123";
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		permutation(ques, ll,ans);
		System.out.println(ans);
	

	}
	
	public static void permutation(String ques , List<Integer> ll,List<List<Integer>> ans) {
		if(ques.length() == 0) {
			
//			System.out.print(ans+" ");
			  ans.add(new ArrayList<>(ll));
		
			return;
		}
		for(int i = 0 ; i<ques.length(); i++) {
			char ch = ques.charAt(i);
			String s1 = ques.substring(0, i);
			String s2 = ques.substring(i+1);
		   // ll ke andar ch ko concatenate 
			permutation(s1+s2,ll,ans);
			ll.remove(ll.size() - 1);
			
		}
		
	}
	
}
//remember this question 