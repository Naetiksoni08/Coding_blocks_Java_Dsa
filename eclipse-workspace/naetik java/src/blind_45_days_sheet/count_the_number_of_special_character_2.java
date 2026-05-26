package blind_45_days_sheet;

import java.util.Arrays;

public class count_the_number_of_special_character_2 {
	public static void main(String[] args) {
		String word = "AbBCab";

		int[] lastlower = new int[26];
		int[] firstupper = new int[26];
		Arrays.fill(lastlower, -1);
		Arrays.fill(firstupper, -1);

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isLowerCase(ch)) {
				lastlower[ch - 'a'] = i; // Chote letter ka index hamesha update karo taaki LAST index mile
			} else {
				if (firstupper[ch - 'A'] == -1) {
					firstupper[ch - 'A'] = i; // Bude letter ka index sirf PEHLI BAAR update karo (FIRST occurrence)
				}
			}
		}
		int count = 0;
		for (int i = 0; i < 26; i++) {
			if (lastlower[i] != -1 && firstupper[i] != -1 && lastlower[i] < firstupper[i]) {
				count++;
			}
			// Both last lower and first upper should not. The particular index should not
			// contain minus one because the very first demand of the question was that both
			// the letters should be in lowercase and upper case

		}
		System.out.println(count);
	}

}
