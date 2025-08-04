package recursion3;

import java.util.*;

public class board {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int dice= sc.nextInt();
		int n = 3;
		String ans = "";
		printans(n, "", 0);
		System.out.println(count);

	}

	static int count = 0;

	public static void printans(int n, String ans, int curr) {
		if (curr == n) {
			System.out.println(ans);
			count++;
			return;
		}
		if (curr > n) {
			return;
		}
		for (int dice = 1; dice <= 3; dice++) {
			printans(n, ans + dice, curr + dice);
		}
//		printans(n, ans + 1, curr + 1);
//		printans(n, ans + 2, curr + 2);
//		printans(n, ans + 3, curr + 3);
//		printans(n, ans + 4, curr + 4);
//		printans(n, ans + 5, curr + 5);
//		printans(n, ans + 6, curr + 6);

	}

}
