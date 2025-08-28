package dynamic_programming;

import java.util.Arrays;

public class min_cost_climbing_stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,100,1,1,1,100,1,1,100,1};
		int [] dp = new int[arr.length+1]; 
		int zero  = min_cost(arr,0,dp); // index 
		int one  = min_cost(arr,1,dp); // index 
	   System.out.println(Math.min(zero, one));
		
	}
	public static int min_cost(int [] arr,int i,int []dp) {
		if(i>arr.length) {
			return 0;
		}
		if(dp[i] != -1) {
			return dp[i];
		}
		int f = min_cost(arr,i+1,dp);
		int s = min_cost(arr,i+2,dp);
		return  dp[i]= Math.min(f, s)+arr[i];
		
		
	}

}
