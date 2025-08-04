package assignment_questions;

import java.util.Scanner;

public class runningsumofthearray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt(); // number of element
		int [] arr =new int [n];
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // array 
		}
		runningsumofthearray(arr);
		
	}
	public static void runningsumofthearray(int[] arr) {
		int sum = 0 ;
		for(int i = 0 ; i<arr.length; i++) {
			sum = sum+arr[i];
			System.out.print(sum+" ");
		}
	}

}
