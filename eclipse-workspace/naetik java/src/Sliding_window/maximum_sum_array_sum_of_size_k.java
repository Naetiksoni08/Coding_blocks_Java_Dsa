package Sliding_window;

public class maximum_sum_array_sum_of_size_k {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 7, 1, 4, 5, 6 };
		int k = 3;
		System.out.println(maximum_sum(arr, k));

	}

	public static int maximum_sum(int[] arr, int k) {
		int ans = 0;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];

		}
		ans = sum;
		for (int i = k; i < arr.length; i++) { // k se leke array ki length tak loop chalega
			sum += arr[i]; // grow
			sum -= arr[i - k]; // shrink
			ans = Math.max(ans, sum); //

		}
		return ans;

	}
}
