package blind_45_days_sheet;

public class count_subarrays_with_majority_element_1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3 };
		int target = 2;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0; // jab bhi naya i start ho toh count = 0 reset karo
			for (int j = i; j < arr.length; j++) {
				if (arr[j] == target) {
					count++;
				}
				int len = j - i + 1;
				if (count > len / 2) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}

// i=0 -> {1,2,2} ans=1
// i=1 ->{2},{2,2},{2,2,3} ans=4
// i=2 -> {2} ans=5 