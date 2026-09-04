package blind_45_days_sheet;

public class smallest_stable_index_1 {
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

} // the contraints of this question was small 1 sai 100 tk tha arr.length so 1
	// operation mai 10^8 or 9 operations hote hai toh n square bhi work kar jata n
	// cube na karta
// our time complexity is pure O(n) 3 alag loops so 3n so final tc is remove constants so O(n) space is also O(n) cux prefixmax and suffixmax we made 
