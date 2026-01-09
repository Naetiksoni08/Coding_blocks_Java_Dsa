package assignment_questions;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		long[] arr = new long[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong();
		}
		bubble_sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void bubble_sort(long[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					long temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
