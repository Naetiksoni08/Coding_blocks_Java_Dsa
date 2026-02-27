package blind_45_days_sheet;

public class zigzag_conversion {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int noofrow = 3;
		System.out.println(conversion(s, noofrow));
	}

	public static String conversion(String s, int row) {
		StringBuilder[] sb = new StringBuilder[row];
		for (int i = 0; i < row; i++) {
			sb[i] = new StringBuilder();
		}
		int currentrow = 0;
		boolean goingdown = true;

		for (char c : s.toCharArray()) {
			sb[currentrow].append(c);
			if (currentrow == 0)
				goingdown = true;
			if (currentrow == row - 1)
				goingdown = false;

			currentrow += goingdown ? 1 : -1;

		}
		StringBuilder result = new StringBuilder();
		for(StringBuilder ans:sb) {
			result.append(ans);
		}
		return result.toString();

	}

}
