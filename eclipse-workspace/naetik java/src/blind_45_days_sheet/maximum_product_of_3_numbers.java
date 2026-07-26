package blind_45_days_sheet;

import java.util.Arrays;

public class maximum_product_of_3_numbers {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		Arrays.sort(nums);
		int n = nums.length;
		int case1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
		int case2 = nums[0]*nums[1]*nums[n-1];
		
		System.out.println(Math.max(case1, case2));
	}
}
//space 0(1) tc nlogn 
// 2 case bane 
// agar no positive hue toh bas last ke 3 number ka product 
// but jab no negative hote hai toh fir first ke do negative no ka product becomes positive aur fir array ke sabse bada positive no ko bhi product karlo so 
//neg*neg = pos*biggestpos = positive 


