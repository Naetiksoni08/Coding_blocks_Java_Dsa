package assignment_questions;

import java.util.Scanner;

public class All_indice_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		indices_problem(arr, m, 0);

	}

	public static void indices_problem(int[] arr, int target, int idx) {
		if(idx>arr.length-1) {
			return;
		}
		if(arr[idx]==target) {
			System.out.print(idx+" ");
		}
		indices_problem(arr, target, idx+1); // this call is for traversing through whole array if we fouund the idx then return it otherwise move the idx++

	}

}
