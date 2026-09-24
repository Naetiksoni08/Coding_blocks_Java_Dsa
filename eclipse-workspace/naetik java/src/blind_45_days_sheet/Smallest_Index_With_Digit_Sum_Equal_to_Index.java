package blind_45_days_sheet;

public class Smallest_Index_With_Digit_Sum_Equal_to_Index {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2 };
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int sum = 0;

			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
		System.out.println(-1);
	}

}
