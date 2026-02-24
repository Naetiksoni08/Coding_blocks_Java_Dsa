package blind_45_days_sheet;

public class minimum_moves_to_equal_array_elements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(minimum(arr));
	}

	public static int minimum(int[] arr) {
		int minimum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			minimum = Math.min(minimum, arr[i]);
		}
		int moves = 0;
		for (int i = 0; i < arr.length; i++) {
			moves += arr[i] - minimum;
		}

		return moves;

	}

}
