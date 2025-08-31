package Dp;

import java.util.Arrays;

public class Minimum_falling_path_sum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1000000);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, fallingpath(grid, 0, i, dp));

		}
		System.out.println(ans);

	}

	public static int fallingpath(int[][] arr, int cr, int cc, int[][] dp) {
		if (cr == arr.length - 1) { // if the value of current row gets equal to the arr.lenght then return the
									// value of cr and cc
			return arr[cr][cc];
		}
		// this time we dont need to put any base case on column cuz column will never
		// go outside the matrix because column ke upar we have applied loop on it
     if(dp[cr][cc] != -1000000) {
    	 return dp[cr][cc];
     }
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) { // no need for base case
			if (cc != i) { // this says that ki uss wale column ke box par call mt lagao jispar tum ho so
							// call jis wale box pr hum hai uske alawa hr box par jayega column mai
				ans = Math.min(ans, fallingpath(arr, cr + 1, i, dp)); // baki hum har box pr jayenge aur har box mai sai
																		// hum minimum lekar ayenge

			}

		}
		return dp[cr][cc] = ans + arr[cr][cc]; // here joh answer tha uske andar hum jis box pr we are standing we are just
									// adding the value of that box kyuki humne upar check lagagya tha ki jis par
									// aap ho apko uskko chodh kr har box pr call lagana hia toh bas end mai humne
									// jis pr hum the usko add karlia 
	}

}
