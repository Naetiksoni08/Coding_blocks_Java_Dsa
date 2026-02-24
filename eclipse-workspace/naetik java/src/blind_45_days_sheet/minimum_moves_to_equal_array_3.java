package blind_45_days_sheet;

public class minimum_moves_to_equal_array_3 {

	public static void main(String[] args) {
		int[] arr = { 2,1,3 };
		System.out.println(minimummoves(arr));
	}

	public static int minimummoves(int[] arr) {
		int maximum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			maximum = Math.max(maximum, arr[i]);
		}
		int moves = 0;
		for (int i = 0; i < arr.length; i++) {
			moves += maximum-arr[i];
		}
		return moves;
	}

}
