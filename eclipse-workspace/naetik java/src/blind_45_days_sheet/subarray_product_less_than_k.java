package blind_45_days_sheet;

public class subarray_product_less_than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2 };
		int k = 10;
		System.out.println(subarray(arr, k));

	}

	public static int subarray(int[] arr, int k) {
		int si = 0;
		int ei = 0;
		int product = 1;
		int count = 0;
		while (ei < arr.length) {
			// grow
			product *= arr[ei];

			// shrink
			while (product >= k && si <= ei) {
				product /= arr[si];
				si++;
			}
			// ans
			count = count + (ei - si + 1); // jitni window ki size hia na utna hi hum add karenge count mai 1 aya then 2
											// aya toh 2 hi add karenge 5 aya toh 3 hi add karenge ccuz window ki size
											// ab 3
											// hogai hai 7 aya toh windor =4 hua toh 4 hi add karenge...
			ei++;
		}
		return count;
	}

}
//19-12 = 7 ei-si
//19-12+1 = 8 ei-si+1