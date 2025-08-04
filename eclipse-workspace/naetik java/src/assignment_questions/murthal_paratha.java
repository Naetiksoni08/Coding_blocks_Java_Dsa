package assignment_questions;

import java.util.Arrays;
import java.util.Scanner;

public class murthal_paratha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p = sc.nextInt(); // row
		int n = sc.nextInt(); // column
		int []arr =new int[n];// mxn
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(min_time(arr,p));
	

	}
	public static int min_time(int[]arr,int p ) {
		int r = arr[arr.length-1];
		int hi  = (r *(p *(p+1))) / 2;
		int lo = 1;
		int ans = 0;
		while(lo<=hi) {
			int mid  = (lo+hi)/2;
			if(isitpossible(arr,p,mid) == true) {
				ans = mid;
				hi = mid-1;
			}else {
				lo = mid+1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] arr, int p, int time) {
		int count_paratha = 0;
		for(int i = 0 ; i <arr.length; i++) {
			count_paratha+=count_paratha(arr[i],time);
			if(count_paratha >= p) {
				return true;
			}
		}
		return false;
	}
	private static int count_paratha(int rank, int time) {
		int paratha = 1;
		int sum = 0;
		while(sum+paratha*rank<=time) {
			sum += paratha*rank;
			paratha++;
		}
		return paratha-1;
	}

}
