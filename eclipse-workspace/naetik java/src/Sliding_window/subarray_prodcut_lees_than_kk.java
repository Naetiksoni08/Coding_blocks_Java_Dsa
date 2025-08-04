package Sliding_window;

public class subarray_prodcut_lees_than_kk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 2, 6 };
		int k = 100;
		System.out.println(subarray_product(arr, k));
	}

	public static int subarray_product(int[] arr, int k) { // varying window size
		int product = 1;
		int ans = 0;
		int si = 0;
		int ei = 0;
		while (ei < arr.length) {
			// grow
			product *= arr[ei];

			// shrink
			while (product >= k && si <= ei) {
				product = product / arr[si];
				si++;
			}

			// answer
			ans += (ei - si + 1);
			ei++;

		}
		return ans;
	}

}
