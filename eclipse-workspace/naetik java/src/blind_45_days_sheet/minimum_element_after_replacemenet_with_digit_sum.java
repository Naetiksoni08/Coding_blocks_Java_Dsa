package blind_45_days_sheet;

public class minimum_element_after_replacemenet_with_digit_sum {

	public static void main(String[] args) {
		int[] arr = { 10, 12, 13, 14 };
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num = num / 10;
			}
			arr[i] = sum;
			min = Math.min(arr[i], min);
		}
		System.out.println(min);
	}

}
