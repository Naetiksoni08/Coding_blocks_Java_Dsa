package assignment_questions;

import java.util.*;


public class Calculate_The_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //5
		long[] arr = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong(); // 1,2,3,4,5
		}
		int query = sc.nextInt(); //2
		while (query > 0) {
			int element = sc.nextInt(); //1 fir 0
			changeArrayCalculate(element, arr);
			query--;
		}
		long sum = 0;
		for (int i = 0; i <arr.length; i++) {
			sum += arr[i];
		}
		long finalresult = (long) (sum % (Math.pow(10, 9) + 7));
		System.out.println(finalresult);
	}

	private static void changeArrayCalculate(int element, long[] arr) {
		long[] finalarray = new long[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (i - element < 0) {
				finalarray[i] = arr[i] + arr[arr.length + i - element]; // i=0 ke liye condition chali hai bas 
			} else { 
				finalarray[i] = arr[i] + arr[i - element];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = finalarray[i]; // copy the arr to the arr only
		}
	}
}
