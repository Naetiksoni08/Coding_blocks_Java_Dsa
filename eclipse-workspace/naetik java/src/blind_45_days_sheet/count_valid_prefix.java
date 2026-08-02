package blind_45_days_sheet;

public class count_valid_prefix {
	public static void main(String[] args) {
		String s = "00101";
		int ans = 0;
		int count0 = 0;
		int count1 = 0;
		for (char c : s.toCharArray()) {
			if (c == '1') {
				count1++;
			} else {
				count0++;
			}
			if (Math.abs(count0 - count1) <= 1) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
