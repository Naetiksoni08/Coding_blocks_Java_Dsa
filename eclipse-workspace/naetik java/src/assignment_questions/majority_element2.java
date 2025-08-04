package assignment_questions;

import java.util.Scanner;

public class majority_element2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int []arr = new int[n];
	for(int i = 0 ; i < arr.length; i++ ) {
			arr[i] = sc.nextInt();
	}	
			majority_element(arr, n);
			for(int i = 0 ; i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
		}
	}
	
	public static int majority_element(int[] arr , int n) {
		
	int c = arr[0];
	int vote = 1;
	for(int i  = 1 ; i<arr.length; i++) {
		if(arr[i] == c) {
			vote++;
		}
		else {
			vote--;

			
		}
		if(vote == 0) {
			c = arr[i];
			vote=1;
			for(int j = 0 ;  i< n; i++) {
				if(arr[i] == arr[c]) {
					vote++;
				}
				
				}
			if(vote>n/2) {
				return c;
			}else {
				return -1;
			}
			
		}
		
	}
	return c;
}


}

