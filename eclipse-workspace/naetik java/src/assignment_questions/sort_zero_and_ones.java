package assignment_questions;

import java.util.Scanner;

public class sort_zero_and_ones {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i = 0 ; i < arr.length; i++ ) {
			arr[i] = sc.nextInt();
		}	
		
		sort_zero_and_ones(arr);
			
			for(int i = 0 ; i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
		}
	}
	public static void sort_zero_and_ones(int [] arr) {
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			while(arr[left] == 0 && left<right) {
				left++;
			}
			while(arr[right] == 1 && left<right) {
				right--;
			}
               if(left<right) {
	

				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
		}
	}
}	
}


