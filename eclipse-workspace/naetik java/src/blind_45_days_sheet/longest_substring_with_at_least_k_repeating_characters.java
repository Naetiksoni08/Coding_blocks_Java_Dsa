package blind_45_days_sheet;

public class longest_substring_with_at_least_k_repeating_characters {

	public static void main(String[] args) {
		String s = "aaabb";
		int k = 3;
		System.out.println(longest(s, k, 0, s.length()));

	}

	public static int longest(String s, int k, int start, int end) {
		if (end - start < k)
			return 0;

		int[] freq = new int[26]; // freq count hogi a:3 b:2
		for (int i = start; i < end; i++) {
			freq[s.charAt(i) - 'a']++;
		}

		boolean isvalid = true; // check karlo ki sare chars valid toh nai agar ha toh seedha length return karo
								// else break
		for (int i = 0; i < 26; i++) {
			if (freq[i] > 0 && freq[i] < k) {
				isvalid = false;
				break;
			}
		}
		if (isvalid) { // if all chars are valid then return the length
			return end - start;
		}
// if here the flow of the code comes then that means ki there are characters whose freq<k and they cannot be a part of any substring so divide and conquer on them 
		int maxLen = 0;
		int left = start;
		for (int right = start; right < end; right++) {
			if (freq[s.charAt(right) - 'a'] < k) { // if this character is poison yani it have freq<k then split
				maxLen = Math.max(maxLen, longest(s, k, left, right));

				left = right + 1;

			}

		}
		maxLen = Math.max(maxLen, longest(s, k, left, end));

		return maxLen;
	}

}
