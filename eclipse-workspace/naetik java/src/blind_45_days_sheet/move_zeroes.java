package blind_45_days_sheet;

public class move_zeroes {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };
		int left = 0;
		for (int right = 0; right < arr.length; right++) {
			if (arr[right] != 0) {
				arr[left] = arr[right];
				left++;// left → next non-zero element kahan rakhna hai
			}
		}
		while(left < arr.length) {
			arr[left] = 0;
			left++;
		}
		System.out.println(arr);
	}

}
