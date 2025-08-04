package assignment_questions;

import java.util.Scanner;

public class unique_number3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0 ; i <n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(number(arr));

	}

	public static int number(int [] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result = result ^ arr[i];
		}
		return result;

	}
}
