package recursion_backtracking_bitmasking_practice;

import java.util.*;

public class coin_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5 };
		int amount = 8;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		coin(coin, amount, ll, 0,ans);
		System.out.println(ans);

	}

	public static void coin(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
		if (amount == 0) {
//			
           ans.add(new ArrayList<>(ll));
			return;
		}

		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				ll.add(coin[i]);
				coin(coin, amount - coin[i], ll, i,ans);
				ll.remove(ll.size() - 1);
			}
		}

	}

}
