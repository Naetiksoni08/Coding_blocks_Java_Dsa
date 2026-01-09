package blind_45_days_sheet;

public class length_of_the_last_word {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(remove(s));
	}

	public static int remove(String s) {
		int i = s.length() - 1;
		int count = 0;
		while (i >= 0 && s.charAt(i) == ' ') {
			i--;

		}
		while (i >= 0 && s.charAt(i) != ' ') {
			count++;
			i--;
		}
		return count;
	}
}
