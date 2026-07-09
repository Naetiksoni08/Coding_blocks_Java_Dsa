package blind_45_days_sheet;

public class concatenate_a_non_zero_digits_and_multiply_by_sum_1 {
	public static void main(String[] args) {
		int n = 10203004;
		int sum = 0;
		long mul = 0;
		StringBuilder sb = new StringBuilder();
		String str = String.valueOf(n);

		for (char c : str.toCharArray()) {
			if (c != '0') {
				sb.append(c);
				int num = c - '0';
				sum += num;
			}
			String s = sb.length() == 0 ? "0" : sb.toString();
			long finalno = Long.parseLong(s);
			mul = finalno * sum;
		}
		System.out.println(mul);
	}

}
