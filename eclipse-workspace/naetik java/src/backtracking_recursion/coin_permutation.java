package backtracking_recursion;

public class coin_permutation {

	public static void main(String[] args) {
		int []  coin  = {2,3,5};
		int amount = 8;
		permutation(coin, amount, "");

	}
	public static void permutation( int[] coin, int amount, String ans) {
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		for(int i = 0 ; i<coin.length; i++) {
			if(amount >= coin[i]) { // amount kam h coin zada hai 
				permutation(coin, amount-coin[i] , ans+coin[i]);
			}
		}
	}

}
