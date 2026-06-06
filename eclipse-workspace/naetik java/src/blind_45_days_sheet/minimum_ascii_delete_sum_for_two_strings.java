package blind_45_days_sheet;

import java.util.Arrays;

public class minimum_ascii_delete_sum_for_two_strings {

	public static void main(String[] args) {
		String s1 = "sea", s2 = "eat";
		int n = s1.length();
		int m = s2.length();
		int[][] dp = new int[n + 1][m + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		int total = 0;// total ascii value
		for (char c : s1.toCharArray()) {
			total += c;
		}
		for (char c : s2.toCharArray()) {
			total += c;
		}
		System.out.println(total - 2 * solve(s1, s2, n, m, dp));
	}

	public static int solve(String s1, String s2, int i, int j, int[][] dp) { //Maximum ASCII sum of Common Subsequence
		if (i == 0 || j == 0) {
			return 0; // i for s1 and j for s2 
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
			dp[i][j] = solve(s1, s2, i - 1, j - 1, dp) + s1.charAt(i - 1); // i-1 aur j-1 agar equal hai toh mtlb hai ki common subsequence mila hai 
		} else { // if characters dont match so 
			dp[i][j] = Math.max(solve(s1, s2, i - 1, j, dp), solve(s1, s2, i, j - 1, dp));
			// lets say s1="sa", s2="et" so agar match nai karta character toh 
			// 2 choices:
			//  1. s1 ka 's' skip karo → solve(i-1, j) → solve("", "e")
			//  2. s2 ka 'e' skip karo → solve(i, j-1) → solve("s", "")
		}
		return dp[i][j];
	}
	// this question is just like lcs (longest common subsequence)

}

//s1 = "sea" → 115+101+97 = 313
//s2 = "eat" → 101+97+116 = 314
//total = 313 + 314 = 627

//Common = "ea" → ASCII = 101+97 = 198
//s1 mein "ea" hai → 198 count hua total mein
//s2 mein "ea" hai → 198 phir count hua total mein
//Matlab common ka ASCII = 2 baar count hua!

//delete sum = total - 2 * commonASCII
//
//2* isliye kyunki common dono strings mein 
//ek ek baar count hua tha total mein!

// s1 ascii = 313 and s2 total ascii= 314 total = 627
// call lagegi 627 - 2*solve why 2* because 2 baar count hoga
//solve kya karta hai common subsequence ke ascii ka sum return karta hai mtlb ki s1 = sea and s2 = eat so common hua ea dono mai so olve return 198 e - 101+97 for a
// ab total = 627 ea joh hai voh 627 2 baar count hua hoga s1 ke liye alag aur s2 ke liye alag 
//s1-198 and s2-198 so 
// 627-2*198
//627-396 = 231