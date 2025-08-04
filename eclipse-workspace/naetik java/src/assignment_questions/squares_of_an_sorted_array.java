package assignment_questions;

import java.util.Arrays;
import java.util.Scanner;

public class squares_of_an_sorted_array{

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt(); // length of the array
		int [] arr = new int[n];
		for(int i = 0 ; i <arr.length; i++) {
			arr[i] = Sc.nextInt();
		}
		squares(arr);
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int[] squares(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
		Arrays.sort(arr);
		return arr;
	}

}





