package blind_45_days_sheet;

public class third_maximum_number {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1 };
		long firstmax = Long.MIN_VALUE;
		long secondmax = Long.MIN_VALUE;
		long thirdmax = Long.MIN_VALUE; // the reason we have intialized it with long min and not integer.min is because
										// integer.min exists in the test case so it will be showing wrong answer thats
										// why
		for (int num : arr) {
			if (num == firstmax || num == secondmax || num == thirdmax) {
				continue;
			} else if (num > firstmax) {
				thirdmax = secondmax;
				secondmax = firstmax;
				firstmax = num;
			} else if (num > secondmax) {
				thirdmax = secondmax;
				secondmax = num;
			} else if (num > thirdmax) {
				thirdmax = num;
			}

		}
		// if third max doesn't exist
		if (thirdmax == Long.MIN_VALUE) {
			System.out.println(firstmax);
		} else {
			System.out.println(thirdmax);
		}
	}

}
