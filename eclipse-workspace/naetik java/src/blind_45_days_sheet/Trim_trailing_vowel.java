package blind_45_days_sheet;

public class Trim_trailing_vowel {

	public static void main(String[] args) {
		String s = "idea";
		int j = s.length() - 1;
		while (j >= 0) {
			char ch = s.charAt(j);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				j--;
			}else {
				break;
			}
			System.out.println(s.substring(0, j + 1));
		}
	}

}
