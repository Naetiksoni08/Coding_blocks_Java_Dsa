package blind_45_days_sheet;

import java.util.Arrays;

public class check_if_strings_can_be_equal_with_operations_I {

	public static void main(String[] args) {
		String s1 = "abcd", s2 = "cdab";
		char[] even1 = { s1.charAt(0), s1.charAt(2) };
		char[] even2 = { s2.charAt(0), s2.charAt(2) };
		char[] odd1 = { s1.charAt(1), s1.charAt(3) };
		char[] odd2 = { s2.charAt(1), s2.charAt(3) };

		Arrays.sort(even1);
		Arrays.sort(even2);
		Arrays.sort(odd1);
		Arrays.sort(odd2);

		System.out.println(Arrays.equals(even1, even2) && Arrays.equals(odd1, odd2));
	}

}
