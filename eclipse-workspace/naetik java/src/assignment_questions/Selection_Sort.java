package assignment_questions;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt(); // length of the array
		long []arr = new long[n];
		for(int i = 0 ; i < arr.length; i++ ) {
			arr[i] = sc.nextLong();
		}	
			Selection_Sort(arr);
			
			for(int i = 0 ; i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
		}
	}
	
	
	
		public static void Selection_Sort(long[] arr) {
				for(int i = 0; i <arr.length; i++) {
					int mini = mini_index(arr,i);
					long temp = arr[i];
					arr[i] = arr[mini];
					arr[mini] = temp;
			}
		}

			
			
	public static int mini_index(long []arr, int i) {
		int mini = i;
		for(int j = i+1 ; j<arr.length; j++) {
			if(arr[j] < arr[mini]) {
				mini = j;
				
			}
		}
		return mini;
		 

	}

}
