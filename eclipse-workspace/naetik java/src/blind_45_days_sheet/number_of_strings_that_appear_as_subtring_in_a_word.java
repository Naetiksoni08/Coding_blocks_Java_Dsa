package blind_45_days_sheet;

public class number_of_strings_that_appear_as_subtring_in_a_word {

	public static void main(String[] args) {
		String[] pattern = { "a", "abc", "bc", "d" };
		String word = "abc";
		int count = 0;
		for (String s : pattern) {
			int len = s.length();
			for (int i = 0; i <= word.length()-len; i++) {
				String str = word.substring(i, i+len);
				if(str.equals(s)) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
