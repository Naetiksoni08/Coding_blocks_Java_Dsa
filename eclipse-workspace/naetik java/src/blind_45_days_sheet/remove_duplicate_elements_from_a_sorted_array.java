package blind_45_days_sheet;

public class remove_duplicate_elements_from_a_sorted_array {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2 };
		System.out.println(removeduplicate(arr));
	}

	public static int removeduplicate(int[] arr) {
		int i = 0;
		if (arr.length == 0 || arr.length == 1) {
			return arr[i];
		}
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];

			}
		}
		return i + 1;
	}

}
