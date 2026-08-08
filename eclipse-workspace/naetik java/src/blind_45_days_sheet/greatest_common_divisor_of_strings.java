package blind_45_days_sheet;

public class greatest_common_divisor_of_strings {
	public static void main(String[] args) {
		String str1 = "ABCABC", str2 = "ABC";
		if (str1.concat(str2).equals(str2.concat(str1))) {
			int s1 = str1.length();
			int s2 = str2.length();
			int gcd = GCD(s1, s2);
			System.out.println(str1.substring(0, gcd));
			return;
		}
		System.out.println("");

	}

	public static int GCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}
}

//Java mein String compare karne ke liye hamesha .equals() use karo. == sirf primitives (int, char) ke liye.
