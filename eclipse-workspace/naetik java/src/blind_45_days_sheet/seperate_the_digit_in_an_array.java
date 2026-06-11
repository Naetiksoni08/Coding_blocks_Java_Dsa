package blind_45_days_sheet;

import java.util.*;

public class seperate_the_digit_in_an_array {

	public static void main(String[] args) {
		int[] arr = { 13, 25, 83, 77 };
		List<Integer> result = new ArrayList<>();
		for (int a : arr) {
			String s = String.valueOf(a); // 13 -> "13"
			for (char c : s.toCharArray()) { // '1','3'
				result.add(c - '0'); // add 1 and add 3
			}

		}
		int[] ans = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			ans[i] = result.get(i);
		}
		System.out.println(ans);
	}

} // n^2 nai hai n*d hai
//n = numbers ki count n =1000 
//d = digits per number (max 9 for 10^9) max 9 hi digit honge so 9*1000 = 9000 thats why 
//TC = O(n * d)
