package lecture_8;

public class kadens_algo {

	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maximumsum(arr));
		
		}
	
	public static int maximumsum(int arr[]) {
		int ans= Integer.MIN_VALUE;
		int sum = 0 ;
		for(int i = 0 ; i<arr.length;i++) {
			sum = sum + arr[i];
			ans = Math.max(ans, sum);
			if(sum<0) {     // only these two codes are comes under kadens algo
				sum=0; // it says jab bhi mera sum negative hoga hum sum ko naye sum se start kardenge and in order to start the sum from starting we have to make sum as 0 so thats what we did 
			}
		}
		
		return ans;
		
	}
	// kadens algo is used to find maximum sub array sum 
	

}
