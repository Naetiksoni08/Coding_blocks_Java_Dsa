package blind_45_days_sheet;

public class single_element_in_a_sorted_array {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (mid % 2 == 1) { // if mid is odd then usse even bana do
				mid--;
			}
			if (arr[mid] == arr[mid + 1]) {
               low= mid+2;
			}else {
				high = mid;
			}
		}
		System.out.println(arr[low]);
	}

}
