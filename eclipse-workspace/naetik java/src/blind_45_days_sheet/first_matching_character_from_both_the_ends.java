package blind_45_days_sheet;

public class first_matching_character_from_both_the_ends {
	public static void main(String[] args) {
		String s = "abcacbd";
		System.out.println(solve(s));
	}

	public static int solve(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
			if (s.charAt(i) == s.charAt(j)) {
				return i;
			}
			i++;
			j--;
		}
		return -1;

	}

}
