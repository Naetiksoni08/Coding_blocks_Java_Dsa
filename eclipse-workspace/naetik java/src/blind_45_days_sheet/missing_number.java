package blind_45_days_sheet;

public class missing_number {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5 };
		int n = 5;
		missingnumber(arr, n);
		missingnumber2(arr, n);

	}

	public static void missingnumber(int[] arr, int n) {
		int expected = n * (n + 1) / 2;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(expected - sum);

	}

	public static void missingnumber2(int[] arr, int n) {
		int x1 = 0;
		int x2 = 0;
		for (int i = 0; i < n-1; i++) {
			x1 = x1 ^ arr[i];
		}
		for (int i = 1; i <=n; i++) {
			x2 = x2^i;
		}
		System.out.println(x1^x2);
	}

}
