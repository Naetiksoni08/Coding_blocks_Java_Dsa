package bitmasking;

public class count_set_bit {

	public static void main(String[] args) { //  duniya ka koi bhi number 2 ki unique power se bana h 
		int n = 84;
		System.out.println(countsetbit(n));
		System.out.println(fastcountsetbit(n));
		

	}
	public static int countsetbit(int n) {
		int count = 0;
		while(n>0) {
		if((n & 1) != 0) {
			count++;
			
		} 
		n>>=1; // n = n>>1;
		}
		return count;
	} // time complexity is log n coz by 2 ho raha h 
	public static int fastcountsetbit(int n) {
		// jitni set bit hai utna loop chalna chaiye 
		int count = 0 ;
		while(n>0) {
			n = (n&(n-1));
			count++;
			
		}
		return count;
	} 


}

