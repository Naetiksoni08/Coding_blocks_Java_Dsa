package blind_45_days_sheet;

public class lexicograpical_number_leetcode {

	public static void main(String[] args) {
		int n = 1000;
		lexico(n, 0);

	}

	public static void lexico(int n, int curr) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			lexico(n, curr * 10 + i);

		}

	}

}
