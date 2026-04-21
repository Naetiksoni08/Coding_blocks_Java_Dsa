package blind_45_days_sheet;

public class count_sqaure_sum_triplet {

	public static void main(String[] args) {
		int n = 5;
		int count = 0;
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				int c2 = a * a + b * b;
				int c = (int) Math.sqrt(c2);
				if (c <= n && c2 == c * c) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
