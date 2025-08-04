package assignment_questions;

import java.util.Scanner;

public class subset_problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // Number of elements
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // Input array elements
		}
		int target = sc.nextInt(); // Target sum
		

		subset(arr, target, 0, ""); // Generate subsets
		System.out.println(count); // Print the count of valid subsets
	}

	static int count = 0;

	public static void subset(int[] arr, int target, int index, String path) {
		if (index == arr.length) {
			if (target == 0) { 
				System.out.println(path.trim());
				count++; 
			}
			return;
		}

		subset(arr, target - arr[index], index + 1, path + arr[index] + " ");

		
		subset(arr, target, index + 1, path);
	}
}
