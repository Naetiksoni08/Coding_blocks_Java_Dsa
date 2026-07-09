package blind_45_days_sheet;

public class rearrange_characters_to_make_target_string {

	public static void main(String[] args) {
		String text = "ilovecodingonleetcode";
		String target = "code";
		int min = Integer.MAX_VALUE;
		int[] Stringfreq = new int[26];
		for (char c : text.toCharArray()) {
			Stringfreq[c - 'a']++;
		}
		int[] textFreq = new int[26];
		for (char c : target.toCharArray()) {
			textFreq[c - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if (textFreq[i] > 0) { // c=1 o=1 d=1 e=1 hoga baki sab par 0 so hume c ki freq / no of time
				int exist = Stringfreq[i] / textFreq[i];
				min = Math.min(min, exist);
			}
		}
		System.out.println(min);
	}

}
