package blind_45_days_sheet;

public class palindrome_number {
	public static void main(String[] args) {
		int x = 121;
		System.out.println(ispalindrome(x));
		System.out.println(ispali(x));

	}

	public static boolean ispalindrome(int x) {
		String s = String.valueOf(x);
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

	public static boolean ispali(int x) {
		if (x < 0) {
			return false;
		}
		int original = x;
		int rev = 0;
		while (x > 0) {
			int digit = x % 10;
			rev = rev * 10 + digit;
			x = x / 10;

		}
		return original == rev;
	}

}
