package blind_45_days_sheet;

import java.util.*;

public class Combination_sum_3_leetocde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int target = 7;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		combination_sum(k, target, 0, 0, 1, ll,ans);
		System.out.println(ans);

	}

	// npsf - number picked so far
	// sum - stores the sum so far
	// start - used for starting idx
	public static void combination_sum(int k, int target, int npsf, int sum, int start, List<Integer> ll,List<List<Integer>> ans ) {
		if (npsf == k) {
			if (sum == target) {
//				System.out.print(ll);
				ans.add(new ArrayList<>(ll)); // copy ll then do backtrack

			}
			return;
		}
		for (int i = start; i <= 9; i++) {
			ll.add(i);
			combination_sum(k, target, npsf + 1, sum + i, i + 1, ll,ans);
			ll.remove(ll.size() - 1); // backtracking

		}
	}
}

//
//import java.util.*;
//
//public class Combination_sum_3_leetocde {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int k = 3;
//		int target = 7;
//		combination_sum(k, target, 0, 0, 1, "");
//
//	}
//
//	// npsf - number picked so far
//	// sum - stores the sum so far
//	// start - used for starting idx
//	public static void combination_sum(int k, int target, int npsf, int sum, int start, String ans) {
//		if (npsf == k) {
//			if (sum == target) {
//				System.out.print(ans + " ");
//
//			}
//			return;
//		}
//		for (int i = start; i <= 9; i++) {
//			combination_sum(k, target, npsf + 1, sum + i, i + 1, ans + i + " ");
//      understand the aruguments once
//      k was the number of element we need to pick
//      target was the target we need to make
//      number picked so far tell the count of number we have picked we will at the end compare it with k to ensure that we have only picked k no of elements
//      we will check sum with target in base case
//      start basically the starting indx
//      ans empty string parameter to make concatenate the values or elements
//      IMPORTANT-- why we did i+1? because in the question it was said that we can only pick a element only once that means limited supply of coin so i+1 taki hum i wale element reuse na kar paye 
//
//		}
//	}
//}
//
