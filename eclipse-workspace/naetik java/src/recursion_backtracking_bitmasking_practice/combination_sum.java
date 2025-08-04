package recursion_backtracking_bitmasking_practice;

import java.util.*;

public class combination_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5 };
		int amount = 8;
		List<Integer> ll = new ArrayList<>();
		print(coin, ll, amount,0);

	}

	public static void print(int[] coin, List<Integer> ll , int amount, int idx) {
		if(amount==0) {
			System.out.println(ll);
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				ll.add(coin[i]);
				print(coin, ll, amount - coin[i],i);
				ll.remove(ll.size()-1);
			}
		}
	}

}
