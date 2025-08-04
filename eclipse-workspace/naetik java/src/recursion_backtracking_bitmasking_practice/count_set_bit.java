package recursion_backtracking_bitmasking_practice;

public class count_set_bit {

	public static void main(String[] args) {
		int n = 75;
		System.out.println(count(n));
		System.out.println(fastcount(n));
		

	}
	public static int count(int n) {
		int count = 0;
		while(n>0) {
			if((n&1)!=0) {
				count++;
			}
			n = n>>1;
		}
		return count;
	}
	public static int fastcount(int n ) {
		int count = 0 ; 
		while(n>0) {
			n = (n&(n-1));
			count++;
		}
		return count;
		
	}
	// constant time complexity 
}
