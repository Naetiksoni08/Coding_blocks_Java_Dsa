package dynamic_programming;

public class longest_increasing_subsequence2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(LIS(arr));
	}

	public static int LIS(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		int len = 1; // because of 0
		for (int i = 0; i < arr.length; i++) {
			if (dp[len - 1] < arr[i]) {
				dp[len] = arr[i];
				len++;
			} else {
				int idx = BinarySearch(dp, 0, len - 1, arr[i]);
				dp[idx] = arr[i];
			}
		}
		return len;

	}

	private static int BinarySearch(int[] dp, int lo, int hi, int item) {
		int idx = 0;
		while (lo <= hi) {
			int mid = lo+(hi-lo) / 2;
			if (dp[mid] >= item) {
				idx = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;

			}
		
		}

		return idx;
	}

}
