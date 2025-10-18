package blind_45_days_sheet;

public class coin_toss_2 {

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
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') { // if ans ka length == 0 then call na jaye and
																		// if ans last character is equal to H then call
																		// na jaye otherwise jaye
			cointoss(n - 1, ans + "H");
		}
		cointoss(n - 1, ans + "T");

	}

}
