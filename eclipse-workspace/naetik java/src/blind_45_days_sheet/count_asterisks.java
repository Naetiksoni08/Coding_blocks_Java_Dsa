package blind_45_days_sheet;

public class count_asterisks {
	public static void main(String[] args) {
		String s = "l|*e*et|c**o|*de|";
		int count = 0;
		boolean isinside = false; // is the flag inside the pair if true then no count++ if flase then count++;
		for (char ch : s.toCharArray()) {
			if (ch == '|') {
				isinside = !isinside;
			} else if (ch == '*' && !isinside) {
				count++;
			}
		}
		System.out.println(count);
	}

}
