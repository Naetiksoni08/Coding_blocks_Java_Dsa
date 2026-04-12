package blind_45_days_sheet;

import java.util.*;

public class longest_balanced_substring_after_one_swap {

	public static void main(String[] args) {
		String s = "100001";
		int count0s = 0;
		int count1s = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '0')
				count0s++;
			else
				count1s++;

		}
		System.out.println(2*Math.min(count0s, count1s));
	}

}
