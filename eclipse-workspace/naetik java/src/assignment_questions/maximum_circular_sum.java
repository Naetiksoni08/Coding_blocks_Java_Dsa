package assignment_questions;

import java.util.Scanner;

public class maximum_circular_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			int [] arr = new int[n];
			for(int i = 0 ; i<arr.length; i++) {
				arr[i] = sc.nextInt();
	
			
		}

		System.out.println(maximumsum(arr));
		t--;
		}

	}
	public static int maximumsum(int[]arr) {
		int linear_sum=kadens_algo(arr);
		int sum = 0 ;
		for(int i = 0 ; i <arr.length; i++) {
			sum = sum+arr[i];
			arr[i] = arr[i] * -1;
		}
		int mid=kadens_algo(arr);
		int circular_sum = sum+mid;
		return Math.max(linear_sum , circular_sum);
	}
	public static int kadens_algo(int [] arr) {
		int ans= Integer.MIN_VALUE;
		int sum = 0 ;
		for(int i = 0 ; i<arr.length;i++) {
			sum = sum + arr[i];
			ans = Math.max(ans, sum);
			if(sum<0) {    
				sum=0; 
			}
		}
		
		return ans;
		
	}


}
