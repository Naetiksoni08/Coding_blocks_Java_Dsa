package blind_45_days_sheet;

public class count_rotatation_with_exactly_k_equal_adjacent_pairs {

	public static void main(String[] args) {
		String s = "aab";
		int k = 1;
		int ans = 0;
		int n = s.length();
		for (int i = 0; i < n; i++) {
			String rotated = s.substring(i) + s.substring(0, i);
			int score = 0;
			for (int j = 0; j < rotated.length()-1; j++) {
				if (rotated.charAt(j) == rotated.charAt(j + 1)) {
					score++;
				}
			}
			if (score == k) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
