package assignment_questions;

import java.util.Scanner;

public class majority_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i = 0 ; i < arr.length; i++ ) {
			arr[i] = sc.nextInt();
		}	
			System.out.println(majority_element(arr));
			
		}
	

	public static int majority_element(int [] arr) {
	     int c = arr[0]; 
	     int count = 1;
			for(int  i = 1 ; i<arr.length; i++) {
				if(count==0) {
					c = arr[i];
					count = 1;
				}
				if(arr[i] == c) {
					count++;
				}
				else {
					count--;
					
				}
			}
		
			return c;   

	}

}
