package blind_45_days_sheet;

public class weighted_word_mapping {

	public static void main(String[] args) {
		String[] word = { "abcd", "def","xyz" };
		int[] weights = { 7, 5, 3, 4, 3, 5, 4, 9, 4, 2, 2, 7, 10, 2, 5, 10, 6, 1, 2, 2, 4, 1, 3, 4, 4, 5 };
		System.out.println(weighted(word, weights));
	}

	public static String weighted(String[] arr, int[] weights) {
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			int sum = 0;
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				int idx = ch - 'a';
				sum += weights[idx];

			}
			sum = sum % 26;
			sb.append((char)('z' - sum));

		}

		return sb.toString();
	}

}
