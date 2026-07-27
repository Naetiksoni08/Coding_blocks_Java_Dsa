package blind_45_days_sheet;

public class maximum_product_of_two_elements_in_an_array {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 2 };
		int firstmax = 0;
		int secondmax = 0;
		for (int num : arr) {
			if (num > firstmax) {
				secondmax = firstmax;
				firstmax = num;
			} else if (num > secondmax) {
				secondmax = num;
			}
		}
		System.out.println((firstmax - 1) * (secondmax - 1));

	}
}
