package blind_45_days_sheet;

public class Binary_search {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 3, 5, 9, 12 };
		int target = 9;
		System.out.println(binarysearch(arr, target));
	}

	public static int binarysearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
