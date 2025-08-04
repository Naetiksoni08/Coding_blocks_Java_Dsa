package assignment_questions;

import java.util.Scanner;

public class transpose_a_matrix {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt(); // size of the matrix 5x5
		int[][]arr = new int[n][n];
		for(int i=0; i<arr.length;i++) {
			for(int j = 0 ; j<arr.length; j++) {
				arr[i][j] = Sc.nextInt();
			}
		}
		transpose(arr);
			for(int i = 0 ; i <arr.length; i++) {
				for(int j = 0 ; j<arr[0].length; j++) {
					System.out.print(arr[i][j]+ "  ");
					
				}
				System.out.println();
			}

		}
		public static void transpose(int[][]arr) {
			for(int i=0; i<arr.length;i++) {
				for(int j = i+1; j<arr[0].length;j++) { // i+1 i se ek aage se start karna h
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i]=temp;
				}
			}

	}

}
