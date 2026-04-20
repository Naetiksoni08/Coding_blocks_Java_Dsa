package blind_45_days_sheet;

public class longest_balanced_substring_1 {

	public static void main(String[] args) {
		String s = "abbac";
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			int[] freq = new int[26];
			for (int j = i; j < s.length(); j++) {
				freq[s.charAt(j) - 'a']++; // so its like it is saying ki freq of 0 97-97 = 0 which is the index par joh bhi count
											// hai usse +1 kardo

				if (isBalanced(freq)) {
					ans = Math.max(ans, j - i + 1);
				}

			}
		}
		System.out.println(ans);
	}

	public static boolean isBalanced(int[] freq) {
		int target = 0; // resets everytime
		for (int f : freq) {
			if (f > 0) {
				if (target == 0)
					target = f;
				else if (f != target)
					return false; // mismatch!
			}
		}
		return true;
	}
}
