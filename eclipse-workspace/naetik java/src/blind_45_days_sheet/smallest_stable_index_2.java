package blind_45_days_sheet;

public class smallest_stable_index_2 {

	public static void main(String[] args) {
		int[] arr = { 5, 0, 1, 4 };
		int k = 3;
		int n = arr.length;
		int[] prefixmax = new int[n];

		for (int i = 1; i < n; i++) { // left to right
			prefixmax[0] = arr[0]; // first element apne aap mai hi max hai range is 0 .. 0
			prefixmax[i] = Math.max(prefixmax[i - 1], arr[i]); // prefix[i]=max(i-1 yani pichle element ka aur aur
																// current element ka)
		} // [5,5,5,5] final prefix array

		int[] suffixmin = new int[n]; // right to left
		suffixmin[n - 1] = arr[n - 1]; // last element apne aap mai hi khudh ka min hai range [n-1...n-1]
		for (int i = n - 2; i >= 0; i--) { // last element check karlia hai toh fir n-2 sai start karo yani 1 sai
			suffixmin[i] = Math.min(suffixmin[i + 1], arr[i]); // suffixmin[i] = min of current element lets say 1 and
																// i+1 yani 4
		} // [0,0,1,4] final suffix array

		// now 5,5,5,5 and 0,0,1,4 ek ek karke minus karo
		for (int i = 0; i < n; i++) {
			if (prefixmax[i] - suffixmin[i] <= k) { // 5-0 nope 5-0 nope 5-1 nope 5-4 = 1 <=3 smallest stable index is
													// this so return 4 ka index that is 3
				System.out.println(i);
				return;
			}

		}
		System.out.println(-1);
	}
	// the second part of this question is same just the constraints are big now
	// 10^5 but our approach is very optimal so the same apporach will work here as
	// well
	// 10 ^ 8 or 9 operation in 1 second our time complexity and space is O(n) so
	// "10^5 sai chota hi hai voh", n = 10^5, aur humara algorithm O(n)
	// matlab roughly 10^5 operations (ya 3 * 10^5 teeno passes milake) karega, jo
	// 10^8 limit se kaafi kam hai — bahut comfortably pass ho jaayega, time ki koi
	// tension nahi.
}

// if i try for brute force uski tc is O(n^2) so (10^5)^2 = 10^10 operations this 
//will definately give TLE brute force approach mai basically hum phele max aur min 
//nikalenge 0 sai n-1 tk loop chalao fir ek nested loop lagao joh har index par chalega 
//yani 0 sai i tk aise hi compare karke min aur max nikal lo fir bas simply end mai max-min<=k 
//check karlo so tc hogi n^2 but space hogi O(1) thoda tradeoff hai iss apporach mai space ka
//optimized wale ki space complexity is O(n)
