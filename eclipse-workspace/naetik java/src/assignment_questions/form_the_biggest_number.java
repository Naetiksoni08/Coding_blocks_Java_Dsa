package assignment_questions;

import java.util.Scanner;

public class form_the_biggest_number {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int t = Sc.nextInt(); //  test case
		while(t>0) {
			int n = Sc.nextInt(); // size of the array
			int []arr = new int[n];
			for(int i = 0 ; i < arr.length; i++ ) {
				arr[i] = Sc.nextInt();
				
			}	
			number(arr);
			for(int i = 0; i<arr.length; i++) {
				System.out.print(arr[i]);
				
			}
			System.out.println();
			t--;
			
			
		}
			
	}
		public static void number(int[] arr) {
			for(int i = 0 ; i<arr.length; i++) {
				for(int j = 0 ; j<arr.length-i-1; j++) {
					String a = String.valueOf(arr[j]);
					String b = String.valueOf(arr[j+1]);
					 if ((a + b).compareTo(b + a) < 0) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
					
				}
				
				
			}
			
		}
}
