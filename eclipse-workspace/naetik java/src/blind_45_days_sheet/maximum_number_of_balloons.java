package blind_45_days_sheet;

public class maximum_number_of_balloons {
	public static void main(String[] args) {
		String text = "nlaebolko";
		int[] freq = new int[26];
		for (char c : text.toCharArray()) {
			freq[c - 'a']++;
		}

		int b = freq['b' - 'a'];
		int a = freq['a' - 'a'];
		int l = freq['l' - 'a'] / 2;
		int o = freq['o' - 'a'] / 2; // because balloon mai l and o is required 2 baar
		int n = freq['n' - 'a'];

		int min = Math.min(Math.min(Math.min(Math.min(b, a), l), o), n);

		System.out.println(min);
	}

}
