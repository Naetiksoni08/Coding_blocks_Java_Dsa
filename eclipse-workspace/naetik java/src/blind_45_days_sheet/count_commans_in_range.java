package blind_45_days_sheet;

public class count_commans_in_range {
	public static void main(String[] args) {
		int n = 1002;
		int count = 0;
		if (n < 1000) {
			System.out.println(0);
		}
		if (n >= 1000) {
			count = n - 999;
		}
		System.out.println(count);
	}

}
