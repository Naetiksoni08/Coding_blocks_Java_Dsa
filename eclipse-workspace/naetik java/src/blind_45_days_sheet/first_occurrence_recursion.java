package blind_45_days_sheet;

public class first_occurrence_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 3, 5, 6, 3 };
		int item = 3;
		System.out.println(first_occ(arr, item, 0));
	}

	public static int first_occ(int[] arr, int item, int idx) {
		if (idx == arr.length) {
			return -1;
		}
		if (item == arr[idx]) {
			return idx;
		}
		return first_occ(arr, item, idx + 1); // cuz we have already checked for the oth element if 0th element par we
												// dont find the item then uske next sai search karo

	}

}
