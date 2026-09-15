package blind_45_days_sheet;

public class maximum_number_of_non_overlapping_palindrome_substring_recursion {

	public static void main(String[] args) {
		String s = "abaccdbbd";
		int k = 3;
		System.out.println(solve(0, s, k));

	}

	private static int solve(int i, String s, int k) {
		int n = s.length();
		if (i >= n) {
			return 0;
		}
		int best = solve(i + 1, s, k);
		for (int j = i + k - 1; j < n; j++) {
			if (isPalindrome(s, i, j)) {
				best = Math.max(best, 1 + solve(j + 1, s, k));

			}
		}
		return best;
	}

	public static boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
