package blind_45_days_sheet;

public class Factorial_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fact(n));

	}

	public static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int fn = fact(n - 1);
		return fn*n;
	}

}
