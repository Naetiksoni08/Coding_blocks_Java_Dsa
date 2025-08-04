package assignment_questions;

import java.util.Scanner;

public class last_index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int M = sc.nextInt();

		System.out.println(lastindex(arr, M, N-1));

	}

	public static int lastindex(int[] arr, int M, int index) {
		if(index<0) {
			return -1;
		}
		if(arr[index]==M) {
			return index;
			
		}
		return lastindex(arr,M,index-1);
	

	}

}
