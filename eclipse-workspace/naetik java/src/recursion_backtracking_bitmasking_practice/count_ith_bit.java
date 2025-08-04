package recursion_backtracking_bitmasking_practice;

public class count_ith_bit {

	public static void main(String[] args) {
		int n = 75;
		int i = 3;
		int mask = i>>1;
		if((n & mask) != 0) {
			System.out.println("it is set bit "); // mtlb 1 hai odd h 
 		}else {
 			System.out.println("it is unset bit"); // it is 0
 		}

	}

}
