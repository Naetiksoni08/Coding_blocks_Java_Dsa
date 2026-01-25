package blind_45_days_sheet;

public class edit_distance {
	public static void main(String[] args) {
		String a = "Food";
		String b = "Money";
		System.out.println(distance(a, b, 0, 0));
	}

	public static int distance(String a, String b, int i, int j) {
		if (i == a.length()) {
			return b.length() - j;
		}
		if (j == b.length()) {
			return a.length() - i;
		}
		int ans = 0;
		if (a.charAt(i) == b.charAt(j)) {
			ans = distance(a, b, i + 1, j + 1);
		} else {
			int delete = distance(a, b, i + 1, j);
			int insert = distance(a, b, i, j + 1);
			int replace = distance(a, b, i + 1, j + 1);
			ans = Math.min(delete, Math.min(insert, replace)) + 1;

		}
		return ans;

	}

}
