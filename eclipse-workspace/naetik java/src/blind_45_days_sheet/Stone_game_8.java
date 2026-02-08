package blind_45_days_sheet;

public class Stone_game_8 {
	public static void main(String[] args) {
		int[] arr = { -1, 2, -3, 4, -5 };
		int n = arr.length;
		long[] prefix = new long[n + 1];
		for (int i = 0; i < n; i++) {
			prefix[i + 1] = arr[i] + prefix[i];
		}
		// Step 2: Start from second last index
		long ans = prefix[n]; // total sum
		for (int i = n - 1; i >= 2; i--) {
			ans = Math.max(ans, prefix[i] - ans); // prefix[i] - opponent_best
		}
		System.out.println(ans);
	}
}
//meaning of this line Math.max(ans, prefix[i] - ans)
//Future best ko hi continue karo (ans) ya Future best ko hi continue karo (ans)
// Current prefix choose karo aur opponent ka best minus karo 

//another way same hi hai just some small changes in prefix arr.  
//prefix[i] = arr[i] + prefix[i-1]; and i=1 sai loop chalao then prefix[n-1] i=n-2 -> 1 

//	int n = arr.length;
//	long[] prefix = new long[n];
//	for (int i = 1; i < n; i++) {
//		prefix[i] = arr[i] + prefix[i-1];
//	}
//	// Step 2: Start from second last index
//	long ans = prefix[n-1]; // total sum
//	for (int i = n - 2; i >= 1; i--) {
//		ans = Math.max(ans,prefix[i] - ans);
//	}
//	 System.out.println(ans);
//}
