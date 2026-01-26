package blind_45_days_sheet;

public class minimum_falling_path_sum {
	public static void main(String[] args) {
		int[][] arr = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			ans = Math.min(ans, minimum(arr, 0, i)); // first row ke first element sai loop chalega
			// first row sai loop chalayenge toh uss case mai column vary karega thats why
			// arr[0];
		}
		System.out.println(ans);

	}

	public static int minimum(int[][] arr, int r, int c) {
		if (c < 0 || c >= arr[0].length) { // if col becomes negative or column range sai bhar chala gaya
			return Integer.MAX_VALUE;
		}
		if (r == arr.length - 1) { // why not handle for row just like col because we needed to reach any value in
									// the last row.
			return arr[r][c];
		}
		int diagonalleft = minimum(arr, r + 1, c - 1);
		int diagonalright = minimum(arr, r + 1, c + 1);
		int below = minimum(arr, r + 1, c);
		return Math.min(diagonalright, Math.min(diagonalleft, below)) + arr[r][c];

	}

}
