package assignment_questions;

import java.util.Scanner;

public class inverse_an_array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr =new int [n];
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		inverse(arr);
		
	   
	}
     public static void inverse(int [] arr) {
    	 int i = 1;
    	 int j = arr.length-1;
    	 while(i<j) {
    		 int temp = arr[i];
    		 arr[i] = arr[j];
    		 arr[j] = temp;
    		 i++;
    		 j--;
    	 }
     }
}
	