package blind_45_days_sheet;

import java.util.*;

public class Combination_sum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 2, 5, 2, 1, 2 };
		int target = 5;
		Arrays.sort(coins); // we sorted the coin array too
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		combination_sum(coins, target, ll, 0, ans);
		System.out.println(ans);

	}

	public static void combination_sum(int[] coins, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
		if (amount == 0) {
			ans.add(new ArrayList<>(ll)); // copy the old array first then backtrack
			return;
		}
		for (int i = idx; i < coins.length; i++) {
			if (i > idx && coins[i] == coins[i - 1]) { // to avoid duplicate answers basically permutations we did
														// this..
				continue;
			}
			if (amount >= coins[i]) {
				ll.add(coins[i]);
				combination_sum(coins, amount - coins[i], ll, i + 1, ans); // i+1 once ensures that the element we have
																			// picked just now should not be picked in
																			// the next frame
				ll.remove(ll.size() - 1); // backtrack
			}
		}
	} // after sorting if the array consist of duplicates then they will come together
		// like this 1,2,2,4,6,6 so then i can simply do this that i == i-1 then continue
	


	
}
//
//
//public static void Combination_sum(int[]coin,int amount,String ans) {
//	if(amount==0) {
//		System.out.println(ans);
//		return;
//		
//	}
//	for (int i = 0; i < coin.length; i++) {
//		if(amount>=coin[i]) {
//			 Combination_sum(coin, amount-coin[i],ans+coin[i]);
//		}
//	}
//
//
