package Dp;

import java.util.Arrays;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {10,9,2,5,3,7,101,18,6}; 
		System.out.println(LIS(arr));

	}
	public static int LIS(int []arr) {
		int [] dp = new int[arr.length]; // we made a array with length upto array 
		Arrays.fill(dp,1); // by default each value will be its own lis so we fill 1 
		for (int i = 1; i < arr.length; i++) { // loop from 1 
			for(int j  = i-1; j>=0; j--) { // and loop back from 1 so  i-1
				if(arr[j]<arr[i]) { // check if the i-1 wala element is smaller than the ith element
					int jth_lis = dp[j]; // if yes then what is the lis of the i-1 th element
					dp[i] = Math.max(dp[i], jth_lis+1); // dp[i] is ith element ka lis , i-1 element ka lis +1 kardo 
				}
			}
			
			
		}
		int max = dp[0]; // faltu ka kaam kia hai dp ka 0th element ko maximum bana kar loop laga dia
		for (int i = 1; i < dp.length; i++) {	
			max = Math.max(max, dp[i]); // joh dp[0] element ka aur upar sai joh value aah rahi hai uska maximum leke return maximum
		}
		return max;
		
	}


}
// this is bottom up solution and the time complexity for this will be n square