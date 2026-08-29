package blind_45_days_sheet;

public class maximum_valid_split_positions_1 {

	public static void main(String[] args) {
		int[] arr = { 10, 30, 15, 10 };
		int n = arr.length;
		int maxscore = findscore(arr); // option 0 that is dont remove anything
		for (int i = 0; i < n; i++) {
			int[] newarr = new int[n - 1];
			int idx = 0;
			for (int j = 0; j < n; j++) {
				if (j != i) {
					newarr[idx] = arr[j];
					idx++;
				}
			}
			maxscore = Math.max(maxscore, findscore(newarr));
		}
		System.out.println(maxscore);

	}

	private static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}

	private static int findscore(int[] arr) {
		int n = arr.length;
		if (n == 1)
			return 0;
		int[] prefixgcd = new int[n];
		prefixgcd[0] = arr[0];
		for (int i = 1; i < n; i++) {
			prefixgcd[i] = gcd(prefixgcd[i - 1], arr[i]);
		}

		int[] suffixgcd = new int[n];
		suffixgcd[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			suffixgcd[i] = gcd(suffixgcd[i + 1], arr[i]);
		}

		int score = 0;
		for (int i = 0; i < n - 1; i++) {
			if (prefixgcd[i] == suffixgcd[i + 1]) {
				score++;
			}
		}
		return score;

	}

}
