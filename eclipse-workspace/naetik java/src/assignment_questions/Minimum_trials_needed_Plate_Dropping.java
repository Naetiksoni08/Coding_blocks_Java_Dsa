package assignment_questions;

import java.util.*;

public class Minimum_trials_needed_Plate_Dropping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int k = sc.nextInt();// no of plates
			int nooffloors = sc.nextInt(); // no of floors
			int[][] dp = new int[k+1][nooffloors+1];
			for(int[]arr:dp) {
				Arrays.fill(arr, -1);
			}
			System.out.println(plate(k, nooffloors,dp));
		}

	}

	public static int plate(int nfplates, int nffloor, int[][] dp) {
		if (nffloor == 0 || nffloor == 1) {
			return nffloor;// // 0 floor → 0 trial, 1 floor → 1 trial
		}
		if (nfplates == 1) {
			return nffloor; // taki next floor ko try kr saku toh current floor return kardo
		}
		if (dp[nfplates][nffloor] != -1) {
			return dp[nfplates][nffloor];
		}

		int mintrials = Integer.MAX_VALUE;
		for (int i = 1; i <= nffloor; i++) { // current floor
			int platebreak = plate(nfplates - 1, i - 1, dp); // agar break hui toh plate bhi ek kam aur niche wale
																// floor sai try karo so current floor-1
			int notbreak = plate(nfplates, nffloor - i, dp); // plate break nai hui toh plate toh utni ki utni hi rehe
																// gai
																// lekin joh floor hai hum bolenge ki upar wale floor
																// sai
																// thro karke dekho toh n of floor +1 (i is current
																// floor
																// value so no of floor - current floor ki value)
			int worstcase = 1 + Math.max(platebreak, notbreak); // cuz ek trial hum already kr chuke hai toh thats why
																// +1
			mintrials = Math.min(mintrials, worstcase);

		}
		return dp[nfplates][nffloor] = mintrials;
	}

}
