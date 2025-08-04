package backtracking_recursion;

public class power_logn {

	public static void main(String[] args) {
		// question number 50
		int a = 3;
		int n = 4;
		System.out.println(pow(a, n));
	}

	public static int pow(int a, int n) {
		if(n == 0 ) {
			return 1;
		}
		int ans = pow(a, n / 2);
		ans = ans * ans;
		if (n % 2 != 0) {
			ans = ans * a;

		}
		return ans;
	}

}
