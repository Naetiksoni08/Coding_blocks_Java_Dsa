package blind_45_days_sheet;

public class sum_of_sqaures_of_special_element {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int n = nums.length;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) { // 4 mod 1 == 0 yes so
				sum += nums[i - 1] * nums[i - 1]; // 1*1 // converting to 0 indexed so if it is on i = 2 so 2-1 = num[1]
													// * num[1] ie 2*2 perfect 4
			}
		}
		System.out.println(sum);
	}

}
