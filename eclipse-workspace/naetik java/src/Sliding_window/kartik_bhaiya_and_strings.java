package Sliding_window;

public class kartik_bhaiya_and_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaabaaabaaabaaaba";
		int k = 2;
		int flipa = Maximum(str, k, 'a');
		int flipb = Maximum(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));

	}

	public static int Maximum(String str, int k, char ch) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int flip = 0;
		while (ei < str.length()) {
			// grow
			if (str.charAt(ei) == ch) {
				flip++;
			}

			// shrink
			while (flip > k && si > ei) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}

			// answer update
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;

	}

}
