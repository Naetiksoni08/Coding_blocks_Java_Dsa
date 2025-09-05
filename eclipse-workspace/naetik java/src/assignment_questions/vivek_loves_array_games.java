package assignment_questions;

import java.util.Scanner;

public class vivek_loves_array_games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			int [] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] =sc.nextInt();
			}
			int result = vivek_array_game(arr, 0, arr.length-1);
			System.out.println(result);
			t--;
		}

	}
	public static int vivek_array_game(int[]arr,int si,int ei) {
		if(si>ei) {
			return 0;
		}
		for (int mid = si; mid < ei; mid++) { // outer loop
			int sum1 = 0;
			for (int i = si; i <= mid; i++) { // inner loop
				sum1+=arr[i];
			}
			int sum2 = 0;
			for (int i = mid+1; i <=ei; i++) {
				sum2+=arr[i];
			}
			if(sum1==sum2) {
				int left = vivek_array_game(arr,si, mid); // right part ko discard karna hai 
				int right = vivek_array_game(arr, mid+1,ei); // left part ko discard karna hai  
				return Math.max(left, right)+1;
				
			}
		}
		return 0;
		
	}

}
