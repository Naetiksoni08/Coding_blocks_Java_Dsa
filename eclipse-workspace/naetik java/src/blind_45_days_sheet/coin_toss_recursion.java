package blind_45_days_sheet;


public class coin_toss_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		coin_toss(n, "");
		System.out.println(count);

	}
     static int count = 0;
	public static void coin_toss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			count++;
			return;
		}
		coin_toss(n - 1, ans + "H");
		coin_toss(n - 1, ans + "T");

	}

}
