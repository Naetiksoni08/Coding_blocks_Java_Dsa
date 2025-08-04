package assignment_questions;

import java.util.Scanner;

public class insertion_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt(); // length of the array
		long []arr = new long[n];
		for(int i = 0 ; i < arr.length; i++ ) {
			arr[i] = sc.nextLong();
		}	
		Sort(arr);
		for(int i = 0 ;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
			
	}
	public static void Sort(long[] arr) {
		for(int i = 1; i<arr.length; i++) {
			insertlastelement(arr,i);
		}

	}
	public static void  insertlastelement(long[] arr ,int i) {
		long item = arr[i];
		int j = i-1;
		while(j>=0 && arr[j]>item) {
			arr[j+1] = arr[j]; // we are not moving 2 we are moving 8 to the right side if the 8>2 then only we are moving 8 that is the jth index to the j+1 index which means 8 is there at the jth index also at the j+1 index because we have not put the value of 2 at jth index  
			j--;
		}
		arr[j+1] = item;
	}

}
