package blind_45_days_sheet;

public class Subsequence_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		subsequence(str, "");
		System.out.println(count);

	}

	static int count = 0;

	public static void subsequence(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}
		char ch = str.charAt(0);
		subsequence(str.substring(1), ans);
		subsequence(str.substring(1), ans + ch);

	}

}
