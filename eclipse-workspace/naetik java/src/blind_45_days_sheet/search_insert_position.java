package blind_45_days_sheet;

public class search_insert_position {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6 };
		int target = 5;
		System.out.println(searchitem(arr, target));
	}

	public static int searchitem(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		int ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] < item) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}

}
//Binary Search Property: Jab loop khatam hota hai (low > high), low hamesha us position pe hota
//hai jahan target hona chahiye tha ya insert hona chahiye!
