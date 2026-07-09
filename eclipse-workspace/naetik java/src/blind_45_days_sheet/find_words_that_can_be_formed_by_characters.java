package blind_45_days_sheet;

public class find_words_that_can_be_formed_by_characters {
	public static void main(String[] args) {
		String[] words = { "cat", "bt", "hat", "tree" };
		String chars = "atach";
		int sum = 0;
		int[] freqchars = new int[26];
		for (char c : chars.toCharArray()) {
			freqchars[c - 'a']++;
		}
		for (String word : words) {
			int[] wordFreq = new int[26];// har baar new banega for each word jaise cat ke liye alag hat ke liye alag
			for (char c : word.toCharArray()) {
				wordFreq[c - 'a']++;
			}
			boolean isGood = true;
			for (int i = 0; i < 26; i++) {
				if (wordFreq[i] > freqchars[i]) { // jitne character chahiye in order to make cat voh alavaible nai hai
													// so isgood false
					isGood = false;
				}
			}
			if (isGood) {
				sum += word.length();// agar abhi true hai toh upar wala condition chli hi nai aur simply sum mai cat
										// ki length aur hat ki length add kardo
			}
		}
		System.out.println(sum);

	}
}
