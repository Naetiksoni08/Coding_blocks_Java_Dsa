package blind_45_days_sheet;

public class vowel_game_in_a_string {
	public static void main(String[] args) {
		String s = "leetcoder";
		int totalvowel = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				totalvowel++;
			}
		}
		if (totalvowel > 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
