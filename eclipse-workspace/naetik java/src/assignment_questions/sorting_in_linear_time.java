package assignment_questions;

import java.util.Scanner;

public class sorting_in_linear_time {

	public static void main(String[] args) {
		//here we will use dutch national flag algorithm
		// always remember dnf will only be used when we have to do anything like sorting but we should have only three element in the array like her we have 0 1 2 
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int []arr = new int[n];
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}	
		sort(arr);
		for(int i = 0 ; i <arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	public static void sort(int []arr) {
		int left = 0;
		int right = arr.length-1;
		int i = 0;
		while(i<=right) {
			if(arr[i] == 0) { // i==0
				int temp = arr[i];
				arr[i] = arr[left];
				arr[left] = temp;
				left++;
				i++;
				
			}else if(arr[i] == 1) { // i==1
				i++;
			}else {// i == 2
				int temp = arr[i];
				arr[i] = arr[right];
				arr[right] = temp;
				right--;
			
			
			}

		}
	}
}
