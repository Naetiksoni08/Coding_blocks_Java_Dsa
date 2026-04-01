package blind_45_days_sheet;

public class maximize_expression_of_3_elements {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 5 };
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];
			} else if (arr[i] > secondmax) {
				secondmax = arr[i];
			}
			min = Math.min(min, arr[i]);
		}
		System.out.println(max + secondmax - min);
	}

}
