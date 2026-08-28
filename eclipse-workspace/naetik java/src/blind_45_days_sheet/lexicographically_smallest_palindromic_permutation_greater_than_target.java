package blind_45_days_sheet;

public class lexicographically_smallest_palindromic_permutation_greater_than_target {

	static char middleChar = 0;

	public static void main(String[] args) {
		String s = "baba", target = "abba";
		int n = s.length();

		int[] freq = new int[26];
		for (char c : s.toCharArray()) {
			freq[c - 'a']++;
		}

		if (!isPalindromePossible(s)) {
			System.out.println("");
			return;
		}

		int[] halfFreq = halfpool(s, freq);
		// match karo target ka char aur string ke char ko agar match kare toh theek hai
		// varna direct break kardo fir usse bada char dhundenge target sai bada
		int halflength = n / 2;
		int matchlength = 0;

		while (matchlength < halflength) {
			int targetchar = target.charAt(matchlength) - 'a';
			if (halfFreq[targetchar] > 0) {
				halfFreq[targetchar]--;
				matchlength++;
			} else {
				break;
			}

		}

		if (matchlength == halflength) {
			String Lefthalf = target.substring(0, halflength);
			StringBuilder full = new StringBuilder(Lefthalf);
			if (n % 2 == 1) {
				full.append(middleChar);
			}
			full.append(new StringBuilder(Lefthalf).reverse());
			if (full.toString().compareTo(target) > 0) {
				System.out.println(full.toString());
				return;
			}
		}

		int i = matchlength;
		int candidatePos = -1;
		int candidateChar = -1;

		while (true) {
			if (i < halflength) { // 1 < 3
				int targetChar = target.charAt(i) - 'a'; // b-a = 1
				for (int ch = targetChar + 1; ch < 26; ch++) { // 1+1 = 2 sai 26
					if (halfFreq[ch] > 0) { // if freq[2] which is c whose freq is 1 >0 yes
						candidatePos = i; // so next bada char b ke baad c hai toh posi yaad karo 2 but mila i = 1 par
											// so 2 nai 1 hogi position
						candidateChar = ch; // aur character bhi c
						break;
					}
				}
				if (candidatePos != -1) // agar loop ke baad candidate posi != -1 toh mtlb mil gaya index
					break; // mil gaya, loop se bahar niklo

			}

			if (i == 0)
				break;
			i--;

			int undoChar = target.charAt(i) - 'a';
			halfFreq[undoChar]++;
		}
		if (candidatePos == -1) {
			System.out.println("");
			return;
		}
		StringBuilder leftHalf = new StringBuilder();
		leftHalf.append(target, 0, candidatePos);
		leftHalf.append((char) ('a' + candidateChar));
		halfFreq[candidateChar]--;

		for (int ch = 0; ch < 26; ch++) {
			for (int k = 0; k < halfFreq[ch]; k++) {
				leftHalf.append((char) ('a' + ch));
			}
		}
		StringBuilder full = new StringBuilder(leftHalf);
		if (n % 2 == 1) {
			full.append(middleChar);
		}
		full.append(new StringBuilder(leftHalf).reverse());

		System.out.println(full.toString());

	}

	public static boolean isPalindromePossible(String s) {
		int n = s.length();
		int[] freq = new int[26];
		for (char c : s.toCharArray()) {
			freq[c - 'a']++;
		}
		int oddcount = 0;
		for (int i = 0; i < 26; i++) {
			if (freq[i] % 2 != 0) {
				oddcount++;
			}
		}
		if (n % 2 == 0) {
			return oddcount == 0; // agar n even hai toh fir palindrome tabhi possible hai jab oddcount 0 ho mtlb
									// har character pair mai ho
		} else {
			return oddcount == 1; // agar n odd hai toh fir palindrome tabhi possible hai jab oddcount exactly1 ho
									// taki uss element ko hum middle mai dalde
		}

	}

	public static int[] halfpool(String s, int[] freq) {
		int n = s.length();
		int[] halfreq = new int[26];
		for (int i = 0; i < 26; i++) {
			halfreq[i] = freq[i] / 2;
			if (n % 2 == 1 && freq[i] % 2 == 1) {
				middleChar = (char) ('a' + i);
			}

		}
		return halfreq;
	}

}
