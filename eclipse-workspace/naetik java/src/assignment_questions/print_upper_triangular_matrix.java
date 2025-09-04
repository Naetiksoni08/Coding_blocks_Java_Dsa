package assignment_questions;


import java.util.Scanner;

public class print_upper_triangular_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int [n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] =sc.nextInt();
			}
			
		}
		triangular_matrix(arr);
		

	}
	public static void triangular_matrix (int[][]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i>j) {
					System.out.print("0 ");
				}else {
					System.out.print(arr[i][j]+ " ");
				}
			}
			System.out.println();
		}

	}

}
