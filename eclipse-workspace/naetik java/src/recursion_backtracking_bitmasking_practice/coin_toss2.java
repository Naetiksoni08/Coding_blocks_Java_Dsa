package recursion_backtracking_bitmasking_practice;

public class coin_toss2 {

	public static void main(String[] args) {
		int n = 3;
		cointoss(n, "");
		System.out.println(count);

	}

	static int count = 0;

	public static void cointoss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			count++;
			return;

		}
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			// if last character par == h nahi hai then call jayega otherwise if last character par H hai toh call nai jayega 
			cointoss(n - 1, ans + "H");
		}
		cointoss(n - 1, ans + "T");

	}

}
