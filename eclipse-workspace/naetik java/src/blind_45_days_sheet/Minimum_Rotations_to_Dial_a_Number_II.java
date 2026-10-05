package blind_45_days_sheet;

public class Minimum_Rotations_to_Dial_a_Number_II {

	public static void main(String[] args) {
		int n = 4;
		String s = "1502";
		int ans =  minRotations(s);
		System.out.println(ans);
	}

	public static int dist(int a, int b) {
		int diff = Math.abs(a - b);
		return Math.min(diff, 10 - diff);
	}

	public static int minRotations(String s) {
		int n = s.length();
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = s.charAt(i) - '0';
		}
		int[] P = new int[n + 1];
		P[0] = 0;
		for (int i = 1; i <= n; i++) {
			int from = (i == 1) ? 0 : d[i - 2];
			P[i] = P[i - 1] + dist(from, d[i - 1]);
		}

		int[] S = new int[n];
		S[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--) {
			S[i] = S[i + 1] + dist(d[i + 1], d[i]);
		}
		int ans = P[n];
		for (int k = 0; k < n; k++) {
			int lastPrefix = (k == 0) ? 0 : d[k - 1];
			int total = P[k] + dist(lastPrefix, d[n - 1]) + S[k];
			ans = Math.min(ans, total);
		}
		return ans;
	}

}
