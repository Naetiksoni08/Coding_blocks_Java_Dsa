package blind_45_days_sheet;

public class maximum_length_substring_with_two_occurences {
	public static void main(String[] args) {
		String s = "bcbbbcba";
		int[] freq = new int[26];
		int maxlen = 0;
		int left = 0;
		for (int right = 0; right < s.length(); right++) {
			freq[s.charAt(right) - 'a']++;

			while (freq[s.charAt(right) - 'a'] > 2) {
				freq[s.charAt(left) - 'a']--;
				left++;
			}

			maxlen = Math.max(maxlen, right - left + 1);
		}

		System.out.println(maxlen);
	}

}
