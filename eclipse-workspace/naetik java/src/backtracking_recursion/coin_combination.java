package backtracking_recursion;

public class coin_combination {

	public static void main(String[] args) {
		int[] coin = {2,5,3};
		int amount = 8;
		combination(coin, amount,0, "");
		

	}
	public static void combination(int[] coin, int amount,int idx, String ans) {
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		for(int i = idx ; i<coin.length; i++) {
			if(amount>=coin[i]) {
				combination(coin,amount-coin[i],i,ans+coin[i]);
			}
			 // agar hum piche se chalate toh ye permutation ho jata isliye hum aage se chala rahe h 
			
		}
	}

}
