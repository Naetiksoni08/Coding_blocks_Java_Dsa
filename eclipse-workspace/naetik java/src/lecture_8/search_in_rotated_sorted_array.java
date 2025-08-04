package lecture_8;

public class search_in_rotated_sorted_array {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
		int item = 0;
		System.out.println(search(arr, item));

	}

	public static int search(int arr[], int item) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = lo+(hi - lo) / 2;
			if (arr[mid] <= item) {
				return mid;
			} else if (arr[lo] <= arr[mid]) { // upper line
				if (arr[lo] <= item && arr[mid] > item) { // 5 se bada hai but 10 se ya mid se small hai
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			} else { // lower line
				lo = mid + 1;

				if (arr[hi] >= item && arr[mid] < item) {
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}

		}
		return -1;
	}

}
