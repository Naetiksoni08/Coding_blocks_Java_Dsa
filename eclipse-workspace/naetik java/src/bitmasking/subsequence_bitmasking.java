package bitmasking;

public class subsequence_bitmasking {

	public static void main(String[] args) {
		// subsequence without recursion '
		String str = "abc";
		subsequence(str);

	}
//	public static void subsequence(String str) {
//		int n = str.length();
//		for(int i = 0 ; i < (1 << n); i++) { //  1 x 2 ki power n 
//			pattern(str,i);
//		}
//	}
//	public static void pattern(String str, int i) {
//		int posi = 0;
//		while(i>0) {
//			if((i&1)!=0) {
//				System.out.print(str.charAt(posi));
//			}
//			i = i>>1;
//		    posi++;
//		}
//		System.out.println(); //  line change
//	}

	public static void subsequence(String str) {
		int n = str.length();
		for (int i = 0; i < (1 << n); i++) { // loop chalega till 1*2 ki power 3
			print(str, i);

		}
	}

	private static void print(String str, int i) {
    int posi = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				System.out.print(str.charAt(posi));
			}
			posi++;
			i>>=1;
	
			
		}
	System.out.println();

	}
}
