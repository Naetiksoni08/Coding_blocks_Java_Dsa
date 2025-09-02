package assignment_questions;

import java.util.*;

public class array_target_sum_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int targetvalue = sc.nextInt();
		Arrays.sort(arr);
		targetsumpair(arr, targetvalue);

	}
	public static void targetsumpair(int []arr,int targetvalue) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==targetvalue) {
					System.out.println(arr[i]+" and "+arr[j]);
				}
				
			}
			
		}
	}

}
