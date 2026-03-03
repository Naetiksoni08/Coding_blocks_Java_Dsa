package blind_45_days_sheet;

public class String_to_integer_atoi {

	public static void main(String[] args) {
		String s = "42";
		int i = 0;
		int sign = 1;
		long result = 0;
		// whitespace skip
		while (i < s.length() && s.charAt(i) == ' ')
			i++;
		// check signs
		if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
			if (s.charAt(i) == '-') {
				sign = -1;
			}
			i++;

		}
		while (i < s.length() && Character.isDigit(s.charAt(i))) {
			int digit = s.charAt(i) - '0'; // digit nikalo
			result = result * 10 + digit; // result banao

			// overflow check
			if (result > Integer.MAX_VALUE)
//				return (int) Integer.MAX_VALUE;
			if (result < Integer.MIN_VALUE)
//				return (int) Integer.MIN_VALUE;
			i++;
		}
		System.out.println((int) sign * result);

	}

}
