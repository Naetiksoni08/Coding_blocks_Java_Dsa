package blind_45_days_sheet;

public class kadens_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, -11, 4, -1, 5 };
		System.out.println(kadens(arr));

	}

	public static int kadens(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;

	}

}
// for kadens algo just remember one thing when a investor invests in a loss making company he will first bear all the loss comes on break even and then start earning profit
//just like that when at i=1 the sum becomes 5 i=2 sum becomes -6 now after -11 adding a value doesnot make sense cuz we need to return the maximum but first the company will bear loss so we wont get maximum thats why if sum<0 then intialize sum to 0 again so once it gets -6 it sum becomes 0 again...
