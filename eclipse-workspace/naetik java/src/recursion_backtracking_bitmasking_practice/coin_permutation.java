package recursion_backtracking_bitmasking_practice;

public class coin_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coin = {2,3,5};
		int amount = 8;
		coin(coin , amount , "");
		
		

	}
	public static void coin(int [] coin , int amount , String ans) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i = 0 ; i<coin.length; i++) {
			if(amount>=coin[i]) { // agar amount bada hai from coin ya equal to hai then only call jayega otherwise nai jayega
				coin(coin,amount-coin[i],ans+coin[i]); // coin, for example we pick 2 so 8-2 that is amount - coin[picked] and frame the answer ans+coin[i] that is "" + 2
			}
		}
	}

}
