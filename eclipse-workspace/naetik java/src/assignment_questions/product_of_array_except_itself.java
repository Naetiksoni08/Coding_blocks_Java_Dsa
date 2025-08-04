package assignment_questions;

import java.util.Scanner;

public class product_of_array_except_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr =new int [size];
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans[] = product_of_array_except_itself(arr);
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(ans[i] + "  ");
		}
		
		

	}
	public static int[] product_of_array_except_itself(int arr[]) {
		int n = arr.length;
		int [] left = new int[n] ;
		left[0] = 1;
		for(int i = 1; i<arr.length; i++) {
			left[i] = left[i-1] * arr[i-1];
		}
		int[] right = new int[n];
		right[n-1] = 1;
		for(int i = n-2; i>=0; i--) {
			right[i] = right[i+1] * arr[i+1];
		}
		for(int i = 0 ; i < right.length; i++) {
			left[i] = left[i] * right[i];
		}
		return left;
		
	}

}
