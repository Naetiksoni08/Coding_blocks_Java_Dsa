package recursion_backtracking_bitmasking_practice;

public class magic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		System.out.println(nth_magic(n));

	}

	public static int nth_magic(int n) {
		int mul = 5;
		int ans = 0;
		while (n > 0) {
			int rem = n % 2;
			ans = ans + rem * mul;
			mul = mul * 5;
			n = n >> 1;
		}
		return ans;
	}

}
