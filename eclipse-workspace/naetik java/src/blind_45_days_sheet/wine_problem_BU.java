package blind_45_days_sheet;

public class wine_problem_BU {
	// these type of problems are basically future based in these types of problem
	// dp is filled diagonally
	public static void main(String[] args) {
		int[] wine = { 2, 3, 5, 1, 4 };
		System.out.println(wine(wine));
	}

	public static int wine(int[] wine) {
		int[][] dp = new int[wine.length][wine.length];
		for (int i = 0; i < dp.length; i++) { // last year problem basically 5th year
			dp[i][i] = wine[i] * wine.length; // 2*5=10,3*5=15,5*5=25,1*5=5,4*5=20
		}
		int year = wine.length - 1;
		for (int d = 1; d < wine.length; d++) { // this is for 4th 3rd 3nd and 1st year
			for (int j = d; j < dp.length; j++) {
				int i = j - d;
				int left = wine[i] * year + dp[i + 1][j];
				int right = wine[j] * year + dp[i][j - 1];
				dp[i][j] = Math.max(left, right);
			}
			year--;
		}
		return dp[0][dp[0].length - 1];

	}

}
