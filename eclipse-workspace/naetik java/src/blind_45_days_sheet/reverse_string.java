package blind_45_days_sheet;

import java.util.Arrays;

public class reverse_string {

	public static void main(String[] args) {
		String[] s = { "h", "e", "l", "l", "o" };
		int i = 0;
		int j = s.length - 1;
		while (i < j) {
			String temp = s[i];
			s[i] = s[j];
			s[j] = temp;

			i++;
			j--;
		}
		System.out.println(Arrays.toString(s));
	}

}
