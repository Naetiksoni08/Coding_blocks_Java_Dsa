package blind_45_days_sheet;

public class Merge_close_characters {

	public static void main(String[] args) {
		String s = "abca";
		int k = 3;
		StringBuilder sb = new StringBuilder(s);
		boolean merged = true;
		while (merged) {
			merged = false;
			for (int i = 0; i < sb.length(); i++) {
				for (int j = i + 1; j <= i + k && j < sb.length(); j++) {
					if (sb.charAt(i) == sb.charAt(j)) {
						sb.deleteCharAt(j);
						merged = true;
						break;
					}

				}
				if (merged)
					break;
			}
		}
		System.out.println(sb.toString());

	}

}
