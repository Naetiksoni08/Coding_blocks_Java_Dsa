package recursion;

public class power_tail_recursion {

	public static void main(String[] args) {
		int n = 3;
		String ans = "";
//		printsubsequence(n, "");
//		System.out.println(count);
		System.out.println(countsubsequence(n, ""));

	}

//	static int count = 0;

	public static void printsubsequence(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
//			count++;
			return;
		}

		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') { // if last character par == h nahi hai then call
																		// jayega otherwise if last character par H hai
																		// toh call nai jayega
			printsubsequence(n - 1, ans + 'H');
		}
		printsubsequence(n - 1, ans + 'T');
	}

	public static int countsubsequence(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return 1;
		}
		int a1 = 0;
		int a2 = 0;
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			a1 = countsubsequence(n - 1, ans + 'H');
		}
		a2 = countsubsequence(n - 1, ans + 'T');

		return a1 + a2;
	}

}
// if the interviewer ask for to count the subsequence from recursion then do this the count subsequence thing other wise u can do with the static 