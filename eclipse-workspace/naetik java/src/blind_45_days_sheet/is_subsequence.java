package blind_45_days_sheet;

public class is_subsequence {

	public static void main(String[] args) {
		String s = "ace";
		String t = "abcde";
		int i = 0;
		int j = 0;
		while (i < s.length() && j < t.length()) {

			if(s.charAt(i)==t.charAt(j)) {
				i++;
			}
			j++;
		}
		System.out.println(i==s.length());
	}

}
