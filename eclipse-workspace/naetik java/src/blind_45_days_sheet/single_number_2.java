package blind_45_days_sheet;

public class single_number_2 {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 2 };
		int result = 0;
		for (int i = 0; i < 32; i++) {
			int sum = 0;
			for (int a : arr) {
				sum += (a >> i) & 1;
			}
			if(sum%3!=0) {
				result |=(1<<i);
			}
		}
		System.out.println(result);

	}

}
