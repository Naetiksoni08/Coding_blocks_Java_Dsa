package backtracking_recursion;
import java.util.*;

public class combination_sum {

	public static void main(String[] args) {
		int[] coin = {2,3,5,7};
		int amount = 7;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		combination(coin, amount, ll,0, ans);
		System.out.println(ans);

	}

	public static void combination(int[] coin, int amount,List<Integer> ll ,int idx,List<List<Integer>>ans) {
		if(amount == 0) {
			// System.out.println(ll);
			ans.add(new ArrayList<>(ll)); // old array list ki value inside the new array list 
			return;
		}
		
		for(int i = idx ; i<coin.length; i++) {
			if(amount>=coin[i]) {
				ll.add(coin[i]);
				combination(coin,amount-coin[i],ll,i,ans);
				ll.remove(ll.size()-1); //  backtracking
			} // jab hum string ans leke kar rahe the tab backtracking nai lag raha tha but jab hum array lost leke kar rahe h tab backtracking lag raha h 
			
		}
	
	}
}

	
	

	

