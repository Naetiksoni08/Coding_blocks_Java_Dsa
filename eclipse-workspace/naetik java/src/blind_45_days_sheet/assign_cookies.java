package blind_45_days_sheet;

import java.util.Arrays;

public class assign_cookies {
	public static void main(String[] args) {
		int[] g = { 1, 2, 3 }, s = { 1, 1 };
		int i = 0;
		int j = 0;
		int count = 0;
		Arrays.sort(g);
		Arrays.sort(s);
		while (i < g.length && j < s.length) {
			if (s[j] >= g[i]) {
				i++;
				j++;
				count++;
			}else {
				j++;
			}
		}
		System.out.println(count);

	}

}

//We are being greedy in this question and we are trying to say that give jth cookie to ith child whose greed is less than or equal to the size of the cookie 
