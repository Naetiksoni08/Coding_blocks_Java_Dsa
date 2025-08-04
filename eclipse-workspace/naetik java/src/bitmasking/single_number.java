package bitmasking;

public class single_number {

	public static void main(String[] args) {
		int[]nums = {2,2,1};
		System.out.println(print(nums));

	}
	public static int print(int [] nums) {
        int ans = 0;
        for(int i = 0; i<nums.length; i++) {
            ans=ans^nums[i];
        }
        return ans;
    }
}

