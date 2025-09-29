package assignment_questions;

import java.util.*;

public class Count_Number_of_Binary_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] dp = new int[n + 1];
			Arrays.fill(dp, -1);
			System.out.println(count_number(n, dp));
		}

	}

	public static long count_number(int n, int[] dp) {
		if (n == 1) { // agar n ki length is 1 yani 0 and 1 hogai binary string to fir 2 return karo
						// kyuki 0 and 1
			return 2;
		}
		if (n == 2) { // agar n ki length 2 hai yani 00 11 01 10 toh return karo 3 why not 4 because 1
						// can not be consecutive
			return 3;
		}
		if (dp[n] != -1) {
			return dp[n];
		}
		return count_number(n - 1, dp) + count_number(n - 2, dp); // so ab agar n ki value 3 hai toh humme uske liye 2
																	// ka aur 1
		// ka relation ka sum chahiye jaise 2 ka ayega total 3
		// (00,01,10) and 1 ka ayega (0,1) so total 5 answer hoga
	}

}
