package assignment_questions;

import java.util.Scanner;

public class unique_number_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		unique(arr);

	}

	public static void unique(int[] arr) {
		int ones = 0;
		int twos = 0;
		for (int num : arr) {
			ones = (ones ^ num) & ~twos;
			twos = (twos ^ num) & ~ones;
		}
		System.out.println(ones);

	}

}
