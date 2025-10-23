package blind_45_days_sheet;

import java.util.*;

public class Combination_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5 };
		int amount = 8;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Combination_sum(coin, amount, 0, ll,ans);
		System.out.println(ans);
		

	}

	public static void Combination_sum(int[] coin, int amount, int idx, List<Integer> ll, List<List<Integer>> ans) {
		if (amount == 0) {
//			System.out.print(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				ll.add(coin[i]);
				Combination_sum(coin, amount - coin[i], i, ll,ans); // joh coin maine pick kia hai ussi coin ko
				ll.remove(ll.size() - 1); // aage bhi pick karunga kyuki infine supply
				// of coin tha agar nai hota toh mai i+1 hi
				// bhejta queen permutation ki tarah
			}

		}
	}

}
