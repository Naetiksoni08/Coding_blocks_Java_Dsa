package recursion_backtracking_bitmasking_practice;

public class nth_coin {

	public static void main(String[] args) {
		int n = 3;
		cointoss(n,"");
		System.out.println(count);
		
	}
	static int count = 0;
	public static void cointoss(int n , String ans) {
		if(n==0) {
			System.out.println(ans);
			count++;
			return;
		
		
		}
		cointoss(n-1,ans + "H");
		cointoss(n-1,ans + "T");
	}
}