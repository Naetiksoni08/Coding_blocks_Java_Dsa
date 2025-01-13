package bitmasking;

import java.util.Arrays;
import java.util.Scanner;


public class single_number_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int [] arr = {1,2,1,3,2,5};
		System.out.println(Arrays.toString(single_number(arr))); // in built function thoda saza ke return kardia array ko 

	}
	public static int[] single_number(int[]arr) {
		int ans = 0 ;
		for(int i = 0 ; i<arr.length; i++) {
			ans = ans ^ arr[i];
		}
		int mask = (ans&(~(ans-1)));
		int a = 0;
		for(int i = 0 ; i<arr.length; i++) {
			if((arr[i] & mask) != 0) {
				a = a ^ arr[i];
			}
		}
		int b = ans ^ a;
		int [] ar = {a,b};
		return ar;// new int [] (a,b);
		
	}

}
