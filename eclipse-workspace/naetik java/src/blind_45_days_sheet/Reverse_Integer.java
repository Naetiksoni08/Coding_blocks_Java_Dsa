package blind_45_days_sheet;

public class Reverse_Integer {

	public static void main(String[] args) {
		int x = 123;
		int rev = 0;
		while (x != 0) {
			int digit = x % 10;
			if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
				System.out.println(0);
			}
			rev = rev * 10 + digit;
			x = x / 10;

		}
		System.out.println(rev);
	}

}
//One line: Hum pehle se jaanna chahte hain ki * 10 karne ke baad overflow hoga ya nahi — isliye condition ko /10 karke predict karte hain!
//214748365 > 2147483647 / 10
//214748365 > 214748364  → overflow hoga! return 0!
