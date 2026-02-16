package blind_45_days_sheet;

public class count_dominant_index {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3 };
		System.out.println(dominant(arr));
	}

	public static int dominant(int[] arr) {
		int count = 0;
		int avg = 0;
		int sum = 0;
		int n = arr.length;
		for (int i = 0; i <= n - 2; i++) {
			sum = 0;
			avg = 0;
			for (int j = i + 1; j < n; j++) {
				sum += arr[j];
			}
			avg += sum / (n - i - 1);
			if (arr[i] > avg) {
				count++;
			}
		}

		return count;

	}
//19-12-1=6 // 19 sai 12 ke beech mai kitne no hai 19 ya 12 ko chodh ke 
}
