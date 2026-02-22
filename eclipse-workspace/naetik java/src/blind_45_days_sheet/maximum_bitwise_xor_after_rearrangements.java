package blind_45_days_sheet;

public class maximum_bitwise_xor_after_rearrangements {
	public static void main(String[] args) {
		String s = "101";
		String t = "011";
		int ones = 0, zeros = 0;
		for (char ch : t.toCharArray()) {
			if (ch == '1') {
				ones++;
			} else {
				zeros++;
			}
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0' && ones > 0) {
				ones--;
				result.append('1'); // 0^1=1 why to make another variable when we know the answer would be 1 only

			} else if (s.charAt(i) == '1' && zeros > 0) {
				zeros--;
				result.append('1');// 1^0= is also 1
			} else {
				result.append('0'); // if both s of i and t of i are equal then we only have two cases for that is
									// 1^1=0 and 0^0 = 0 both the cases have same output so just append 0

			}
		}
		System.out.println(result.toString());

	}

}
