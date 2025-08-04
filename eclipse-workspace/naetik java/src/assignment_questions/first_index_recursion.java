package assignment_questions;

import java.util.Arrays;
import java.util.Scanner;

public class first_index_recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int M = sc.nextInt();

		System.out.println(firstindex(arr, M, 0));

	}

	public static int firstindex(int[] arr, int M, int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==M) {
			return index;
			
		}
		return firstindex(arr,M,index+1);
	}
}