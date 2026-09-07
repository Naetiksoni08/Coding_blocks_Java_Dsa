package blind_45_days_sheet;

import java.util.Arrays;

public class Distinct_Subsequence_2 {

	static final int MOD = 1_000_000_007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		int n = s.length();
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		int[] last = new int[n + 1]; // 3+1 = 4 size
		int[] lastseen = new int[26];
		for (int i = 1; i <= n; i++) {
			char c = s.charAt(i - 1);
			last[i] = lastseen[c - 'a']; // position i ka first occurence kis position par tha jaise agar last[2] = 1
											// hai iska mtlb hai ki position i ka character lets say a voh phele bhi
											// position 1 par dikha tha
			lastseen[c - 'a'] = i; // i last kaha kis position par dikha tha mtlb i lets say a ka last position
									// kaha tha jaise a ka 2 tha a ka 1 tha

		}
		int ans = (int) (((long) solve(n, s, last, dp) - 1 + MOD) % MOD); // for empty subsequence
		System.out.println(ans);

	}

	public static int solve(int i, String s, int[] last, int[] dp) {
		if (i == 0) {
			return 1;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		long prev = solve(i - 1, s, last, dp);
		long result;
		if (last[i] == 0) {
			result = (2 * prev) % MOD;
		} else {
			long sub = solve(last[i] - 1, s, last, dp);
			result = (2 * prev - sub + MOD) % MOD;
		}
		return dp[i] = (int) result;
	}

}

//last[i] mein store karna hai — "position i (1-indexed) pe jo character hai, wo pehle (isse turant pehle) kaha dikha tha"

//
//Trace karte hain s = "aa" pe, line by line:
//
//Shuru mein: lastSeen = [0,0,0,...,0] (26 zeros, sab characters ke liye)
//
//i=1: c = s.charAt(0) = 'a'
//
//STEP A: last[1] = lastSeen['a'-'a'] = lastSeen[0] = 0 (kyunki abhi tak kuch stored nahi tha) → last[1] = 0
//STEP B: lastSeen[0] = 1 (ab 'a' ka last known position 1 ho gaya)
//
//i=2: c = s.charAt(1) = 'a'
//
//STEP A: last[2] = lastSeen['a'-'a'] = lastSeen[0] = 1 (kyunki pichli baar humne 1 store kiya tha) → last[2] = 1
//STEP B: lastSeen[0] = 2 (ab 'a' ka last known position 2 ho gaya, future ke liye)
//
//Final last[] = [_, 0, 1] (index 0 hum use nahi karte, last[1]=0, last[2]=1)
//
//Matlab kya nikla:
//
//last[1] = 0 → position 1 ka character ('a') pehli baar aaya hai (koi purana occurrence nahi)
//last[2] = 1 → position 2 ka character ('a') pehle bhi position 1 pe dikha tha
//
//Bas yehi hai puri cheez bhai — lastSeen[] sirf ek "abhi tak ka tracker" hai (har character ka sabse recent position yaad rakhta hai), aur last[] usi tracker ko copy kar leta hai har position pe (usko update karne se PEHLE)