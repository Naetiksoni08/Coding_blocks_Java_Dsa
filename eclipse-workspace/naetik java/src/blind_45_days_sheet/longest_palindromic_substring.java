package blind_45_days_sheet;

public class longest_palindromic_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "babad";
		System.out.println(longestsubstring(str));
	}

	public static String longestsubstring(String str) {
		String ans = " ";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i ; j < str.length(); j++) {
				String a = str.substring(i, j+1);
				if (ispalindrome(a) && a.length() > ans.length()) {
                     ans = a;
				}
			}
		}
		return ans;
	}

	public static boolean ispalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}

}