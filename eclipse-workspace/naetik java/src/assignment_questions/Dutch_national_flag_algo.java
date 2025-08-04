package assignment_questions;

import java.util.Iterator;
import java.util.Scanner;

public class Dutch_national_flag_algo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i = 0 ; i <arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sort(arr);
		for(int i = 0 ;i<arr.length; i++) {
			System.out.println(arr[i]);
		}

		
	}
	public static void sort(int []arr) {
		int left =0;
		int right = arr.length-1;
		int i = 0;
		while(i<=right) {
			if(arr[i]==0) {
				int temp =arr[i];
				arr[i] = arr[left];
				arr[left] = temp;
				left++;
				i++;
				
			}
			else if(arr[i]==1) {
				i++;
			}
			else {
				int temp =arr[i];
				arr[i] = arr[right];
				arr[right] = temp;
				right--;
			}
		}
	}
//	= {2, 0, 1, 0, 1, 2, 2, 1, 1, 0, 0, 1, 2};
}
