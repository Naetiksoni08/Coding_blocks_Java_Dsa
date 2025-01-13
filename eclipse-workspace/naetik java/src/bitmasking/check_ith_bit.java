package bitmasking;

public class check_ith_bit {

	public static void main(String[] args) {
		int n = 84;
		int i = 3; // position 
		// 1 is set bit and 0 is unset bit 
		// mask variable\
		System.out.println(isset(n, i));

	}
	public static boolean isset(int number, int index) {
//		int mask = (1<<i);
//		if((n & mask) != 0) {
//			return true;
//		}else {
//			return false;
//		}
//		
//	}
    int mask = 1 << index;
    return (number & mask) == 1 ;

}
}
