package blind_45_days_sheet;

public class maximum_sum_array_sum_of_size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 3, 4, 7, 2, 6, 4, 5 };
		int k = 3;
		System.out.println(maximumarr(arr, k));

	}

	public static int maximumarr(int[] arr, int k) {
		int ans = 0;
		int sum = 0;
		for (int i = 0; i < k; i++) { // work for 1st window
			sum += arr[i];
		}
		ans = sum;

		for (int i = k; i < arr.length; i++) {
			sum += arr[i];// grow
			sum -= arr[i - k]; // shrink i = 3 k = 3 3-3 = 0 th element 2 removed now new sub array is 1,3,4
			ans = Math.max(ans, sum); // update answer
		}
		return ans;
	}
 //fixed size sliding window
}
