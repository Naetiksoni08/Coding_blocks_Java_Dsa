package assignment_questions;

import java.util.Scanner;

public class reverse_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt(); // SIZE OF THE ARRAY
		long[]arr = new long[n];
		for(int i = 0 ; i < arr.length; i++ ) {
			arr[i] = sc.nextLong();
		}	
			Reverse_array(arr);
			
			for(int i = 0 ; i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
	   }	
}		
	public static void Reverse_array(long[]arr) {
		int i = 0 ; 
		int j = arr.length-1;
		while(i<j) {
			long temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
			
		}
	}

