package blind_45_days_sheet;

public class maximum_sum_circular_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, -2, 3, -2 };
		System.out.println(maximumsum(arr));

	}

	public static int maximumsum(int[] arr) {
		int linearsum = kadens(arr); // normal array not circular
		int sum = 0; // from here we write code for circular array
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // add kardia
			arr[i] = arr[i] * -1; // this reverses the sign of all the elements - one becomes + and vice versa and
									// ye step minSubarray nikalne ke liye trick ha
		}
		int mid = kadens(arr); // then again kadens lagaya uss particular revsered array pr
		int circular_sum = sum + mid; // ab joh sum ayega voh ayega total sum - minimumsubarraysum so ab max milega
										// humee
		if (circular_sum == 0) { // all negaitve elements test case
			return linearsum;
		}
		return Math.max(linearsum, circular_sum); // lastly compare both linear arr and circular arrr and return max of
													// both
	}

	public static int kadens(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}

//totalSum = 5 + (-3) + 5 = 7
//circular_sum = totalSum + mid = 7 + 3 = 10
