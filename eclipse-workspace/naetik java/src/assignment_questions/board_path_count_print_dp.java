package assignment_questions;

import java.util.*;

public class board_path_count_print_dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); /// to make
		int m = sc.nextInt(); // dice faces
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		board_path(n, m, 0,"", dp);
		System.out.println();
		System.out.println(count);

	}

	static int count = 0;

	public static int board_path(int n, int m, int curr,String ans, int[] dp) {
		if (curr == n) {
			System.out.print(ans + " ");
			count++;
			return 1;
		}
		if (curr > n) {
			return 0;
		}
		if (dp[curr] != -1) {
			
		}
		int result = 0;
		for (int dice = 1; dice <= m; dice++) {
			result += board_path(n, m, curr + dice, ans+dice, dp);

		}
	    dp[curr] =result;
		return result;
		

	}

}
