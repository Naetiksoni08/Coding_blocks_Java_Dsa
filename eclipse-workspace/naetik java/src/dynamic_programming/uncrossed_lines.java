package dynamic_programming;

public class uncrossed_lines {

	public static void main(String[] args) {
		int []arr1 = {1,3,7,1,7,5};
		int [] arr2 = {1,9,2,5,1};
		

	}
		public static int longest_commonbuttomup(int [] arr1, int [] arr2) {
			int[][] dp = new int[arr1.length+1][arr2.length+1];
			for (int i = 1; i < dp.length; i++) {
				for(int j = 1;j<dp[0].length;j++) {
						int ans = 0;
						if (arr1[i-1] == arr2[j-1]) {
							dp[i][j]= 1+dp[i-1][j-1];
						} else {
							int s1 = dp[i-1][j];
							int s2 =  dp[i][j-1];
							dp[i][j] = Math.max(s1, s2);
						}
						
					}
				}
			return dp[dp.length-1][dp[0].length-1];

		}
}
