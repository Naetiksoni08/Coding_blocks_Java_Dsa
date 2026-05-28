package blind_45_days_sheet;

public class minimum_swaps_to_zeros_to_the_end {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };
		int count = 0;
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[j] == 0) {
				j--;
			} else if (arr[i] != 0) {
				i++;
			} else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
				count++;
			}
		}
		System.out.println(count);

	}

}
