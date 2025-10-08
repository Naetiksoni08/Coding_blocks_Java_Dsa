package blind_45_days_sheet;

public class Search_in_rotated_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		System.out.println(search(arr, target));

	}

	public static int search(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low+high) / 2;
			if (arr[mid] == item) {
				return mid;
				// check whether the mid lies on upper line or lower line
			} else if (arr[mid] >= arr[low]) { // that means we are on upper line
				if (item >= arr[low] && arr[mid] >  item) { // inside upper line we will search in smaller area
					high = mid - 1;

				} else {
					low = mid + 1;
				}

			} else { // lower line 
				if (item <= arr[high] && arr[mid] < item) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}

			}

		}
		return -1;
	}

}
