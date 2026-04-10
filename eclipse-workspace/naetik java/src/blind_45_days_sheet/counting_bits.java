package blind_45_days_sheet;

public class counting_bits {

	public static void main(String[] args) {
		int n = 5;
		int[] ans = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			int count = 0;
			int num = i;
			while (num != 0) {
				num = num & (num - 1);
				count++;
			}
			ans[i] = count;

		}
		System.out.println(ans);
	}
}
