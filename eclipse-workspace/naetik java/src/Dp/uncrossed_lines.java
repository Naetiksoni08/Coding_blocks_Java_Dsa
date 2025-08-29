package Dp;

public class uncrossed_lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1 = {1,4,2};
		int [] arr2 = { 1,2,4};
		System.out.println(uncrossed(arr1,arr2));
		

		
	}
	public static int uncrossed(int[]s1, int[] s2) {
		int[][] dp = new int[s1.length + 1][s2.length + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s1[i-1] == s2[j-1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else { // if not matched
					int firstdelete = dp[i - 1][j]; // first string reduced
					int seconddelete = dp[i][j - 1]; // second sting reduces
					dp[i][j] = Math.max(firstdelete, seconddelete);
				}

			}

		}
		return dp[dp.length-1][dp[0].length-1];
	}


}
