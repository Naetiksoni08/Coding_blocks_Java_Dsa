package blind_45_days_sheet;

import java.math.BigInteger;

public class additive_number_leetcode {

	public static void main(String[] args) {
		String str = "199100199";
		System.out.println(additivenumber(str));

	}

	public static boolean additivenumber(String str) {
		int n = str.length();
		if (n < 3) {
			return false;
		}
		for (int i = 1; i <= n / 2; i++) {
			if (str.charAt(0) == '0' && i > 1)
				break;

			String firstno = str.substring(0, i); // 1
			for (int j = i + 1; j < n; j++) {
				String secondno = str.substring(i, j); // 1
				if (str.charAt(i) == '0' && j - i > 1)
					break;

				BigInteger first = new BigInteger(firstno);
				BigInteger second = new BigInteger(secondno);

				if (check(str, first, second, j)) {
					return true;
				}

			}

		}
		return false;
	}

	private static boolean check(String str, BigInteger first, BigInteger second, int start) {
		if (start == str.length()) {
			return true; // successfully reached end

		}
		BigInteger sum = first.add(second);
		String startstr = String.valueOf(sum);

		// check if next number starts correctly
		if (!str.startsWith(startstr, start)) { // start will be on 3rd index now so basically 2 sai 3 tk check kar rahe
			return false;
		}
		// move forward by length of the sum number
		return check(str, second, sum, start + startstr.length());
	}

}




//class Solution {
//public boolean isAdditiveNumber(String num) {
//    return additivenumber(num);
//}
//public static boolean additivenumber(String str) {
//	int n = str.length();
//	if (n < 3) {
//		return false;
//	}
//	for (int i = 1; i <= n / 2; i++) {
//		if (str.charAt(0) == '0' && i > 1)
//			break;
//
//		String firstno = str.substring(0, i); // 1
//		for (int j = i + 1; j < n; j++) {
//			String secondno = str.substring(i, j); // 1
//			if (str.charAt(i) == '0' && j - i > 1)
//				break;
//			long first = Long.parseLong(firstno);
//			long second = Long.parseLong(secondno);
//
//			if (check(str, first, second, j)) {
//				return true;
//			}
//
//		}
//
//	}
//	return false;
//}
//
//private static boolean check(String str, long first, long second, int start) {
//	if (start == str.length()) {
//		return true; // successfully reached end
//
//	}
//	long sum = first + second; 
//	String startstr = String.valueOf(sum); 
//	
//	// check if next number starts correctly
//	if (!str.startsWith(startstr, start)) { // start will be on 3rd index now so basically 2 sai 3 tk check kar rahe
//		return false;
//	}
//	// move forward by length of the sum number
//	return check(str, second, sum, start + startstr.length());
//}
//}
